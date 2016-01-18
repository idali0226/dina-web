package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Repositoryagreement;

@Generated(value="EclipseLink-2.7.0.v20160114-rNA", date="2016-01-18T14:16:55")
@StaticMetamodel(Accessionagent.class)
public class Accessionagent_ extends BaseEntity_ {

    public static volatile SingularAttribute<Accessionagent, Agent> agentID;
    public static volatile SingularAttribute<Accessionagent, String> role;
    public static volatile SingularAttribute<Accessionagent, Repositoryagreement> repositoryAgreementID;
    public static volatile SingularAttribute<Accessionagent, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Accessionagent, Agent> createdByAgentID;
    public static volatile SingularAttribute<Accessionagent, Integer> accessionAgentID;
    public static volatile SingularAttribute<Accessionagent, String> remarks;
    public static volatile SingularAttribute<Accessionagent, Accession> accessionID;

}