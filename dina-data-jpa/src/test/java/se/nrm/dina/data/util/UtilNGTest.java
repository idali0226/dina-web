/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.util;
    
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;
import org.mockito.Mock;  
import se.nrm.dina.data.exceptions.DinaException;
import se.nrm.dina.data.exceptions.ErrorMsg; 
import se.nrm.dina.datamodel.EntityBean;

/**
 *
 * @author idali
 */ 
public class UtilNGTest {
    
    private JpaReflectionHelper testInstance;
    
    public UtilNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
 
 

    /**
     * Test of convertClassNameToClass method, of class JpaReflectionHelper.
     */
//    @Test
    public void testConvertClassNameToClass() {
        
        System.out.println("testConvertClassNameToClass");
        
        String classname = "EntityBean";
        testInstance = new JpaReflectionHelper();
        Class expResult = EntityBean.class;
        Class result = testInstance.convertClassNameToClass(classname);
        assertEquals(result, expResult); 
        assertEquals(result.getSimpleName(), classname);
    }

    /**
     * Test of convertClassNameToClass method, of class JpaReflectionHelper.
     */
    @Test  
    public void testConvertClassNameToClassException() {

        System.out.println("testConvertClassNameToClassException");

        testInstance = new JpaReflectionHelper();
        String classname = "EntityBeans"; 
        try {
            testInstance.convertClassNameToClass(classname); 
        } catch(DinaException e) {
            assertEquals(e.getErrorBean().getErrorMsg(), ErrorMsg.getInstance().getEntityNameErrorMsg());
        } 
    }
    
    /**
     * Test of reformClassName method, of class JpaReflectionHelper.
     */
    @Test
    public void testReformClassName() {
        System.out.println("testReformClassName");
        
        String s = "collectionObject";
        
        testInstance = new JpaReflectionHelper();
        
        String expResult = "Collectionobject";
        String result = testInstance.reformClassName(s);
        assertEquals(result, expResult); 
    }

    /**
     * Test of reformClassName method, of class JpaReflectionHelper.
     */
    @Test
    public void testReformClassNameEmptyName() {
        System.out.println("testReformClassNameEmptyName");

        String s = "";

        testInstance = new JpaReflectionHelper();
 
        String result = testInstance.reformClassName(s);
        assertEquals(0, result.length());
    }

    /**
     * Test of createNewInstance method, of class JpaReflectionHelper.
     */
//    @Test
    public void testCreateNewInstance() {
        System.out.println("testCreateNewInstance");
         
        testInstance = new JpaReflectionHelper(); 
        EntityBean result = testInstance.createNewInstance(EntityBean.class);
        assertNotNull(result);
        assertEquals(result.getClass().getSimpleName(), "EntityBean");
    }

    /**
     * Test of createNewInstance method, of class JpaReflectionHelper.
     */
    @Test(expected = DinaException.class) 
    public void testFailedCreateNewInstance() {
        System.out.println("testCreateNewInstance");
 
        testInstance = new JpaReflectionHelper();
        testInstance.createNewInstance(Mock.class); 
    }

