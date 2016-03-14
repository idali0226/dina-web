package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Gift;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-14T13:38:27")
@StaticMetamodel(Giftagent.class)
public class Giftagent_ extends BaseEntity_ {

    public static volatile SingularAttribute<Giftagent, Gift> giftID;
    public static volatile SingularAttribute<Giftagent, Agent> agentID;
    public static volatile SingularAttribute<Giftagent, String> role;
    public static volatile SingularAttribute<Giftagent, Discipline> disciplineID;
    public static volatile SingularAttribute<Giftagent, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Giftagent, Agent> createdByAgentID;
    public static volatile SingularAttribute<Giftagent, Integer> giftAgentID;
    public static volatile SingularAttribute<Giftagent, String> remarks;

}