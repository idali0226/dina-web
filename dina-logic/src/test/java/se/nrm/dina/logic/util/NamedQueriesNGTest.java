/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.logic.util;
 
import se.nrm.dina.logic.util.NamedQueries;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.junit.After;
import org.junit.Before;
import static org.testng.Assert.*; 
import org.testng.annotations.Test;
import se.nrm.dina.datamodel.Accession;

/**
 *
 * @author idali
 */
public class NamedQueriesNGTest {
    
    private NamedQueries instance;
    
    public NamedQueriesNGTest() {
    }

    @Before 
    public static void setUpClass() throws Exception {
    }

    @After 
    public static void tearDownClass() throws Exception {
    }
 
    /**
     * Test of getInstance method, of class NamedQueries.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance"); 
        NamedQueries result = NamedQueries.getInstance();
        assertNotNull(result);
    }

    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 10;
        int minid = 2;
        int maxid = 20;
        List<String> orderBy = new ArrayList<>();
        orderBy.add("accessionNumber");
        
        Map<String, String> criteria = new HashMap();
        criteria.put("accessionNumber", "test1"); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e WHERE e.accessionID BETWEEN 10 AND 20 AND  e.accessionNumber like :accessionNumber ORDER BY e.accessionNumber";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, false, criteria);
        assertEquals(result, expResult); 
    }

    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class
     * NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteriaWithExactSearch() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 10;
        int minid = 2;
        int maxid = 20;
        List<String> orderBy = new ArrayList<>();
        orderBy.add("accessionNumber");
        
        Map<String, String> criteria = new HashMap();
        criteria.put("accessionNumber", "test1"); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e WHERE e.accessionID BETWEEN 10 AND 20 AND  e.accessionNumber = :accessionNumber ORDER BY e.accessionNumber";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, true, criteria);
        assertEquals(result, expResult); 
    }
    
    
    
    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria1() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 10;
        int minid = 0;
        int maxid = 0;
        List<String> orderBy = new ArrayList<>();
        orderBy.add("accessionNumber");
        
        Map<String, String> criteria = new HashMap();
        criteria.put("accessionNumber", "test1"); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e WHERE e.accessionID >= 10 AND  e.accessionNumber like :accessionNumber ORDER BY e.accessionNumber";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, false, criteria);
        assertEquals(result, expResult); 
    }
        
    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria1WithExactSearch() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 10;
        int minid = 0;
        int maxid = 0;
        List<String> orderBy = new ArrayList<>();
        orderBy.add("accessionNumber");
        
        Map<String, String> criteria = new HashMap();
        criteria.put("accessionNumber", "test1"); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e WHERE e.accessionID >= 10 AND  e.accessionNumber = :accessionNumber ORDER BY e.accessionNumber";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, true, criteria);
        assertEquals(result, expResult); 
    }
        
    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria2() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 0;
        int minid = 0;
        int maxid = 0;
        List<String> orderBy = new ArrayList<>();
        orderBy.add("accessionNumber");
        
        Map<String, String> criteria = new HashMap();
        criteria.put("accessionNumber", "test1"); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e WHERE e.accessionNumber like :accessionNumber ORDER BY e.accessionNumber";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, false, criteria);
        assertEquals(result, expResult);
    }

    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class
     * NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria2WithExactSearch() {
        System.out.println("createQueryFindAllWithSearchCriteria");

        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 0;
        int minid = 0;
        int maxid = 0;
        List<String> orderBy = new ArrayList<>();
        orderBy.add("accessionNumber");
        
        Map<String, String> criteria = new HashMap();
        criteria.put("accessionNumber", "test1"); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e WHERE e.accessionNumber = :accessionNumber ORDER BY e.accessionNumber";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, true, criteria);
        assertEquals(result, expResult); 
    }
    
    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria3() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 0;
        int minid = 0;
        int maxid = 0;
        List<String> orderBy = new ArrayList<>(); 
        
        Map<String, String> criteria = new HashMap();
        criteria.put("accessionNumber", "test1"); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e WHERE e.accessionNumber like :accessionNumber";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, false, criteria);
        assertEquals(result, expResult); 
    }
    
    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria3WithExactSearch() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 0;
        int minid = 0;
        int maxid = 0;
        List<String> orderBy = new ArrayList<>(); 
        
        Map<String, String> criteria = new HashMap();
        criteria.put("accessionNumber", "test1"); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e WHERE e.accessionNumber = :accessionNumber";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, true, criteria);
        assertEquals(result, expResult); 
    }    
    
    
       
    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria4() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 0;
        int minid = 0;
        int maxid = 0;
        List<String> orderBy = new ArrayList<>(); 
        
        Map<String, String> criteria = new HashMap(); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e ";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, false, criteria);
        assertEquals(result, expResult); 
    }
    
    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria4WithExactSearch() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 0;
        int minid = 0;
        int maxid = 0;
        List<String> orderBy = new ArrayList<>(); 
        
        Map<String, String> criteria = new HashMap(); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e ";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, true, criteria);
        assertEquals(result, expResult); 
    }   
    
           
    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria5() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 10;
        int minid = 5;
        int maxid = 20;
        List<String> orderBy = new ArrayList<>(); 
        
        Map<String, String> criteria = new HashMap(); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e WHERE e.accessionID BETWEEN 10 AND 20";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, false, criteria);
        assertEquals(result, expResult); 
    }  
    
    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria5WithExactSearch() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 10;
        int minid = 5;
        int maxid = 20;
        List<String> orderBy = new ArrayList<>(); 
        
        Map<String, String> criteria = new HashMap(); 
        
        instance = NamedQueries.getInstance();
        
        String expResult = "SELECT e From Accession e WHERE e.accessionID BETWEEN 10 AND 20";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, true, criteria);
        assertEquals(result, expResult); 
    }  
    
               
    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria6() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 10;
        int minid = 5;
        int maxid = 20;
        List<String> orderBy = new ArrayList<>();
        orderBy.add("accessionNumber");

        Map<String, String> criteria = new HashMap();
        criteria.put("divisionID", "1");
        instance = NamedQueries.getInstance();

        String expResult = "SELECT e From Accession e WHERE e.accessionID BETWEEN 10 AND 20 AND  e.divisionID.userGroupScopeId = :divisionID ORDER BY e.accessionNumber";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, false, criteria);
        assertEquals(result, expResult); 
    }  
    
    /**
     * Test of createQueryFindAllWithSearchCriteria method, of class NamedQueries.
     */
    @Test
    public void testCreateQueryFindAllWithSearchCriteria6WithExactSearch() {
        System.out.println("createQueryFindAllWithSearchCriteria");
        
        String entityName = "Accession";
        Class clazz = Accession.class;
        int offset = 10;
        int minid = 5;
        int maxid = 20;
        List<String> orderBy = new ArrayList<>();
        orderBy.add("accessionNumber");

        Map<String, String> criteria = new HashMap();
        criteria.put("divisionID", "1");
        instance = NamedQueries.getInstance();

        String expResult = "SELECT e From Accession e WHERE e.accessionID BETWEEN 10 AND 20 AND  e.divisionID.userGroupScopeId = :divisionID ORDER BY e.accessionNumber";
        String result = instance.createQueryFindAllWithSearchCriteria(entityName, clazz, offset, minid, maxid, orderBy, true, criteria);
        assertEquals(result, expResult); 
    }      
    
}
