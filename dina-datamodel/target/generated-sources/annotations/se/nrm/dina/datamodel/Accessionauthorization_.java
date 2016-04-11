package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Permit;
import se.nrm.dina.datamodel.Repositoryagreement;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-11T16:29:46")
@StaticMetamodel(Accessionauthorization.class)
public class Accessionauthorization_ extends BaseEntity_ {

    public static volatile SingularAttribute<Accessionauthorization, Integer> accessionAuthorizationID;
    public static volatile SingularAttribute<Accessionauthorization, Permit> permitID;
    public static volatile SingularAttribute<Accessionauthorization, Repositoryagreement> repositoryAgreementID;
    public static volatile SingularAttribute<Accessionauthorization, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Accessionauthorization, Agent> createdByAgentID;
    public static volatile SingularAttribute<Accessionauthorization, String> remarks;
    public static volatile SingularAttribute<Accessionauthorization, Accession> accessionID;

}