package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectingevent;
import se.nrm.dina.datamodel.Division;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T11:48:45")
@StaticMetamodel(Collector.class)
public class Collector_ extends BaseEntity_ {

    public static volatile SingularAttribute<Collector, Agent> agentID;
    public static volatile SingularAttribute<Collector, Integer> orderNumber;
    public static volatile SingularAttribute<Collector, Boolean> isPrimary;
    public static volatile SingularAttribute<Collector, Collectingevent> collectingEventID;
    public static volatile SingularAttribute<Collector, Integer> collectorID;
    public static volatile SingularAttribute<Collector, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Collector, Agent> createdByAgentID;
    public static volatile SingularAttribute<Collector, Division> divisionID;
    public static volatile SingularAttribute<Collector, String> remarks;

}