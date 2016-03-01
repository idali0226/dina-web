/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.logic;
 
//import com.fasterxml.jackson.databind.ObjectMapper;    
import java.io.IOException;
import java.io.Serializable; 
import java.lang.reflect.Field;
import java.sql.Timestamp; 
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Predicate;     
import java.util.stream.Collectors;
import javax.ejb.EJB;
import javax.ejb.Stateless; 
import javax.ws.rs.core.MultivaluedMap; 
import org.codehaus.jackson.map.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.nrm.dina.data.exceptions.DinaException;
import se.nrm.dina.data.jpa.DinaDao;
import se.nrm.dina.logic.util.NamedQueries;
import se.nrm.dina.data.util.Util;  
import se.nrm.dina.datamodel.EntityBean; 
import se.nrm.dina.datamodel.ErrorBean;

/**
 *
 * @author idali
 * @param <T>
 */
@Stateless
public class DinaDataLogic<T extends EntityBean> implements Serializable {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private java.util.Date date;

    @EJB
    private DinaDao dao;

    public DinaDataLogic() {

    }
    
    public DinaDataLogic(DinaDao dao) {
        this.dao = dao;
    }

    /**
     * Finds all the instances of an entity
     * @param entityName
     * @return List
     */
    public List<T> findAll(String entityName) { 
        try {
            return dao.findAll(Util.getInstance().convertClassNameToClass(entityName));
        } catch (DinaException e) {
            throw new DinaException(e.getMessage());
        }
    }

