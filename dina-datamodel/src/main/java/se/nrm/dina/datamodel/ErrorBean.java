/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.datamodel;

/**
 *
 * @author idali
 */
public class ErrorBean implements EntityBean {
    
    private String entityName;
    private String constrianKey;
    private String errorMsg;
    
    public ErrorBean() {
        
    }
    
    public ErrorBean(String entityName, String errorMsg) {
        this.entityName = entityName;
        this.errorMsg = errorMsg;
    }

    @Override
    public String getIdentityString() {
        return entityName;
    }

    @Override
    public String getUUID() {
        return entityName;
    }

    @Override
    public int getEntityId() {
        return 0;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName; 
    }

    public String getConstrianKey() {
        return constrianKey;
    }

    public void setConstrianKey(String constrianKey) {
        this.constrianKey = constrianKey;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }
    
    
    
}
