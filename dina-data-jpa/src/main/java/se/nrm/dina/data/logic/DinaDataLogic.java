/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.logic;
 
//import com.fasterxml.jackson.databind.ObjectMapper; 
import java.io.IOException;
import java.io.Serializable; 
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
import se.nrm.dina.data.util.NamedQueries;
import se.nrm.dina.data.util.Util; 
import se.nrm.dina.datamodel.EntityBean;
//import se.nrm.specify.datamodel.SpecifyBean;

/**
 *
 * @author idali
 * @param <T>
 */
@Stateless
public class DinaDataLogic<T extends EntityBean> implements Serializable {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

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
     * @return List<T> 
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
     * @return List<T>
     */
    public List<T> findAll(String entityName, int offset, int limit,
            int minid, int maxid, List<String> sort, Map<String, String> conditions) {
 
        entityName = Util.getInstance().validateEntityName(entityName);
        Class clazz = Util.getInstance().convertClassNameToClass(entityName);
        try {
            String strQuery = NamedQueries.getInstance()
                    .createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, sort, conditions);

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
     * @return List<T>
     */
    public List<T> findAllBySearchCriteria(String entityName, MultivaluedMap<String, String> map) {

        logger.info("findAllBySearchCriteria : {}", map);

        entityName = Util.getInstance().validateEntityName(entityName);

        String offset = map.getFirst("offset");
        String limit = map.getFirst("limit");
        String minid = map.getFirst("minid");
        String maxid = map.getFirst("maxid");
        String orderBy = map.getFirst("orderby");

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
                            orderby, condition);
            return dao.findAll(clazz, strQuery, Integer.parseInt(limit == null ? "50" : limit), condition); 
        } catch (DinaException e) {
            throw new DinaException("Error.  " + e.getMessage() + " is not valid field in " + entityName);
        }
    }
 
    private Predicate<Entry<String, List<String>>> filterCondition() {
        return s -> !s.getKey().equals("offset")
                    && !s.getKey().equals("limit")
                    && !s.getKey().equals("minid")
                    && !s.getKey().equals("maxid")
                    && !s.getKey().equals("orderby");
    }

    /**
     * Finds an entity by its database id
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
     * @param entityName
     * @return int
     */
    public int findEntityCount(String entityName) {

        try {
            return dao.getCountByQuery(NamedQueries.getInstance().createFindTotalCountNamedQuery(Util.getInstance().convertClassNameToClass(entityName).getSimpleName()));
        } catch (DinaException e) {
            throw new DinaException(e.getMessage());
        }
    }

    /**
     * Creates an entity in database
     * @param entityName
     * @param json
     * @return EntityBean
     */
    public EntityBean createEntity(String entityName, String json) {

        logger.info("createEntity : {} ", entityName);
 
        try {
            EntityBean bean = mappObject(entityName, json);
            return dao.create(bean);
        } catch (DinaException ex) {
            throw new DinaException(ex.getMessage());
        }

    }

    /**
     * Updates an entity in database
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
}
