package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Borrow;
import se.nrm.dina.datamodel.Exchangein;
import se.nrm.dina.datamodel.Exchangeout;
import se.nrm.dina.datamodel.Gift;
import se.nrm.dina.datamodel.Loan;
import se.nrm.dina.datamodel.Repositoryagreement;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-11T16:29:46")
@StaticMetamodel(Addressofrecord.class)
public class Addressofrecord_ extends BaseEntity_ {

    public static volatile SingularAttribute<Addressofrecord, String> country;
    public static volatile SingularAttribute<Addressofrecord, Agent> agentID;
    public static volatile SingularAttribute<Addressofrecord, String> address;
    public static volatile ListAttribute<Addressofrecord, Borrow> borrowList;
    public static volatile ListAttribute<Addressofrecord, Loan> loanList;
    public static volatile SingularAttribute<Addressofrecord, String> address2;
    public static volatile SingularAttribute<Addressofrecord, String> city;
    public static volatile SingularAttribute<Addressofrecord, Integer> addressOfRecordID;
    public static volatile SingularAttribute<Addressofrecord, String> postalCode;
    public static volatile SingularAttribute<Addressofrecord, Agent> modifiedByAgentID;
    public static volatile ListAttribute<Addressofrecord, Repositoryagreement> repositoryagreementList;
    public static volatile ListAttribute<Addressofrecord, Accession> accessionList;
    public static volatile ListAttribute<Addressofrecord, Gift> giftList;
    public static volatile ListAttribute<Addressofrecord, Exchangein> exchangeinList;
    public static volatile SingularAttribute<Addressofrecord, Agent> createdByAgentID;
    public static volatile SingularAttribute<Addressofrecord, String> state;
    public static volatile ListAttribute<Addressofrecord, Exchangeout> exchangeoutList;
    public static volatile SingularAttribute<Addressofrecord, String> remarks;

}