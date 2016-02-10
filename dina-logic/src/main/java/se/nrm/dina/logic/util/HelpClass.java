/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.logic.util;
   


/**
 *
 * @author idali
 */
public class HelpClass {
    
    private static HelpClass instance = null;
    
    public static synchronized HelpClass getInstance() {
        if (instance == null) {
            instance = new HelpClass();
        }
        return instance;
    } 
    
    public java.sql.Date getTodaysDate() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Date(today.getTime());
    }
}
