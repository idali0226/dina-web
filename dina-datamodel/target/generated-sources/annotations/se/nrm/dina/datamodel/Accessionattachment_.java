package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T15:12:39")
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