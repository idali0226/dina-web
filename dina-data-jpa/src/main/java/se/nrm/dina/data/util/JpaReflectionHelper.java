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
import se.nrm.dina.datamodel.util.DataModelHelper;


/**
 *
 * 
 * @author idali
 */
public class JpaReflectionHelper {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private static JpaReflectionHelper instance = null;
    
    private final String DATATYPE_INT = "int";
    private final String DATATYPE_INTEGER = "java.lang.Integer";
    private final String DATATYPE_LIST = "java.util.List";
    private final String DATATYPE_DATE = "java.util.Date";
    private final String DATATYPE_BIGDECIMAL = "java.math.BigDecimal";
      
    public static synchronized JpaReflectionHelper getInstance() {
        if (instance == null) {
            instance = new JpaReflectionHelper();
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
 
//        logger.info("convertClassNameToClass : {}", classname);
        
        try {
            return Class.forName(DataModelHelper.getInstance().getENTITY_PACKAGE() + reformClassName(classname));   
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
//        logger.info("reformClassName : {}", s);
        
        if (s.length() == 0) {
            return s;
        }
        return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
    }
    
    /**
     * Creates an instance of entity of the given name
     * @param <T> 
     * @param clazz 
     * @return EntityBean
     */
    public <T extends EntityBean> T createNewInstance(Class clazz) {
        try { 
            return (T) clazz.newInstance(); 
        } catch (InstantiationException | IllegalAccessException ex) {
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
        EntityBean entity;
        try {
            entity = createNewInstance(convertClassNameToClass(entityName));
        } catch (DinaException e) {
            throw new DinaException(e.getMessage());
        } 
        return entity.getClass().getSimpleName();
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
//        logger.info("isIntField : {} -- {}", clazz, fieldName); 
        try { 
            return clazz.getDeclaredField(fieldName).getType().getName().equals(DATATYPE_INT) || 
                   clazz.getDeclaredField(fieldName).getType().getName().equals(DATATYPE_INTEGER) ;
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return isIntField(superClass, fieldName); 
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
        logger.info("isEntity : {} -- {}", clazz, fieldName);
        try {  
            return clazz.getDeclaredField(fieldName).getType().getName().contains(DataModelHelper.getInstance().getENTITY_PACKAGE());
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return isEntity(superClass, fieldName); 
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
//        logger.info("isIntField : {} -- {}", clazz, fieldName);
        try { 
            return clazz.getDeclaredField(fieldName).getType().getName().equals(DATATYPE_LIST);
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
//                return validateFields(superClass, fieldName);
                return isCollection(superClass, fieldName);
            }
        }
    }
    
        
    /**
     * Checks if the field is a java.util.date
     * @param clazz
     * @param fieldName
     * @return 
     */
    public boolean isDate(Class clazz, String fieldName) {
        logger.info("isDate : {} -- {}", clazz, fieldName);
        try { 
            return clazz.getDeclaredField(fieldName).getType().getName().equals(DATATYPE_DATE);
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return isDate(superClass, fieldName); 
            }
        }
    }

    /**
     * Checks if the field is a java.util.date
     *
     * @param clazz
     * @param fieldName
     * @return
     */
    public boolean isBigDecimal(Class clazz, String fieldName) {
        logger.info("isBigDecimal : {} -- {}", clazz, fieldName);
        try {
            return clazz.getDeclaredField(fieldName).getType().getName().equals(DATATYPE_BIGDECIMAL);
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return isBigDecimal(superClass, fieldName); 
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
            return createNewInstance(convertClassNameToClass(clazz.getDeclaredField(fieldName).getType().getSimpleName()));
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return getEntity(superClass, fieldName);
            }
        }
    }
    
    public ValueType getValueType(Class clazz, String fieldName) {
        if(isIntField(clazz, fieldName)) {
            return ValueType.INT;
        } else if(isEntity(clazz, fieldName)) {
            return ValueType.ENTITY;
        } else if(isBigDecimal(clazz, fieldName)) {
            return ValueType.BIGDECIMAL;
        } else if(isDate(clazz, fieldName)) {
            return ValueType.DATE;
        } else if(isCollection(clazz, fieldName)) {
            return ValueType.LIST;
        } else {
            return ValueType.STRING;
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

    public boolean isVersioned(Class clazz) {
        logger.info("isVersioned : {} ", clazz);
        try {  
            clazz.getDeclaredField(DataModelHelper.getInstance().getVERSION()); 
            return true;
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                return false;
            } else {
                return isVersioned(superClass);
            }
        } 
    }
    
    public Field getTimestampCreated(Class clazz) {
        logger.info("getTimestampCreated : {} ", clazz ); 
        try {  
            return clazz.getDeclaredField(DataModelHelper.getInstance().getTIME_CREAGED_FIELD()); 
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return getTimestampCreated(superClass);
            }
        } 
    }
    
    public Field getCreatedByField(Class clazz) {
        logger.info("getCreatedByField : {} ", clazz ); 
        try {  
            return clazz.getDeclaredField(DataModelHelper.getInstance().getCREATED_BY_FIELD()); 
        } catch (NoSuchFieldException e) {
            Class superClass = clazz.getSuperclass();
            if (superClass == null) {
                throw new DinaException(e.getMessage());
            } else {
                return getTimestampCreated(superClass);
            }
        } 
    }
    
    private Field[] getAllFieldsFromClazz(Class clazz) {
        return clazz.getDeclaredFields();
    }
    
    private String getIdFieldName(Field[] fields) {
        return Arrays.asList(fields)
                .stream()
                .filter(f -> f.isAnnotationPresent(Id.class))
                .findFirst()
                .get().getName();
    }
    
    
    public String getIDFieldName(Class clazz) {
        return getIdFieldName(getAllFieldsFromClazz(clazz)); 
    }
    
    
    
    
    /**
     * Find id field name for the entity bean
     *
     * @param bean
     * @return String, name of the id field of this entity bean
     */
    public String getIDFieldName(EntityBean bean) {
        return getIDField(bean).getName(); 
    }

    
    /**
     * Find id field name for the entity bean
     *
     * @param bean
     * @return String, name of the id field of this entity bean
     */
    public Field getIDField(EntityBean bean) { 
//        Field[] fields = bean.getClass().getDeclaredFields();

        return Arrays.asList(getAllFieldsFromClazz(bean.getClass()))
                .stream()
                .filter(f -> f.isAnnotationPresent(Id.class))
                .findFirst()
                .get();
    }
  
    /**
     * Checks if the String is numeric
     * @param s
     * @return 
     */    
    public boolean isNumric(String s) { 
        return StringUtils.isNumeric(s);
    } 
}
