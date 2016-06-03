/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.logic.util;
   
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author idali
 */
public class HelpClass {
    
    private static HelpClass instance = null;
     
    private final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("MMM dd, yyyy 'at' HH.mm.ss");
    private final String MAINTENANCE_CONTACT = "admin@dina-system.org";
    private final List<String> supportedLanguages;
    
    HelpClass() {
        supportedLanguages = new ArrayList<>();
        supportedLanguages.add("GB_en"); 
        supportedLanguages.add("SE_sv");
    }  
    
    
    public static synchronized HelpClass getInstance() {
        if (instance == null) {
            instance = new HelpClass();
        }
        return instance;
    }

    public String dateTimeToString(LocalDateTime date) {
        return date == null ? null : date.format(FORMATTER);
    }

    
    
    public java.sql.Date getTodaysDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }
    
    public String getMaintanceContact() {
        return MAINTENANCE_CONTACT;
    }
 
    
    public List<String> getSupportedLanguages() {
       return supportedLanguages;
    } 
}
