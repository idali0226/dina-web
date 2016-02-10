/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.logic.util;

import java.sql.Date;
import org.junit.After;
import org.junit.Before;
import static org.testng.Assert.*; 
import org.testng.annotations.Test;

/**
 *
 * @author idali
 */
public class HelpClassNGTest {
    
    private HelpClass instance;
    
    public HelpClassNGTest() {
    }

    @Before 
    public static void setUpClass() throws Exception {
    }

    @After 
    public static void tearDownClass() throws Exception {
    }

 

    /**
     * Test of getInstance method, of class HelpClass.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
 
        HelpClass result = HelpClass.getInstance();
        assertNotNull(result);
    }

    /**
     * Test of getTodaysDate method, of class HelpClass.
     */
    @Test
    public void testGetTodaysDate() {
        System.out.println("getTodaysDate");
         
        instance = HelpClass.getInstance();
        Date result = instance.getTodaysDate();
        
        java.util.Date today = new java.util.Date();
        Date expResult = new java.sql.Date(today.getTime()); 
        assertEquals(expResult.getYear(), result.getYear()); 
        assertEquals(expResult.getMonth(), result.getMonth()); 
        assertEquals(expResult.getDay(), result.getDay()); 
        assertEquals(expResult.getDate(), result.getDate()); 
    }
    
}
