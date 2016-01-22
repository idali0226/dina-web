/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.exceptions;

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
public class ErrorMsgNGTest {
    
    private ErrorMsg instance;
    
    public ErrorMsgNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

 
    /**
     * Test of getInstance method, of class ErrorMsg.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance"); 
        ErrorMsg result = ErrorMsg.getInstance();
        assertNotNull(result);
    }

    /**
     * Test of getEntityNameErrorMsg method, of class ErrorMsg.
     */
    @Test
    public void testGetEntityNameErrorMsg() {
        System.out.println("getEntityNameErrorMsg");
        
        instance = new ErrorMsg();
        String expResult = "The entity name is wrong";
        String result = instance.getEntityNameErrorMsg();
        assertEquals(result, expResult); 
    } 
}
