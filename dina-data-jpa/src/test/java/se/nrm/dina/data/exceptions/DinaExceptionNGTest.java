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
    
    @Test
    public void testDinaExceptionConstruct() {
        instance = new DinaException();
        assertNotNull(instance);
        assertEquals(0, instance.getErrorCode());
    }

    @Test
    public void testDinaExceptionConstructWithMsg() {
        instance = new DinaException("test error");
        assertNotNull(instance);
        assertEquals("test error", instance.getMessage());
    }

    @Test
    public void testDinaExceptionConstructWithMsgAndErrorCode() {
        instance = new DinaException("test error", 400);
        assertNotNull(instance);
        assertEquals("test error", instance.getMessage());
        assertEquals(400, instance.getErrorCode());
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
