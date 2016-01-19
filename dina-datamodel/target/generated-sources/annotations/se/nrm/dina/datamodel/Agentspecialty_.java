package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;

@Generated(value="EclipseLink-2.7.0.v20160118-rNA", date="2016-01-19T06:20:34")
@StaticMetamodel(Agentspecialty.class)
public class Agentspecialty_ extends BaseEntity_ {

    public static volatile SingularAttribute<Agentspecialty, Agent> agentID;
    public static volatile SingularAttribute<Agentspecialty, Integer> orderNumber;
    public static volatile SingularAttribute<Agentspecialty, String> specialtyName;
    public static volatile SingularAttribute<Agentspecialty, Integer> agentSpecialtyID;
    public static volatile SingularAttribute<Agentspecialty, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Agentspecialty, Agent> createdByAgentID;

}