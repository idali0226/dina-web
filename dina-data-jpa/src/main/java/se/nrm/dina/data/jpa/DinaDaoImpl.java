/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package se.nrm.dina.data.jpa;

import java.io.Serializable;    
import java.util.ArrayList;
import java.util.List; 
import java.util.Map;  
import java.util.Set;
import javax.ejb.Stateless;   
import javax.ejb.TransactionManagement;
import javax.ejb.TransactionManagementType;
import javax.persistence.EntityManager;  
import javax.persistence.LockModeType;   
import javax.persistence.OptimisticLockException; 
import javax.persistence.PersistenceContext;
import javax.persistence.Query; 
import javax.validation.ConstraintViolation; 
import javax.validation.ConstraintViolationException;
import org.apache.commons.lang.exception.ExceptionUtils;
import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;  
import se.nrm.dina.data.exceptions.DinaException;  
import se.nrm.dina.data.util.Util;
import se.nrm.dina.datamodel.*; 

/**
 * CRUD operations to database
 *  
 * @author idali
 * @param <T>
 */ 
@Stateless 
@TransactionManagement(TransactionManagementType.CONTAINER)
public class DinaDaoImpl<T extends EntityBean> implements DinaDao<T>, Serializable  {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
  
    @PersistenceContext(unitName = "jpaPU")                  //  persistence unit connect to production database  
    private EntityManager entityManager;
    
    private Query query;

    public DinaDaoImpl() {

    }
    
    public DinaDaoImpl(EntityManager entityManager, Query query) {
        this.entityManager = entityManager;
        this.query = query; 
    } 

  
    @Override
    public List<T> findAll(Class<T> clazz) {
//        logger.info("findAll : {}", clazz);
        
        query = entityManager.createNamedQuery(clazz.getSimpleName() + ".findAll"); 
        return query.getResultList(); 
    }
    
    @Override
    public List<T> findAll(Class<T> clazz, String jpql, int limit, Map<String, String> conditions ) {
        logger.info("findAll : {} -- {}", jpql, conditions);
         
        try {
            query = createQuery(clazz, jpql, conditions);
            query.setMaxResults(Util.getInstance().maxLimit(limit));
            return query.getResultList();  
        } catch (Exception e) { 
            throw new DinaException(e.getMessage());
        }
    }
    
    
    @Override
    public List<T> findAllWithFuzzSearch(Class<T> clazz, String jpql, int limit, Map<String, String> conditions) {
        logger.info("findAll : {} -- {}", jpql, conditions);

        try {
            query = createQueryFuzzSearch(clazz, jpql, conditions);
            query.setMaxResults(Util.getInstance().maxLimit(limit));
            return query.getResultList();
        } catch (Exception e) {
            throw new DinaException(e.getMessage());
        }
    }
 
    @Override
    public T findById(int id, Class<T> clazz) {
        logger.info("findById - class : {} - id : {}", clazz, id);
 
         // Entity has no version can not have Optimistic lock
        if (clazz.getSimpleName().equals(Recordsetitem.class.getSimpleName())
                || clazz.getSimpleName().equals(Sppermission.class.getSimpleName())
                || clazz.getSimpleName().equals(Workbenchrow.class.getSimpleName())
                || clazz.getSimpleName().equals(Workbenchdataitem.class.getSimpleName())
                || clazz.getSimpleName().equals(Workbenchrowimage.class.getSimpleName())
                || clazz.getSimpleName().equals(Geoname.class.getSimpleName())) {

            return entityManager.find(clazz, id, LockModeType.PESSIMISTIC_WRITE);
        }

        T tmp = null;
        try {
            tmp = entityManager.find(clazz, id, LockModeType.OPTIMISTIC);
            entityManager.flush();
        } catch (OptimisticLockException ex) { 
            entityManager.refresh(tmp);
            logger.warn(ex.getMessage());
        } catch(Exception ex) {
            logger.warn(ex.getMessage());
        }  
        return tmp; 
    }

    @Override
    public T findByStringId(String id, Class<T> clazz) {
        logger.info("findByStringId - class : {} - id : {}", clazz, id); 

        T tmp = null;
        try {
            tmp = entityManager.find(clazz, id, LockModeType.NONE);
            entityManager.flush();
        } catch (OptimisticLockException ex) { 
            entityManager.refresh(tmp);
            logger.warn(ex.getMessage());
        } catch(Exception e) {
            logger.warn(e.getMessage()); 
        }  
        return tmp; 
    }


    @Override
    public T findByReference(int id, Class<T> clazz) {
        return entityManager.getReference(clazz, id);
    }
 
    @Override
    public T create(T entity) {
        logger.info("create(T) : {}", entity);

        T tmp = entity;
        try {
            entityManager.persist(entity);
            entityManager.flush();
            logger.info("temp : {}", tmp);     
        } catch (javax.persistence.PersistenceException ex) { 
            logger.error("PersistenceException : {}", ex.getMessage());
            if (ex.getCause() instanceof  org.hibernate.exception.ConstraintViolationException) {  
                throw new DinaException(getRootCause(ex).getMessage());
            }
        } catch (Exception e) {
            logger.error("exception : {}", e.getMessage());
        }
        return tmp;
    }

    @Override
    public T merge(T entity) {

        logger.info("merge: {}", entity);

        T tmp = entity;
        try { 
            tmp = entityManager.merge(entity); 
            entityManager.flush();                              // this one used for throwing OptimisticLockException if method called with web service
        } catch (OptimisticLockException e) { 
            logger.warn(e.getMessage());
        } catch (ConstraintViolationException e) { 
            logger.warn(e.getMessage());
            throw new DinaException(handleConstraintViolation(e));
        } catch (Exception e) {  
            logger.warn(e.getMessage());
        }  
        return tmp;
    }
    
