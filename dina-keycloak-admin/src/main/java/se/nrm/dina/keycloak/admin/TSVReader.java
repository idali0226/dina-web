/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.keycloak.admin;

import com.univocity.parsers.tsv.TsvParser;
import com.univocity.parsers.tsv.TsvParserSettings;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader; 
import java.util.List; 

/**
 *
 * @author idali
 */
public class TSVReader {
    
    private final String tsv;
    
    public TSVReader(String tsv) {
        this.tsv = tsv;
    }
    
    public List<String[]> readTSVFile() {
        Reader fileReader = null;
         
        try {
            TsvParserSettings settings = new TsvParserSettings();
            settings.getFormat().setLineSeparator("\n");  
            
            TsvParser parser = new TsvParser(settings);
            fileReader = new FileReader(tsv);
             
            return parser.parseAll(fileReader);
             
        } catch (FileNotFoundException ex) {
            System.out.println("ex : " + ex.getMessage());
            return null;
        } finally {
            try {
                if(fileReader != null) {
                    fileReader.close();
                } 
            } catch (IOException ex) {
                return null;
            }
        }
        
    } 
}
