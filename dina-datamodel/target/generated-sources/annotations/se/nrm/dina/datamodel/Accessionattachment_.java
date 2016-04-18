package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-18T10:19:04")
@StaticMetamodel(Accessionattachment.class)
public class Accessionattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Accessionattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Accessionattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Accessionattachment, Integer> accessionAttachmentID;
    public static volatile SingularAttribute<Accessionattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Accessionattachment, String> remarks;
    public static volatile SingularAttribute<Accessionattachment, Accession> accessionID;
    public static volatile SingularAttribute<Accessionattachment, Integer> ordinal;

}