    /**
     * Test of validateEntityName method, of class JpaReflectionHelper.
     */
//    @Test
    public void testValidateEntityName() {
        System.out.println("testValidateEntityName");
        
        String entityName = "accession";
        
        testInstance = new JpaReflectionHelper();
        String expResult = "EntityBean";
        String result = testInstance.validateEntityName(entityName);
        assertEquals(result, expResult);
    }

//    /**
//     * Test of validateEntityName method, of class JpaReflectionHelper.
//     */
////    @Test(expected = se.nrm.dina.data.exceptions.DinaException.class)
//    @Test(expectedExceptions = DinaException.class)
//    public void testInvalidateEntityName() {
//        System.out.println("testInvalidateEntityName");
//
//        String entityName = "entityBean";
//
//        testInstance = new JpaReflectionHelper(); 
//        testInstance.validateEntityName(entityName);
//    }


//    /**
//     * Test of isFieldsValid method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsFieldsValid() {
//        System.out.println("testIsFieldsValid");
//        
//        Class clazz = EntityBean.class;
//        
//        Map<String, String> map = new HashMap();
//        map.put("accessionCondition", null);
//        map.put("accessionNumber", null);
//        map.put("dateAccessioned", null);
//        map.put("dateReceived", null);
//         
//        testInstance = new JpaReflectionHelper();
//        boolean expResult = true;
//        boolean result = testInstance.isFieldsValid(clazz, map);
//        assertEquals(result, expResult);
//    }
    
//        /**
//     * Test of isFieldsValid method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsFieldsValidFailed() {
//        System.out.println("testIsFieldsValid");
//        
//        Class clazz = Accession.class;
//        
//        Map<String, String> map = new HashMap();
//        map.put("accessionCondition", null);
//        map.put("accessionNumbers", null);
//        map.put("dateAccessioned", null);
//        map.put("dateReceived", null);
//         
//        testInstance = new JpaReflectionHelper(); 
//        try {
//            testInstance.isFieldsValid(clazz, map);
//            fail("Expected a DinaException to be thrown");
//        } catch(DinaException e) {
//            assertEquals(e.getMessage(), "accessionNumbers");
//        } 
//    }

//    /**
//     * Test of isFieldsValid method, of class JpaReflectionHelper.
//     */
//    @Test 
//    public void testIsFieldsValidFailedExpected() {
//        System.out.println("testIsFieldsValid");
//
//        Class clazz = Accession.class;
//
//        Map<String, String> map = new HashMap();
//        map.put("accessionConditions", null);
//        map.put("accessionNumbers", null);
//        map.put("dateAccessioned", null);
//        map.put("dateReceived", null);
//         
//        testInstance = new JpaReflectionHelper();   
//         
//        try {
//            testInstance.isFieldsValid(clazz, map);
//            fail();
//        } catch(DinaException e) {
//            assertTrue(true);
//        }
//    }

//    /**
//     * Test of isIntField method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsIntField() {
//        System.out.println("isIntField");
//        
//        Class clazz = Collectionobject.class;
//        String fieldName = "collectionMemberID";
//        testInstance = new JpaReflectionHelper();
//         
//        boolean result = testInstance.isIntField(clazz, fieldName);
//        assertTrue(result);
//    }

//    /**
//     * Test of isIntField method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsIntFieldFalse() {
//        System.out.println("isIntField");
//        
//        Class clazz = Accession.class;
//        String fieldName = "accessionNumber";
//        testInstance = new JpaReflectionHelper();
//         
//        boolean result = testInstance.isIntField(clazz, fieldName);
//        assertFalse(result);
//    }
    
//    /**
//     * Test of isIntField method, of class JpaReflectionHelper.
//     */
//    @Test  
//    public void testIsIntegerFieldException() {
//        System.out.println("isIntField");
//
//        Class clazz = Accession.class;
//        String fieldName = "accessionIDs";
//        testInstance = new JpaReflectionHelper(); 
//        
//        try {
//            testInstance.isIntField(clazz, fieldName);
//            fail();
//        } catch(DinaException e) {
//            assertTrue(true);
//        }
//        
//    }

//    /**
//     * Test of isIntField method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsIntegerField() {
//        System.out.println("isIntField");
//
//        Class clazz = Accession.class;
//        String fieldName = "accessionID";
//        testInstance = new JpaReflectionHelper();
//
//        boolean result = testInstance.isIntField(clazz, fieldName);
//        assertTrue(result);
//    }
//
//    /**
//     * Test of isEntity method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsEntity() {
//        System.out.println("isEntity");
//    
//        Class clazz = Accession.class;
//        String fieldName = "divisionID";
//        testInstance = new JpaReflectionHelper(); 
//        boolean result = testInstance.isEntity(clazz, fieldName);
//        assertTrue(result);
//    }
    
    
//    /**
//     * Test of isEntity method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsEntityFalse() {
//        System.out.println("isEntity");
//
//        Class clazz = Accession.class;
//        String fieldName = "accessionNumber";
//        testInstance = new JpaReflectionHelper();
//        boolean result = testInstance.isEntity(clazz, fieldName);
//        assertFalse(result);
//    }
//    
//    /**
//     * Test of isEntity method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsEntityFalseException() {
//        System.out.println("isEntity");
//
//        Class clazz = Accession.class;
//        String fieldName = "divisionid";
//        testInstance = new JpaReflectionHelper();
//        
//        try {
//            testInstance.isEntity(clazz, fieldName); 
//        } catch(DinaException e) {
//            assertTrue(true);
//        }
//        
//    }
//
//    /**
//     * Test of isCollection method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsCollection() {
//        System.out.println("isCollection");
//        
//        Class clazz = Accession.class;
//        String fieldName = "deaccessionList";
//        testInstance = new JpaReflectionHelper(); 
//        
//        boolean result = testInstance.isCollection(clazz, fieldName);
//        assertTrue(result);
//    }
    
//    /**
//     * Test of isCollection method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testIsCollectionFalse() {
//        System.out.println("isCollection");
//
//        Class clazz = Accession.class;
//        String fieldName = "deaccessionlist";
//        testInstance = new JpaReflectionHelper();
//
//        try {
//           testInstance.isCollection(clazz, fieldName); 
//        } catch(DinaException e) {
//            assertTrue(true);
//        }  
//    }
//
//    /**
//     * Test of getEntity method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testGetEntity() {
//        System.out.println("getEntity");
//        
//        Class clazz = Accession.class;
//        String fieldName = "divisionID";
//        
//        testInstance = new JpaReflectionHelper(); 
//        EntityBean result = testInstance.getEntity(clazz, fieldName);
//        assertTrue(result instanceof Division); 
//    }
    
//    /**
//     * Test of getEntity method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testGetEntityFailure() {
//        System.out.println("getEntity");
//        
//        Class clazz = Accession.class;
//        String fieldName = "divisionid";
//        
//        testInstance = new JpaReflectionHelper(); 
//        
//        try {
//            testInstance.getEntity(clazz, fieldName);
//        } catch(DinaException e) {
//            assertTrue(true); 
//        }  
//    }

    
//    /**
//     * Test of validateFields method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testValidateFields() {
//        System.out.println("validateFields");
//        
//        Class clazz = Accession.class;
//        String fieldName = "accessionNumber";
//        
//        testInstance = new JpaReflectionHelper(); 
//        boolean result = testInstance.validateFields(clazz, fieldName);
//        assertTrue(result);
//    }

//    /**
//     * Test of getIDFieldName method, of class JpaReflectionHelper.
//     */
//    @Test
//    public void testGetIDFieldName_EntityBean() {
//        System.out.println("getIDFieldName");
//        
//        EntityBean bean = new Accession();
//        String expResult = "accessionID";
//        
//        testInstance = new JpaReflectionHelper(); 
//        String result = testInstance.getIDFieldName(bean);
//        assertEquals(result, expResult); 
//    }
 
}
