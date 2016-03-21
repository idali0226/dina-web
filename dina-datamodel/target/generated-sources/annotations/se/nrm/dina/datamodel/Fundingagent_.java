package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:43")
@StaticMetamodel(Fundingagent.class)
public class Fundingagent_ extends BaseEntity_ {

    public static volatile SingularAttribute<Fundingagent, Integer> agentID;
    public static volatile SingularAttribute<Fundingagent, Integer> orderNumber;
    public static volatile SingularAttribute<Fundingagent, Integer> fundingAgentID;
    public static volatile SingularAttribute<Fundingagent, Boolean> isPrimary;
    public static volatile SingularAttribute<Fundingagent, Integer> createdByAgentID;
    public static volatile SingularAttribute<Fundingagent, Integer> modifiedByAgentID;
    public static volatile SingularAttribute<Fundingagent, Integer> divisionID;
    public static volatile SingularAttribute<Fundingagent, String> type;
    public static volatile SingularAttribute<Fundingagent, Integer> collectingTripID;
    public static volatile SingularAttribute<Fundingagent, String> remarks;

}