    @Override
    public boolean updateByJPQL(String jpql ) {
//        logger.info("updateByJPQL : {} ", jpql );
        query = entityManager.createQuery(jpql);
 
        int updated = query.executeUpdate();
        return updated == 1;
    }
    
    @Override
    public T getEntityByJPQL(String jpql) {

//        logger.info("getEntityByJPQL - jpql: {}", jpql);
        query = entityManager.createQuery(jpql);
        try {
            return (T) query.getSingleResult();
        } catch (javax.persistence.NoResultException | javax.persistence.NonUniqueResultException ex) {
            logger.warn(ex.getMessage());
            return null;                        // if no result, return null
        }
    }
 
    @Override
    public int getCountByQuery(String strQuery) {

        logger.info("getCountByQuery: {} ", strQuery);
        
        Number number;
        query = entityManager.createQuery(strQuery);
        
        try {
            number = (Number) query.getSingleResult();
        } catch (Exception e) {
            return 0;
        }  
        return number.intValue();
    }

    @Override
    public void delete(T entity) {
//        logger.info("delete - {}", entity);

        try {
            entityManager.remove(entity);
            entityManager.flush();                              // this is needed for throwing internal exception
        } catch (ConstraintViolationException e) {
            logger.warn(e.getMessage());
        } catch (Exception e) {
            logger.warn(e.getMessage());
        }
    }

    /**
     * Build a namedQuery with parameters
     *
     * @param clazz
     * @param strJPQL
     * @param parameters
     * @return Query
     */
    private Query createQuery(Class clazz, String strJPQL, Map<String, String> parameters) {
        query = entityManager.createQuery(strJPQL);

        if (parameters != null) {
            parameters.entrySet()
                    .stream()
                    .forEach((entry) -> {
                        String fieldName = entry.getKey();
                        if (Util.getInstance().isIntField(clazz, fieldName)) {
                            query.setParameter(entry.getKey(), Integer.parseInt(entry.getValue()));
                        } else if (Util.getInstance().isEntity(clazz, fieldName)) {
                            query.setParameter(entry.getKey(), Integer.parseInt(entry.getValue()));
                        } else {
                            query.setParameter((String) entry.getKey(), entry.getValue());
                        }
                    });
        }
        return query;
    }
 
    /**
     * Build a namedQuery with parameters
     * 
     * @param clazz
     * @param strJPQL
     * @param parameters
     * @return Query
     */
    private Query createQueryFuzzSearch(Class clazz, String strJPQL, Map<String, String> parameters) {
        query = entityManager.createQuery(strJPQL);

        if (parameters != null) {
            parameters.entrySet()
                    .stream()
                    .forEach((entry) -> {
                        String fieldName = entry.getKey();
                        if (Util.getInstance().isIntField(clazz, fieldName)) {
                            query.setParameter(entry.getKey(), Integer.parseInt(entry.getValue()));
                        } else if (Util.getInstance().isEntity(clazz, fieldName)) {
                            query.setParameter(entry.getKey(), Integer.parseInt(entry.getValue()));
                        } else {
                            query.setParameter(entry.getKey(), "%" + entry.getValue() + "%");
                        }
                    });
        }
        return query;
    }
    
    
    
    
    public static Throwable getRootCause(final Throwable throwable) {
        final List<Throwable> list = getThrowableList(throwable);
        return list.size() < 2 ? null : (Throwable) list.get(list.size() - 1);
    }

    public static List<Throwable> getThrowableList(Throwable throwable) {
        final List<Throwable> list = new ArrayList<>();
        while (throwable != null && list.contains(throwable) == false) {
            list.add(throwable);
            throwable = ExceptionUtils.getCause(throwable);
        }
        return list;
    }
 
    
    /**
     * Method handles ConstraintViolationException. It logs exception messages,
     * entity properties with invalid values.
     *
     * @param e
     * @return 
     */
    private String handleConstraintViolation(ConstraintViolationException e) {
        logger.error("handleConstraintViolation : {}", e.getMessage());
        StringBuilder sb = new StringBuilder();

        Set<ConstraintViolation<?>> cvs = e.getConstraintViolations();
        cvs.stream().map((cv) -> { 
            logger.info("------------------------------------------------");
            return cv;
        }).map((cv) -> {
            logger.info("Violation: {}", cv.getMessage());
            return cv;
        }).map((cv) -> {
            sb.append("Violation:");
            sb.append(cv.getMessage());
            return cv;
        }).map((cv) -> {
            logger.info("Entity: {}", cv.getRootBeanClass().getSimpleName());
            return cv;
        }).map((cv) -> {
            sb.append(" - Entity: ");
            sb.append(cv.getRootBeanClass().getSimpleName());
            return cv;
        }).map((cv) -> {
            if (cv.getLeafBean() != null && cv.getRootBean() != cv.getLeafBean()) {
                logger.info("Embeddable: {}", cv.getLeafBean().getClass().getSimpleName());
                sb.append(" - Embeddable: ");
                sb.append(cv.getLeafBean().getClass().getSimpleName());
            }
            return cv;
        }).map((cv) -> {
            logger.info("Attribute: {}", cv.getPropertyPath());
            return cv;
        }).map((cv) -> {
            sb.append(" - Attribute: ");
            sb.append(cv.getPropertyPath());
            return cv;
        }).map((cv) -> {
            logger.info("Invalid value: {}", cv.getInvalidValue());
            return cv;
        }).forEach((cv) -> {
            sb.append(" - Invalid value: ");
            sb.append(cv.getInvalidValue());
        });
        return sb.toString();
    } 
}
