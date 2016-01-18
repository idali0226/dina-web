package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Collectingevent;

@Generated(value="EclipseLink-2.7.0.v20160114-rNA", date="2016-01-18T16:49:49")
@StaticMetamodel(Collectingeventattachment.class)
public class Collectingeventattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Collectingeventattachment, Integer> collectingEventAttachmentID;
    public static volatile SingularAttribute<Collectingeventattachment, Collectingevent> collectingEventID;
    public static volatile SingularAttribute<Collectingeventattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Collectingeventattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Collectingeventattachment, Integer> collectionMemberID;
    public static volatile SingularAttribute<Collectingeventattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Collectingeventattachment, String> remarks;
    public static volatile SingularAttribute<Collectingeventattachment, Integer> ordinal;

}