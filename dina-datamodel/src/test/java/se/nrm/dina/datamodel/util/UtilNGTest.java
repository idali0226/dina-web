/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.datamodel.util;

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author idali
 */
public class UtilNGTest {
    
    private Util testInstance;
    
    public UtilNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
 
    /**
     * Test of getInstance method, of class Util.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
         
        Util result = Util.getInstance();
        assertNotNull(result);
    }

    /**
     * Test of getURLLink method, of class Util.
     */
    @Test
    public void testGetURLLink() {
        System.out.println("getURLLink");
        
        String entityName = "Accession";
        
        testInstance = new Util();
         
        String expResult = "https://www.dina-web.nrm/dina-service/dina/v0/Accession/";
        String result = testInstance.getURLLink(entityName);
        assertEquals(result, expResult); 
    }
    
}
