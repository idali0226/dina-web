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
    
    public ErrorMsgNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of getInstance method, of class ErrorMsg.
     */
    @Test
    public void testGetInstance() {
        System.out.println("getInstance");
        ErrorMsg expResult = null;
        ErrorMsg result = ErrorMsg.getInstance();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEntityNameErrorMsg method, of class ErrorMsg.
     */
    @Test
    public void testGetEntityNameErrorMsg() {
        System.out.println("getEntityNameErrorMsg");
        ErrorMsg instance = new ErrorMsg();
        String expResult = "";
        String result = instance.getEntityNameErrorMsg();
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
