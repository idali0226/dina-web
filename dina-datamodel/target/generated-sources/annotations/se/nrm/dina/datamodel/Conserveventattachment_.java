package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Conservevent;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-10T17:35:03")
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