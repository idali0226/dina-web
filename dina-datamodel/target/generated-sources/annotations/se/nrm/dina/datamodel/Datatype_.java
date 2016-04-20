package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-20T13:57:07")
@StaticMetamodel(Datatype.class)
public class Datatype_ extends BaseEntity_ {

    public static volatile SingularAttribute<Datatype, Integer> dataTypeID;
    public static volatile SingularAttribute<Datatype, String> name;
    public static volatile ListAttribute<Datatype, Discipline> disciplineList;
    public static volatile SingularAttribute<Datatype, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Datatype, Agent> createdByAgentID;

}