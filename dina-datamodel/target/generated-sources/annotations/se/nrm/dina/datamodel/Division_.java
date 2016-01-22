package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Address;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Autonumberingscheme;
import se.nrm.dina.datamodel.Collector;
import se.nrm.dina.datamodel.Conservdescription;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Exchangein;
import se.nrm.dina.datamodel.Exchangeout;
import se.nrm.dina.datamodel.Gift;
import se.nrm.dina.datamodel.Groupperson;
import se.nrm.dina.datamodel.Institution;
import se.nrm.dina.datamodel.Loan;
import se.nrm.dina.datamodel.Repositoryagreement;
import se.nrm.dina.datamodel.Treatmentevent;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T11:48:45")
@StaticMetamodel(Division.class)
public class Division_ extends BaseEntity_ {

    public static volatile SingularAttribute<Division, Integer> userGroupScopeId;
    public static volatile SingularAttribute<Division, String> disciplineType;
    public static volatile SingularAttribute<Division, Institution> institutionID;
    public static volatile SingularAttribute<Division, String> description;
    public static volatile SingularAttribute<Division, Agent> modifiedByAgentID;
    public static volatile ListAttribute<Division, Repositoryagreement> repositoryagreementList;
    public static volatile ListAttribute<Division, Accession> accessionList;
    public static volatile SingularAttribute<Division, String> regNumber;
    public static volatile ListAttribute<Division, Treatmentevent> treatmenteventList;
    public static volatile ListAttribute<Division, Exchangein> exchangeinList;
    public static volatile ListAttribute<Division, Groupperson> grouppersonList;
    public static volatile ListAttribute<Division, Autonumberingscheme> autonumberingschemeList;
    public static volatile SingularAttribute<Division, String> altName;
    public static volatile SingularAttribute<Division, Integer> divisionId;
    public static volatile ListAttribute<Division, Agent> agentList;
    public static volatile SingularAttribute<Division, String> iconURI;
    public static volatile ListAttribute<Division, Loan> loanList;
    public static volatile ListAttribute<Division, Discipline> disciplineList;
    public static volatile SingularAttribute<Division, String> uri;
    public static volatile ListAttribute<Division, Conservdescription> conservdescriptionList;
    public static volatile SingularAttribute<Division, Address> addressID;
    public static volatile ListAttribute<Division, Collector> collectorList;
    public static volatile ListAttribute<Division, Gift> giftList;
    public static volatile SingularAttribute<Division, String> name;
    public static volatile SingularAttribute<Division, Agent> createdByAgentID;
    public static volatile SingularAttribute<Division, String> abbrev;
    public static volatile ListAttribute<Division, Exchangeout> exchangeoutList;
    public static volatile SingularAttribute<Division, String> remarks;

}