    /**
     * Finds all the instances of an entity
     * @param entityName
     * @param offset
     * @param limit
     * @param minid
     * @param maxid
     * @param sort
     * @param conditions
     * @return List
     */
    public List<T> findAll(String entityName, int offset, int limit,
            int minid, int maxid, List<String> sort, Map<String, String> conditions) {
 
        entityName = Util.getInstance().validateEntityName(entityName);
        Class clazz = Util.getInstance().convertClassNameToClass(entityName);
        try {
            String strQuery = NamedQueries.getInstance()
                    .createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, sort, true, conditions);

            List<T> results = dao.findAll(clazz, strQuery, limit, conditions);
 
            return results;
        } catch (DinaException e) {
            throw new DinaException(e.getMessage());
        }
    }

    /**
     * Finds all the instances of an entity by query
     * @param entityName
     * @param map
     * @return List
     */
    public List<T> findAllBySearchCriteria(String entityName, MultivaluedMap<String, String> map) {

        logger.info("findAllBySearchCriteria : {}", map);

        entityName = Util.getInstance().validateEntityName(entityName);

        String offset = map.getFirst("offset");
        String limit = map.getFirst("limit");
        String minid = map.getFirst("minid");
        String maxid = map.getFirst("maxid");
        String orderBy = map.getFirst("orderby");
        String exact = map.getFirst("exact");
        
        boolean isExact = exact == null ? false : Boolean.valueOf(exact);
        

        List<String> orderby = new ArrayList<>();
        if (orderBy != null) {
            orderby = Arrays.asList(orderBy.split(","));
        }
          
        Map<String, String> condition = map.entrySet()
                .stream()
                .filter(filterCondition()) 
                .collect(Collectors.toMap(m -> m.getKey(), m -> m.getValue().get(0)));
  
        try {
            Class clazz = Util.getInstance().convertClassNameToClass(entityName);
            Util.getInstance().isFieldsValid(clazz, condition);

            String strQuery = NamedQueries.getInstance()
                    .createQueryFindAllWithSearchCriteria(
                            entityName,
                            clazz,
                            Integer.parseInt(offset == null ? "0" : offset),
                            Integer.parseInt(minid == null ? "0" : minid),
                            Integer.parseInt(maxid == null ? "0" : maxid),
                            orderby, isExact, condition);

            return isExact ? dao.findAll(clazz, strQuery, Integer.parseInt(limit == null ? "50" : limit), condition)
                    : dao.findAllWithFuzzSearch(clazz, strQuery, Integer.parseInt(limit == null ? "50" : limit), condition);
        } catch (DinaException e) {
            throw new DinaException("Error.  " + e.getMessage() + " is not valid field in " + entityName);
        }
    }

    private Predicate<Entry<String, List<String>>> filterCondition() {
        return s -> !s.getKey().equals("offset")
                && !s.getKey().equals("limit")
                && !s.getKey().equals("minid")
                && !s.getKey().equals("maxid")
                && !s.getKey().equals("orderby")
                && !s.getKey().equals("exact");
    }

    /**
     * Finds an entity by its database id
     *
     * @param id
     * @param entityName
     * @return T
     */
    public T findById(String id, String entityName) {
        logger.info("findById : {} -- {}", id, entityName);

        try {
            if (Util.getInstance().isNumric(id)) {
                return (T) dao.findById(Integer.parseInt(id), Util.getInstance().convertClassNameToClass(entityName));
            } else {
                return (T) dao.findByStringId(id, Util.getInstance().convertClassNameToClass(entityName));
            }
        } catch (DinaException e) {
            throw new DinaException(e.getMessage());
        }
    }

    /**
     * Finds the total number of an entity in database
     *
     * @param entityName
     * @return int
     */
    public int findEntityCount(String entityName) {

        try {
            return dao.getCountByQuery(NamedQueries.getInstance()
                    .createFindTotalCountNamedQuery(
                            Util.getInstance().convertClassNameToClass(entityName).getSimpleName()));
        } catch (DinaException e) {
            throw new DinaException(e.getMessage());
        }
    }

    /**
     * Creates an entity in database
     *
     * @param entityName
     * @param json
     * @return EntityBean
     */
    public EntityBean createEntity(String entityName, String json) {

        logger.info("createEntity : {} ", entityName);

        LocalDateTime ld = LocalDateTime.now();
        date = Timestamp.valueOf(ld);
        
        EntityBean bean;
        try {
            bean = mappObject(entityName, json);

            Field[] fields = bean.getClass().getDeclaredFields();
            Arrays.stream(fields)
                    .forEach(f -> {  
                        setValueToBean(bean, f);
                    }); 
            setTimeStampCreated(bean); 
            return dao.create(bean);
        } catch (DinaException ex) {  
            throw new DinaException(ex.getMessage(), 400); 
        } catch(Exception e) {  
            throw new DinaException();
        }
    }
 

    /**
     * Updates an entity in database
     *
     * @param entityName
     * @param json
     * @return EntityBean
     */
    public EntityBean updateEntity(String entityName, String json) {
        logger.info("updateEntity : {} -- {}", entityName, json);

        try {
            EntityBean bean = mappObject(entityName, json);
            return dao.merge(bean);
        } catch (DinaException ex) {
            throw new DinaException(ex.getMessage());
        }
    }

    private EntityBean mappObject(String entityName, String json) {

        ObjectMapper mapper = new ObjectMapper();

        EntityBean bean = null;
        try {
            bean = (EntityBean) mapper.readValue(json, Util.getInstance().convertClassNameToClass(entityName));
        } catch (IOException ex) {
            throw new DinaException(ex.getMessage());
        }
        return bean;
    }

    /**
     * Deletes an entity in database
     *
     * @param entityName
     * @param id
     */
    public void deleteEntity(String entityName, int id) {

        logger.info("deleteEntity : {} -- {}", entityName, id);

        try {
            EntityBean bean = dao.findByReference(id, Util.getInstance().convertClassNameToClass(entityName));

            if (bean != null) {
                dao.delete(bean);
            }
        } catch (DinaException e) {
            logger.error(e.getMessage());
            throw new DinaException(e.getMessage());
        }
    }

    private void setChildToBean(EntityBean parent, Field f) {
        try {
            f.setAccessible(true);
            EntityBean child = (EntityBean) f.get(parent);
            if (child != null) {
                Field field = Util.getInstance().getIDField(child);

                field.setAccessible(true); 
                if (field.get(child) != null && (Integer) field.get(child) > 0) {
                    EntityBean entity = dao.findById((Integer) field.get(child), child.getClass());
                    f.set(parent, entity);
                } else {
                    setTimeStampCreated(child);
                    f.set(parent, child); 
                    Field[] fields = child.getClass().getDeclaredFields();
                    Arrays.stream(fields)
                            .forEach(fd -> {
                                setValueToBean(child, fd);
                            }); 
                    setParentToChild(fields, child, parent);
                }  
            }
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            throw new DinaException("Save data failed.");
        }
    }

    private void setChildrenToBean(EntityBean parent, Field field) {
        logger.info("setChildrenToBean : {}", field.getName());
        try {
            field.setAccessible(true);
            List<EntityBean> children = (List) field.get(parent);
            Field[] fields;
            if (children != null && !children.isEmpty()) {
                for (EntityBean child : children) {
                    setTimeStampCreated(child);
                    fields = child.getClass().getDeclaredFields(); 
                    setParentToChild(fields, child, parent);
                }
                field.set(parent, children);

            }
        } catch (IllegalArgumentException | IllegalAccessException ex) {
            throw new DinaException("Save data failed. " + ex.getMessage());
        }
    }

    private void setParentToChild(Field[] fields, EntityBean child, EntityBean parent) {
        Arrays.asList(fields).stream()
                .forEach(f -> {
                    if (Util.getInstance().isEntity(child.getClass(), f.getName())) {
                        try {
                            setChildToBean(child, f);
                            f.setAccessible(true);
                            if (f.getName().toLowerCase().contains(parent.getClass().getSimpleName().toLowerCase())) {
                                f.set(child, parent);
                            }
                        } catch (IllegalArgumentException | IllegalAccessException ex) {
                            throw new DinaException("Save data failed. " + ex.getMessage());
                        }
                    }
                });
    }

    private void setValueToBean(EntityBean parent, Field f) {
        if (Util.getInstance().isEntity(parent.getClass(), f.getName())) {
            setChildToBean(parent, f);
        } else if (Util.getInstance().isCollection(parent.getClass(), f.getName())) {
            setChildrenToBean(parent, f);
        }
    }
    
    
    private void setTimeStampCreated(EntityBean bean) {
        Field field = Util.getInstance().getTimestampCreated(bean.getClass());
        if (field != null) {
            try {
                field.setAccessible(true);
                field.set(bean, date);
            } catch (IllegalArgumentException | IllegalAccessException ex) {
                throw new DinaException(ex.getMessage()); 
            }
        }
    }

}
