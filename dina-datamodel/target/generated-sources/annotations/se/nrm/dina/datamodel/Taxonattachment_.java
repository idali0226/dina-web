package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Taxon;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-20T13:57:07")
@StaticMetamodel(Taxonattachment.class)
public class Taxonattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Taxonattachment, Integer> taxonAttachmentID;
    public static volatile SingularAttribute<Taxonattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Taxonattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Taxonattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Taxonattachment, Taxon> taxonID;
    public static volatile SingularAttribute<Taxonattachment, String> remarks;
    public static volatile SingularAttribute<Taxonattachment, Integer> ordinal;

}