package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Fieldnotebook;
import se.nrm.dina.datamodel.Fieldnotebookpage;
import se.nrm.dina.datamodel.Fieldnotebookpagesetattachment;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-21T15:02:32")
@StaticMetamodel(Fieldnotebookpageset.class)
public class Fieldnotebookpageset_ extends BaseEntity_ {

    public static volatile SingularAttribute<Fieldnotebookpageset, Agent> agentID;
    public static volatile SingularAttribute<Fieldnotebookpageset, Fieldnotebook> fieldNotebookID;
    public static volatile SingularAttribute<Fieldnotebookpageset, Short> orderNumber;
    public static volatile SingularAttribute<Fieldnotebookpageset, String> method;
    public static volatile ListAttribute<Fieldnotebookpageset, Fieldnotebookpage> fieldnotebookpageList;
    public static volatile SingularAttribute<Fieldnotebookpageset, Date> endDate;
    public static volatile SingularAttribute<Fieldnotebookpageset, String> description;
    public static volatile SingularAttribute<Fieldnotebookpageset, Discipline> disciplineID;
    public static volatile SingularAttribute<Fieldnotebookpageset, Agent> modifiedByAgentID;
    public static volatile ListAttribute<Fieldnotebookpageset, Fieldnotebookpagesetattachment> fieldnotebookpagesetattachmentList;
    public static volatile SingularAttribute<Fieldnotebookpageset, Agent> createdByAgentID;
    public static volatile SingularAttribute<Fieldnotebookpageset, Integer> fieldNotebookPageSetID;
    public static volatile SingularAttribute<Fieldnotebookpageset, Date> startDate;

}