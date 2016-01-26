package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T15:11:50")
@StaticMetamodel(Datatype.class)
public class Datatype_ extends BaseEntity_ {

    public static volatile SingularAttribute<Datatype, Integer> dataTypeID;
    public static volatile SingularAttribute<Datatype, String> name;
    public static volatile ListAttribute<Datatype, Discipline> disciplineList;
    public static volatile SingularAttribute<Datatype, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Datatype, Agent> createdByAgentID;

}