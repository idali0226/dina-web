package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Loan;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-10T12:13:26")
@StaticMetamodel(Loanagent.class)
public class Loanagent_ extends BaseEntity_ {

    public static volatile SingularAttribute<Loanagent, Agent> agentID;
    public static volatile SingularAttribute<Loanagent, String> role;
    public static volatile SingularAttribute<Loanagent, Discipline> disciplineID;
    public static volatile SingularAttribute<Loanagent, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Loanagent, Agent> createdByAgentID;
    public static volatile SingularAttribute<Loanagent, Integer> loanAgentID;
    public static volatile SingularAttribute<Loanagent, String> remarks;
    public static volatile SingularAttribute<Loanagent, Loan> loanID;

}