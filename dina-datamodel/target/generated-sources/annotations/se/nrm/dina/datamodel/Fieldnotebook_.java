package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collection;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Fieldnotebookattachment;
import se.nrm.dina.datamodel.Fieldnotebookpageset;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-16T12:32:56")
@StaticMetamodel(Fieldnotebook.class)
public class Fieldnotebook_ extends BaseEntity_ {

    public static volatile ListAttribute<Fieldnotebook, Fieldnotebookpageset> fieldnotebookpagesetList;
    public static volatile SingularAttribute<Fieldnotebook, Integer> fieldNotebookID;
    public static volatile SingularAttribute<Fieldnotebook, Agent> agentID;
    public static volatile SingularAttribute<Fieldnotebook, Date> endDate;
    public static volatile SingularAttribute<Fieldnotebook, String> description;
    public static volatile SingularAttribute<Fieldnotebook, Discipline> disciplineID;
    public static volatile SingularAttribute<Fieldnotebook, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Fieldnotebook, String> storage;
    public static volatile ListAttribute<Fieldnotebook, Fieldnotebookattachment> fieldnotebookattachmentList;
    public static volatile SingularAttribute<Fieldnotebook, String> name;
    public static volatile SingularAttribute<Fieldnotebook, Agent> createdByAgentID;
    public static volatile SingularAttribute<Fieldnotebook, Collection> collectionID;
    public static volatile SingularAttribute<Fieldnotebook, Date> startDate;

}