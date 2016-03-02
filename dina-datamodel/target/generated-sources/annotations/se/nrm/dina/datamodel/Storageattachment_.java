package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Storage;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-02T11:43:24")
@StaticMetamodel(Storageattachment.class)
public class Storageattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Storageattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Storageattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Storageattachment, Integer> storageAttachmentID;
    public static volatile SingularAttribute<Storageattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Storageattachment, String> remarks;
    public static volatile SingularAttribute<Storageattachment, Integer> ordinal;
    public static volatile SingularAttribute<Storageattachment, Storage> storageID;

}