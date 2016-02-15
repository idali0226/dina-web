package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Deaccession;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T15:12:39")
@StaticMetamodel(Deaccessionagent.class)
public class Deaccessionagent_ extends BaseEntity_ {

    public static volatile SingularAttribute<Deaccessionagent, Agent> agentID;
    public static volatile SingularAttribute<Deaccessionagent, String> role;
    public static volatile SingularAttribute<Deaccessionagent, Integer> deaccessionAgentID;
    public static volatile SingularAttribute<Deaccessionagent, Deaccession> deaccessionID;
    public static volatile SingularAttribute<Deaccessionagent, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Deaccessionagent, Agent> createdByAgentID;
    public static volatile SingularAttribute<Deaccessionagent, String> remarks;

}