package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Fieldnotebook;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T15:11:50")
@StaticMetamodel(Fieldnotebookattachment.class)
public class Fieldnotebookattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Fieldnotebookattachment, Fieldnotebook> fieldNotebookID;
    public static volatile SingularAttribute<Fieldnotebookattachment, Integer> fieldNotebookAttachmentId;
    public static volatile SingularAttribute<Fieldnotebookattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Fieldnotebookattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Fieldnotebookattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Fieldnotebookattachment, String> remarks;
    public static volatile SingularAttribute<Fieldnotebookattachment, Integer> ordinal;

}