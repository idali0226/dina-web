package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Permit;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-22T09:50:41")
@StaticMetamodel(Permitattachment.class)
public class Permitattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Permitattachment, Permit> permitID;
    public static volatile SingularAttribute<Permitattachment, Integer> permitAttachmentID;
    public static volatile SingularAttribute<Permitattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Permitattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Permitattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Permitattachment, String> remarks;
    public static volatile SingularAttribute<Permitattachment, Integer> ordinal;

}