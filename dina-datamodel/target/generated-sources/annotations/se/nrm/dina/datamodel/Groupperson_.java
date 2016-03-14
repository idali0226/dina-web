package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Division;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-14T13:38:26")
@StaticMetamodel(Groupperson.class)
public class Groupperson_ extends BaseEntity_ {

    public static volatile SingularAttribute<Groupperson, Short> orderNumber;
    public static volatile SingularAttribute<Groupperson, Agent> groupID;
    public static volatile SingularAttribute<Groupperson, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Groupperson, Agent> createdByAgentID;
    public static volatile SingularAttribute<Groupperson, Division> divisionID;
    public static volatile SingularAttribute<Groupperson, Integer> groupPersonID;
    public static volatile SingularAttribute<Groupperson, String> remarks;
    public static volatile SingularAttribute<Groupperson, Agent> memberID;

}