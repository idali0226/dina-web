/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.datamodel;
 
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table; 
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlIDREF;
import javax.xml.bind.annotation.XmlRootElement;
import se.nrm.dina.datamodel.util.Util;

/**
 *
 * @author idali
 */
@Entity
@Table(name = "localitynamealias")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Localitynamealias.findAll", query = "SELECT l FROM Localitynamealias l"),
    @NamedQuery(name = "Localitynamealias.findByLocalityNameAliasID", query = "SELECT l FROM Localitynamealias l WHERE l.localityNameAliasID = :localityNameAliasID"), 
    @NamedQuery(name = "Localitynamealias.findByName", query = "SELECT l FROM Localitynamealias l WHERE l.name = :name"),
    @NamedQuery(name = "Localitynamealias.findBySource", query = "SELECT l FROM Localitynamealias l WHERE l.source = :source")})
public class Localitynamealias extends BaseEntity {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "LocalityNameAliasID")
    private Integer localityNameAliasID;
    
    
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 255)
    @Column(name = "Name")
    private String name;
    
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 64)
    @Column(name = "Source")
    private String source;
    
    @JoinColumn(name = "DisciplineID", referencedColumnName = "UserGroupScopeId")
    @ManyToOne(optional = false)
    private Discipline disciplineID;
    
    @JoinColumn(name = "ModifiedByAgentID", referencedColumnName = "AgentID")
    @ManyToOne
    private Agent modifiedByAgentID;
    
    @JoinColumn(name = "CreatedByAgentID", referencedColumnName = "AgentID")
    @ManyToOne
    private Agent createdByAgentID;
    
    @JoinColumn(name = "LocalityID", referencedColumnName = "LocalityID")
    @ManyToOne(optional = false)
    private Locality localityID;

    public Localitynamealias() {
    }

    public Localitynamealias(Integer localityNameAliasID) {
        this.localityNameAliasID = localityNameAliasID;
    }

    public Localitynamealias(Integer localityNameAliasID, Date timestampCreated, String name, String source) {
        this.localityNameAliasID = localityNameAliasID;
        this.timestampCreated = timestampCreated;
        this.name = name;
        this.source = source;
    }
    
    @XmlID
    @XmlAttribute(name = "id")
    @Override
    public String getIdentityString() {
        return String.valueOf(localityNameAliasID);
    }
    
    @XmlAttribute(name = "uuid") 
    @Override
    public String getUUID() {
        return Util.getInstance().getURLLink(this.getClass().getSimpleName()) + localityNameAliasID;
    }
    
    @Override
    public int getEntityId() {
        return localityNameAliasID;
    }

    public Integer getLocalityNameAliasID() {
        return localityNameAliasID;
    }

    public void setLocalityNameAliasID(Integer localityNameAliasID) {
        this.localityNameAliasID = localityNameAliasID;
    }
 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    @XmlIDREF
    public Discipline getDisciplineID() {
        return disciplineID;
    }

    public void setDisciplineID(Discipline disciplineID) {
        this.disciplineID = disciplineID;
    }

    @XmlIDREF
    public Agent getModifiedByAgentID() {
        return modifiedByAgentID;
    }

    public void setModifiedByAgentID(Agent modifiedByAgentID) {
        this.modifiedByAgentID = modifiedByAgentID;
    }

    @XmlIDREF
    public Agent getCreatedByAgentID() {
        return createdByAgentID;
    }

    public void setCreatedByAgentID(Agent createdByAgentID) {
        this.createdByAgentID = createdByAgentID;
    }

    @XmlIDREF
    public Locality getLocalityID() {
        return localityID;
    }

    public void setLocalityID(Locality localityID) {
        this.localityID = localityID;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (localityNameAliasID != null ? localityNameAliasID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Localitynamealias)) {
            return false;
        }
        Localitynamealias other = (Localitynamealias) object;
        return !((this.localityNameAliasID == null && other.localityNameAliasID != null) || (this.localityNameAliasID != null && !this.localityNameAliasID.equals(other.localityNameAliasID)));
    }

    @Override
    public String toString() {
        return "se.nrm.dina.datamodel.Localitynamealias[ localityNameAliasID=" + localityNameAliasID + " ]";
    }
    
}
