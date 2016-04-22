package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Locality;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-22T09:50:41")
@StaticMetamodel(Localityattachment.class)
public class Localityattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Localityattachment, Integer> localityAttachmentID;
    public static volatile SingularAttribute<Localityattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Localityattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Localityattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Localityattachment, Locality> localityID;
    public static volatile SingularAttribute<Localityattachment, String> remarks;
    public static volatile SingularAttribute<Localityattachment, Integer> ordinal;

}