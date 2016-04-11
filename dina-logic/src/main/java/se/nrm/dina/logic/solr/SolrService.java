/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.logic.solr;

import java.io.Serializable;
import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 *
 * @author idali
 */
@Stateless
public class SolrService implements Serializable {
    
    private final String REMOTE_SOLR_URL = "";
    private final String LOCAL_SOLR_URL = "";
    
    private String solrUrl;
    
    private static String OS = System.getProperty("os.name").toLowerCase();
    
    public SolrService() {
        
    }
    
    @PostConstruct
    public void init() {
        solrUrl = OS.contains("mac") ? LOCAL_SOLR_URL : REMOTE_SOLR_URL;
    }
    
    public void solrCommit(int id, Class clazz) {
        
    }
    
}
