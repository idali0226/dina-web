package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Fieldnotebookpage;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T16:21:31")
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