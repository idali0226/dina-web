package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Conservevent;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-18T10:19:04")
@StaticMetamodel(Conserveventattachment.class)
public class Conserveventattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Conserveventattachment, Integer> conservEventAttachmentID;
    public static volatile SingularAttribute<Conserveventattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Conserveventattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Conserveventattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Conserveventattachment, Conservevent> conservEventID;
    public static volatile SingularAttribute<Conserveventattachment, String> remarks;
    public static volatile SingularAttribute<Conserveventattachment, Integer> ordinal;

}