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
import se.nrm.dina.datamodel.EntityBean;

/**
 *
 * @author idali
 */
@XmlRootElement 
public class EntityWrapper implements Serializable  {
    
        
    @XmlElement
    private final MetadataBean metadata;
    
    @XmlElement
    private List<EntityBean> results;
    
    @XmlElement
    private EntityBean result;
    
    public EntityWrapper(MetadataBean metadata, EntityBean result) {
        this.result = result;
        this.metadata = metadata;
    }
        
    public EntityWrapper(MetadataBean metadata, List<EntityBean> results) {
        this.metadata = metadata;
        this.results = results;
    }
    

    public MetadataBean getMetadata() {
        return metadata;
    }

    public List<EntityBean> getResults() {
        return results;
    }

    public EntityBean getResult() {
        return result;
    } 
}
