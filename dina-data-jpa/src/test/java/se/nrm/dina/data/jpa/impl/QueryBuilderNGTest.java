/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.jpa.impl;

import java.util.Map;
import javax.persistence.Query; 
import org.junit.AfterClass;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author idali
 */
public class QueryBuilderNGTest {
    
    public QueryBuilderNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
 
    /**
     * Test of getInstance method, of class QueryBuilder.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance"); 
        QueryBuilder result = QueryBuilder.getInstance();
        assertNotNull(result);
    }

    
    /**
     * Test of createQuery method, of class QueryBuilder.
     */
    @Test
    public void testCreateQuery() {
        System.out.println("createQuery");
        
        Query query = null;
        Class clazz = null;
        Map<String, String> parameters = null;
        boolean isFuzzSearch = false;
        QueryBuilder instance = new QueryBuilder();
        Query expResult = null;
        Query result = instance.createQuery(query, clazz, parameters, isFuzzSearch);
        assertEquals(result, expResult); 
    }  
}
