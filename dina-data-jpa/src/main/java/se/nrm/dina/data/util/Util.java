/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.util;
 
import java.lang.reflect.Field;
import java.util.Arrays; 
import java.util.Map;
import java.util.function.Predicate;
import javax.persistence.Id; 
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.nrm.dina.data.exceptions.DinaException;
import se.nrm.dina.data.exceptions.ErrorMsg;
import se.nrm.dina.datamodel.EntityBean; 


/**
 *
 * 
 * @author idali
 */
public class Util {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    private final int DEFAULT_LIMIT = 50;
    private final int MAX_LIMIT = 200;
    private static Util instance = null;
    private static final String ENTITY_PACKAGE = "se.nrm.dina.datamodel.";
      
    public static synchronized Util getInstance() {
        if (instance == null) {
            instance = new Util();
        }
        return instance;
    } 
    
    /**
     * Converts entityname to class
     * 
     * @param classname
     * @return Class
     */
    public Class convertClassNameToClass(String classname) {
 
        logger.info("convertClassNameToClass : {}", classname);
        
        try {
            return Class.forName(ENTITY_PACKAGE + reformClassName(classname));   
        } catch (ClassNotFoundException ex) {   
            throw new DinaException(ErrorMsg.getInstance().getEntityNameErrorMsg());
        }  
    } 
    
    /**
     * Reforms class name to uppercase on first letter
     * @param s
     * @return 
     */
    public String reformClassName(String s) {
        logger.info("reformClassName : {}", s);
        
        if (s.length() == 0) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    /**
     * Creates an instance of entity of the given name
     * @param <T>
     * @param classname
     * @return EntityBean
     */
    public <T extends EntityBean> T createNewInstance(String classname) {
 
        try {
            Class classDefinition = Class.forName(ENTITY_PACKAGE + classname);
            return (T) classDefinition.newInstance(); 
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | NoClassDefFoundError ex) {
            throw new DinaException(ErrorMsg.getInstance().getEntityNameErrorMsg());
        }
    }
    
    /**
     * Validates if the entityname is valid
     * 
     * @param entityName
     * @return entityName
     */
    public String validateEntityName(String entityName) {
        entityName = reformClassName(entityName);
        try {
            createNewInstance(entityName);
        } catch (DinaException e) {
            throw new DinaException(e.getMessage());
        } 
        return entityName;
    }
    
    /**
     * Validates fields in one entity
     * @param clazz
     * @param map
     * @return boolean
     */
    public boolean isFieldsValid(Class clazz, Map<String, String> map) {
        try {
            return map.entrySet()
                    .stream()
                    .map(m -> m.getKey()) 
                    .allMatch(isValid(clazz));
        } catch (DinaException e) {
            throw  e;
        } 
    }
    
    private Predicate<String> isValid(Class clazz) {
        try {
            return s -> validateFields(clazz, s);
        } catch (DinaException e) {
            throw e;
        }
    }

    /**
     * Checks if the field is int of Integer
     * @param clazz
     * @param fieldName
     * @return boolean
     */
    public boolean isIntField(Class clazz, String fieldName) {
        logger.info("isIntField : {} -- {}", clazz, fieldName); 
        try { 
            return clazz.getDeclaredField(fieldName).getType().getName().equals("int") || 
                   clazz.getDeclaredField(fieldName).getType().getName().equals("java.lang.Integer") ;
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return validateFields(superClass, fieldName);
            }
        }
    }

    /**
     * Checks if the field is an Entity
     * @param clazz
     * @param fieldName
     * @return boolean
     */
    public boolean isEntity(Class clazz, String fieldName) {
        logger.info("isIntField : {} -- {}", clazz, fieldName);
        try { 
            return clazz.getDeclaredField(fieldName).getType().getName().contains(ENTITY_PACKAGE);
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return validateFields(superClass, fieldName);
            }
        }
    }
    
    /**
     * Checks if the field is a collection
     * @param clazz
     * @param fieldName
     * @return 
     */
    public boolean isCollection(Class clazz, String fieldName) {
        logger.info("isIntField : {} -- {}", clazz, fieldName);
        try { 
            return clazz.getDeclaredField(fieldName).getType().getName().equals("java.util.List");
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return validateFields(superClass, fieldName);
            }
        }
    }
    
    
    
    
    /**
     * Creates an Entity
     * @param clazz
     * @param fieldName
     * @return EntityBean
     */
    public EntityBean getEntity(Class clazz, String fieldName) {
        logger.info("getEntity : {} -- {}", clazz, fieldName);
        try { 
     
            return createNewInstance(clazz.getDeclaredField(fieldName).getType().getSimpleName());
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return getEntity(superClass, fieldName);
            }
        }
    }

    /**
     * Validates one field in an entity
     * @param clazz
     * @param fieldName
     * @return boolean
     */
    public boolean validateFields(Class clazz, String fieldName) {
        logger.info("validateFields : {} -- {}", clazz, fieldName); 
        try {  
            clazz.getDeclaredField(fieldName);
            return true;
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return validateFields(superClass, fieldName);
            }
        } 
    }

    /**
     * Find id field name for the entity bean
     *
     * @param bean
     * @return String, name of the id field of this entity bean
     */
    public String getIDFieldName(EntityBean bean) {
        Field[] fields = bean.getClass().getDeclaredFields();

        return Arrays.asList(fields)
                .stream()
                .filter(f -> f.isAnnotationPresent(Id.class))
                .findFirst()
                .get()
                .getName();
    }

    
    /**
     * Find id field name for the entity bean
     *
     * @param bean
     * @return String, name of the id field of this entity bean
     */
    public Field getIDField(EntityBean bean) {
        Field[] fields = bean.getClass().getDeclaredFields();

        return Arrays.asList(fields)
                .stream()
                .filter(f -> f.isAnnotationPresent(Id.class))
                .findFirst()
                .get();
    }
    
    
    /**
     * Find id field name for the entity bean
     *
     * @param entityName
     * @return String, name of the id field of this entity bean
     */
    public String getIDFieldName(String entityName) {
        EntityBean bean = createNewInstance(entityName);
        return getIDFieldName(bean);
    }
    
    

    
    /**
     * Checks if the String is numeric
     * @param s
     * @return 
     */    
    public boolean isNumric(String s) { 
        return StringUtils.isNumeric(s);
    }
    
    /**
     * Calculates limit 
     * @param limit
     * @return int
     */
    public int maxLimit(int limit) {
        if(limit > MAX_LIMIT) {
            return MAX_LIMIT;
        } else if(limit == 0) {
            return DEFAULT_LIMIT;
        } else {
            return limit;
        } 
    } 
}
