package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Borrow;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-01T16:46:53")
@StaticMetamodel(Borrowagent.class)
public class Borrowagent_ extends BaseEntity_ {

    public static volatile SingularAttribute<Borrowagent, Agent> agentID;
    public static volatile SingularAttribute<Borrowagent, String> role;
    public static volatile SingularAttribute<Borrowagent, Integer> borrowAgentID;
    public static volatile SingularAttribute<Borrowagent, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Borrowagent, Agent> createdByAgentID;
    public static volatile SingularAttribute<Borrowagent, Borrow> borrowID;
    public static volatile SingularAttribute<Borrowagent, Integer> collectionMemberID;
    public static volatile SingularAttribute<Borrowagent, String> remarks;

}