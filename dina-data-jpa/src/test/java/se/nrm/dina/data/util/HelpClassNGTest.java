/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.util;

import java.math.BigDecimal; 
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;   
import org.junit.AfterClass; 
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author idali
 */
public class HelpClassNGTest {
    
    private static HelpClass testInstance;
    
    public HelpClassNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        testInstance = HelpClass.getInstance();
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
 
    /**
     * Test of getInstance method, of class HelpClass.
     */
    @Test
    public void testGetInstance() {
        System.out.println("testGetInstance");
         
        HelpClass result = HelpClass.getInstance();
        assertNotNull(result);   
    }

    /**
     * Test of convertStringToDouble method, of class HelpClass.
     */
    @Test
    public void testConvertStringToDouble() {
        System.out.println("convertStringToDouble");
        
        String strDouble = "20.5"; 
        double expResult = 20.5;
        double result = testInstance.convertStringToDouble(strDouble);
        assertEquals(expResult, result, 20.5);
    }

    /**
     * Test of convertStringToBigDecimal method, of class HelpClass.
     */
    @Test
    public void testConvertStringToBigDecimal() {
        System.out.println("convertStringToBigDecimal");
        String strDouble = "20.5";
        HelpClass instance = new HelpClass(); 
        
        BigDecimal expResult = new BigDecimal(20.5);
        BigDecimal result = instance.convertStringToBigDecimal(strDouble);
        assertEquals(result, expResult); 
    }

    /**
     * Test of convertStringToDate method, of class HelpClass.
     */
    @Test
    public void testConvertStringToDate() {
        System.out.println("convertStringToDate");
        
        String strDate = "2000-01-01";
        HelpClass instance = new HelpClass();
        
        Calendar calendar = new GregorianCalendar(2000, 00, 01);
        Date expResult = calendar.getTime();
        Date result = instance.convertStringToDate(strDate);
        System.out.println(result.toString());
        assertEquals(result, expResult); 
    }

    /**
     * Test of maxLimit method, of class HelpClass.
     */
    @Test
    public void testMaxLessThenLimit() {
        System.out.println("maxLimit");
        int limit = 2000;
        HelpClass instance = new HelpClass();
        int expResult = 500;
        int result = instance.maxLimit(limit);
        assertEquals(result, expResult); 
    }
    
    
    /**
     * Test of maxLimit method, of class HelpClass.
     */
    @Test
    public void testMaxGreatThenLimit() {
        System.out.println("maxLimit");
        int limit = 20;
        HelpClass instance = new HelpClass();
        int expResult = 20;
        int result = instance.maxLimit(limit);
        assertEquals(result, expResult); 
    }
}
