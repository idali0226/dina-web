package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Geography;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-18T10:19:04")
@StaticMetamodel(Agentgeography.class)
public class Agentgeography_ extends BaseEntity_ {

    public static volatile SingularAttribute<Agentgeography, Agent> agentID;
    public static volatile SingularAttribute<Agentgeography, String> role;
    public static volatile SingularAttribute<Agentgeography, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Agentgeography, Agent> createdByAgentID;
    public static volatile SingularAttribute<Agentgeography, Geography> geographyID;
    public static volatile SingularAttribute<Agentgeography, String> remarks;
    public static volatile SingularAttribute<Agentgeography, Integer> agentGeographyID;

}