/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.util;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.nrm.dina.data.exceptions.DinaException;

/**
 *
 * @author idali
 */
public class HelpClass {
    
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    
    private final SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
    
    private static HelpClass instance = null;
    
    public static synchronized HelpClass getInstance() {
        if (instance == null) {
            instance = new HelpClass();
        }
        return instance;
    } 
    
    public double convertStringToDouble(String strDouble) {
        
        return Double.parseDouble(strDouble);
    }
    
    public BigDecimal convertStringToBigDecimal(String strDouble) {
        return new BigDecimal(strDouble);
    }
    
    public Date convertStringToDate(String strDate) {
        try {
            return formatter.parse(strDate);
        } catch (ParseException ex) {
            throw new DinaException("Error.  " + ex.getMessage());
        }
    }
}
