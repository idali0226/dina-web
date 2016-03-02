package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Conservdescription;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-02T11:43:24")
@StaticMetamodel(Conservdescriptionattachment.class)
public class Conservdescriptionattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Conservdescriptionattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Conservdescriptionattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Conservdescriptionattachment, Conservdescription> conservDescriptionID;
    public static volatile SingularAttribute<Conservdescriptionattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Conservdescriptionattachment, Integer> conservDescriptionAttachmentID;
    public static volatile SingularAttribute<Conservdescriptionattachment, String> remarks;
    public static volatile SingularAttribute<Conservdescriptionattachment, Integer> ordinal;

}