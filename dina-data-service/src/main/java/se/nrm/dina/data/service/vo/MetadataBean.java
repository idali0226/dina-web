/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.service.vo;

import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlElement; 
import javax.xml.bind.annotation.XmlRootElement; 

/**
 *
 * @author idali
 */
@XmlRootElement
public class MetadataBean implements Serializable  {
    
    @XmlElement
    private String callEndpoint;
    
    @XmlElement
    private String callDate;
    
    @XmlElement
    private String apiVersion; 
    
    @XmlElement
    private int limit;
    
    @XmlElement
    private int numOfResults;
    
    @XmlElement
    private String sortOrder;
    
    @XmlElement
    private String statusCode;
    
    @XmlElement
    private List<String> supportedLanguages;
    
    @XmlElement
    private List<String> orderBy;
    
    @XmlElement
    private String maintenanceContact;
     
    
    public MetadataBean() {  
    }
     
    public String getCallEndpoint() {
        return callEndpoint;
    }

    public String getCallDate() {
        return callDate;
    }

    public String getApiVersion() {
        return apiVersion;
    }

    public void setCallEndpoint(String callEndpoint) {
        this.callEndpoint = callEndpoint;
    }

    public void setCallDate(String callDate) {
        this.callDate = callDate;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public int getNumOfResults() {
        return numOfResults;
    }

    public void setNumOfResults(int numOfResults) {
        this.numOfResults = numOfResults;
    }
  
    public List<String> getSupportedLanguages() {
        return supportedLanguages;
    }

    public void setSupportedLanguages(List<String> supportedLanguages) {
        this.supportedLanguages = supportedLanguages;
    }

    public int getLimit() {
        return limit;
    }

    public void setLimit(int limit) {
        this.limit = limit;
    }

    public List<String> getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(List<String> orderBy) {
        this.orderBy = orderBy;
    }

    public String getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(String sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getMaintenanceContact() {
        return maintenanceContact;
    }

    public void setMaintenanceContact(String maintenanceContact) {
        this.maintenanceContact = maintenanceContact;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    } 
}
