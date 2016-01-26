package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T10:51:25")
@StaticMetamodel(Agentvariant.class)
public class Agentvariant_ extends BaseEntity_ {

    public static volatile SingularAttribute<Agentvariant, String> country;
    public static volatile SingularAttribute<Agentvariant, Short> varType;
    public static volatile SingularAttribute<Agentvariant, Agent> agentID;
    public static volatile SingularAttribute<Agentvariant, String> name;
    public static volatile SingularAttribute<Agentvariant, String> variant;
    public static volatile SingularAttribute<Agentvariant, String> language;
    public static volatile SingularAttribute<Agentvariant, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Agentvariant, Agent> createdByAgentID;
    public static volatile SingularAttribute<Agentvariant, Integer> agentVariantID;

}