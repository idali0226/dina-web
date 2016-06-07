/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.util;
  
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertSame;
import static org.junit.Assert.assertTrue;
import org.junit.BeforeClass;
import org.junit.Test;   
import se.nrm.dina.datamodel.EntityBean;
import se.nrm.dina.datamodel.impl.Testentity;
import se.nrm.dina.datamodel.util.DataModelHelper;
  

/**
 *
 * @author idali
 */  
public class JpaReflectionHelperNGTest {
     
    
    private JpaReflectionHelper instance;
    
    public JpaReflectionHelperNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception { 
    }

    @AfterClass
    public static void tearDownClass() throws Exception { 
    }
 
    /**
     * Test of getInstance method, of class JpaReflectionHelper.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        
        instance = null;
        instance = JpaReflectionHelper.getInstance();

        assertNotNull(instance);
    }

    /**
     * Test of convertClassNameToClass method, of class JpaReflectionHelper.
     */
    @Test
    public void testConvertClassNameToClass() {
        System.out.println("convertClassNameToClass");
        
        String classname = "Testentity";
        instance = new JpaReflectionHelper();
        Class expResult = Testentity.class;
        Class result = instance.convertClassNameToClass(classname);
        assertEquals(result, expResult);
        assertEquals(result.getSimpleName(), classname);
    }
 
    /**
     * Test of reformClassName method, of class JpaReflectionHelper.
     */
    @Test
    public void testReformClassName() {
        
        System.out.println("reformClassName");
        
        instance = new JpaReflectionHelper();
        
        String entityName = "testEntity"; 
        String expResult = "Testentity";
        String result = instance.reformClassName(entityName);
        assertEquals(result, expResult); 
    }

    /**
     * Test of createNewInstance method, of class JpaReflectionHelper.
     */
    @Test
    public void testCreateNewInstance() {
        System.out.println("createNewInstance");
        
        Class clazz = Testentity.class;
        instance = new JpaReflectionHelper();
      
        Testentity result = instance.createNewInstance(clazz);
        assertNotNull(result);
        assertSame(clazz, result.getClass());
    }

    /**
     * Test of validateEntityName method, of class JpaReflectionHelper.
     */
    @Test
    public void testValidateEntityName() {
        System.out.println("validateEntityName");
        
        String entityName = "testEntity";
        instance = new JpaReflectionHelper();
     
        String result = instance.validateEntityName(entityName);
        assertEquals(result, Testentity.class.getSimpleName()); 
    }
    
    
    /**
     * Test of isIntField method, of class JpaReflectionHelper.
     */
    @Test
    public void testIsIntField() {
        
        System.out.println("isIntField");
        
        Class clazz = Testentity.class;
        String fieldName = "version";
        instance = new JpaReflectionHelper();
    
        boolean result = instance.isIntField(clazz, fieldName);
        assertTrue(result);
    }
    
    
    /**
     * Test of isEntity method, of class JpaReflectionHelper.
     */
    @Test
    public void testIsEntity() {
        System.out.println("isEntity");
        
        Class clazz = Testentity.class;
        String fieldName = DataModelHelper.getInstance().getCREATED_BY_FIELD();
        instance = new JpaReflectionHelper();
 
        boolean result = instance.isEntity(clazz, fieldName);
        assertTrue(result);
    }
 
    /**
     * Test of isCollection method, of class JpaReflectionHelper.
     */
    @Test
    public void testIsCollection() {
        System.out.println("isCollection");
        
        Class clazz = Testentity.class;
        String fieldName = "tetList";
        instance = new JpaReflectionHelper();
 
        boolean result = instance.isCollection(clazz, fieldName);
        assertTrue(result);
    }
    
    
    /**
     * Test of isDate method, of class JpaReflectionHelper.
     */
    @Test
    public void testIsDate() {
        System.out.println("isDate");
        
        Class clazz = Testentity.class;
        String fieldName = DataModelHelper.getInstance().getTIME_CREATED_FIELD();
        instance = new JpaReflectionHelper();
      
        boolean result = instance.isDate(clazz, fieldName);
        assertTrue(result);
    }

    /**
     * Test of isBigDecimal method, of class JpaReflectionHelper.
     */
    @Test
    public void testIsBigDecimal() {
        System.out.println("isBigDecimal");
        
        Class clazz = Testentity.class;
        String fieldName = "bgDecimal";
        instance = new JpaReflectionHelper(); 
        
        boolean result = instance.isBigDecimal(clazz, fieldName);
        assertTrue(result);
    }
 
    /**
     * Test of getEntity method, of class JpaReflectionHelper.
     */
    @Test
    public void testGetEntity() {
        System.out.println("getEntity");
        Class clazz = Testentity.class;
        String fieldName = DataModelHelper.getInstance().getCREATED_BY_FIELD();
        instance = new JpaReflectionHelper();
 
        EntityBean result = instance.getEntity(clazz, fieldName);
        assertNotNull(result); 
    }

    
    
    
    
    
    
    
    
    
    

//    /**
//     * Test of isFieldsValid method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsFieldsValid() {
//        System.out.println("isFieldsValid");
//        Class clazz = Testentity.class;
//        Map<String, String> map = new HashMap<>();
//        map.put(DataModelHelper.getInstance().getVERSION(), null)
//        
//        instance = new JpaReflectionHelper();
//        boolean expResult = false;
//        boolean result = instance.isFieldsValid(clazz, map);
//        assertEquals(result, expResult); 
//    }







//    /**
//     * Test of getValueType method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testGetValueType() {
//        System.out.println("getValueType");
//        Class clazz = null;
//        String fieldName = "";
//        JpaReflectionHelper instance = new JpaReflectionHelper();
//        ValueType expResult = null;
//        ValueType result = instance.getValueType(clazz, fieldName);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of validateFields method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testValidateFields() {
//        System.out.println("validateFields");
//        Class clazz = null;
//        String fieldName = "";
//        JpaReflectionHelper instance = new JpaReflectionHelper();
//        boolean expResult = false;
//        boolean result = instance.validateFields(clazz, fieldName);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of isVersioned method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsVersioned() {
//        System.out.println("isVersioned");
//        Class clazz = null;
//        JpaReflectionHelper instance = new JpaReflectionHelper();
//        boolean expResult = false;
//        boolean result = instance.isVersioned(clazz);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getTimestampCreated method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testGetTimestampCreated() {
//        System.out.println("getTimestampCreated");
//        Class clazz = null;
//        JpaReflectionHelper instance = new JpaReflectionHelper();
//        Field expResult = null;
//        Field result = instance.getTimestampCreated(clazz);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getCreatedByField method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testGetCreatedByField() {
//        System.out.println("getCreatedByField");
//        Class clazz = null;
//        JpaReflectionHelper instance = new JpaReflectionHelper();
//        Field expResult = null;
//        Field result = instance.getCreatedByField(clazz);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getIDFieldName method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testGetIDFieldName_EntityBean() {
//        System.out.println("getIDFieldName");
//        EntityBean bean = null;
//        JpaReflectionHelper instance = new JpaReflectionHelper();
//        String expResult = "";
//        String result = instance.getIDFieldName(bean);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//
//    /**
//     * Test of getIDFieldName method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testGetIDFieldName_Class() {
//        System.out.println("getIDFieldName");
//        Class clazz = null;
//        JpaReflectionHelper instance = new JpaReflectionHelper();
//        String expResult = "";
//        String result = instance.getIDFieldName(clazz);
//        assertEquals(result, expResult);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
//    
}
