/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.service.vo;
 
import java.io.Serializable;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement; 
import org.codehaus.jackson.map.annotate.JsonSerialize;
import se.nrm.dina.data.vo.ErrorBean;
import se.nrm.dina.datamodel.EntityBean;

/**
 *
 * @author idali
 */
@XmlRootElement 
@JsonSerialize(include=JsonSerialize.Inclusion.NON_NULL) 
public class EntityWrapper implements Serializable  {
    
        
    @XmlElement
    private final MetadataBean metadata;
    
    @XmlElement
    private List<EntityBean> results;
    
    @XmlElement
    private EntityBean result;
    
    
    @XmlElement
    private EntityCount count;
    
    @XmlElement
    private ErrorBean error;
    
    public EntityWrapper(MetadataBean metadata, EntityBean result) {
        this.result = result;
        this.metadata = metadata;
    }
        
    public EntityWrapper(MetadataBean metadata, List<EntityBean> results) {
        this.metadata = metadata;
        this.results = results;
    }
    
            
    public EntityWrapper(MetadataBean metadata, EntityCount count) {
        this.metadata = metadata;
        this.count = count;
    }
    
    public EntityWrapper(MetadataBean metadata, ErrorBean error) {
        this.metadata = metadata;
        this.error = error;
    }
    

    public MetadataBean getMetadata() {
        return metadata;
    }

    @XmlAttribute(required=true)
    public List<EntityBean> getResults() {
        return results;
    }

    @XmlAttribute(required=true)
    public EntityBean getResult() {
        return result;
    } 

    @XmlAttribute(required=true)
    public ErrorBean getError() {
        return error;
    } 
 
    @XmlAttribute(name = "data" ) 
    public EntityCount getCount() {
        return count;
    } 
    
}
