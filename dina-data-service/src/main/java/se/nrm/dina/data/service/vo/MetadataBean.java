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
import org.codehaus.jackson.annotate.JsonIgnore;

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
    @JsonIgnore
    private int limit;
    
    @XmlElement
    private int resultCount;
    
    @XmlElement
    @JsonIgnore
    private String sortOrder;
    
    @XmlElement
    private int statusCode;
    
    @XmlElement
    @JsonIgnore
    private int offset;
    
    @XmlElement
    @JsonIgnore
    private String previous;
    
    @XmlElement
    @JsonIgnore
    private String next;
    
    @XmlElement
    private String message;
    
    @XmlElement
    private List<String> supportedLanguages;
    
    @XmlElement
    private List<String> resultLanguages;
    
    @XmlElement 
    private List<String> contentLicenses;
    
    @XmlElement
    @JsonIgnore
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

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }
 
    public int getOffset() {
        return offset;
    }

    public void setOffset(int offset) {
        this.offset = offset;
    } 

    public int getResultCount() {
        return resultCount;
    }

    public void setResultCount(int resultCount) {
        this.resultCount = resultCount;
    }

    public String getPrevious() {
        return previous;
    }

    public void setPrevious(String previous) {
        this.previous = previous;
    }

    public String getNext() {
        return next;
    }

    public void setNext(String next) {
        this.next = next;
    }
 
    public List<String> getResultLanguages() {
        return resultLanguages;
    }

    public void setResultLanguages(List<String> resultLanguages) {
        this.resultLanguages = resultLanguages;
    }

    public List<String> getContentLicenses() {
        return contentLicenses;
    }

    public void setContentLicenses(List<String> contentLicenses) {
        this.contentLicenses = contentLicenses;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
    
    
}
