package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Fieldnotebookpageattachment;
import se.nrm.dina.datamodel.Fieldnotebookpageset;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T18:56:38")
@StaticMetamodel(Fieldnotebookpage.class)
public class Fieldnotebookpage_ extends BaseEntity_ {

    public static volatile SingularAttribute<Fieldnotebookpage, String> pageNumber;
    public static volatile ListAttribute<Fieldnotebookpage, Fieldnotebookpageattachment> fieldnotebookpageattachmentList;
    public static volatile SingularAttribute<Fieldnotebookpage, Integer> fieldNotebookPageID;
    public static volatile ListAttribute<Fieldnotebookpage, Collectionobject> collectionobjectList;
    public static volatile SingularAttribute<Fieldnotebookpage, String> description;
    public static volatile SingularAttribute<Fieldnotebookpage, Discipline> disciplineID;
    public static volatile SingularAttribute<Fieldnotebookpage, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Fieldnotebookpage, Agent> createdByAgentID;
    public static volatile SingularAttribute<Fieldnotebookpage, Fieldnotebookpageset> fieldNotebookPageSetID;
    public static volatile SingularAttribute<Fieldnotebookpage, Date> scanDate;

}