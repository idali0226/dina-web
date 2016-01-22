/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.exceptions;

import org.junit.After;
import org.junit.Before;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author idali
 */
public class DinaExceptionNGTest {
    
    private DinaException instance;
    
    public DinaExceptionNGTest() {
    }

    @Before
    public static void setUp() throws Exception {
    }

    @After
    public static void tearDown() throws Exception {
    }

  
    /**
     * Test of getErrorCode method, of class DinaException.
     */
    @Test
    public void testGetErrorCode() {
        System.out.println("getErrorCode");
        
        instance = new DinaException();
        int expResult = 0;
        int result = instance.getErrorCode();
        assertEquals(result, expResult); 
    } 
}
