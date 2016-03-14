package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Fieldnotebookpage;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-14T13:38:26")
@StaticMetamodel(Fieldnotebookpageattachment.class)
public class Fieldnotebookpageattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Fieldnotebookpageattachment, Integer> fieldNotebookPageAttachmentId;
    public static volatile SingularAttribute<Fieldnotebookpageattachment, Fieldnotebookpage> fieldNotebookPageID;
    public static volatile SingularAttribute<Fieldnotebookpageattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Fieldnotebookpageattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Fieldnotebookpageattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Fieldnotebookpageattachment, String> remarks;
    public static volatile SingularAttribute<Fieldnotebookpageattachment, Integer> ordinal;

}