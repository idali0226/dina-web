package se.nrm.dina.datamodel;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accessionagent;
import se.nrm.dina.datamodel.Accessionattachment;
import se.nrm.dina.datamodel.Accessionauthorization;
import se.nrm.dina.datamodel.Addressofrecord;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Appraisal;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Deaccession;
import se.nrm.dina.datamodel.Division;
import se.nrm.dina.datamodel.Repositoryagreement;
import se.nrm.dina.datamodel.Treatmentevent;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-10T12:13:26")
@StaticMetamodel(Accession.class)
public class Accession_ extends BaseEntity_ {

    public static volatile ListAttribute<Accession, Accessionagent> accessionagentList;
    public static volatile SingularAttribute<Accession, Addressofrecord> addressOfRecordID;
    public static volatile SingularAttribute<Accession, String> accessionCondition;
    public static volatile SingularAttribute<Accession, Float> number1;
    public static volatile SingularAttribute<Accession, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Accession, Float> number2;
    public static volatile SingularAttribute<Accession, String> type;
    public static volatile SingularAttribute<Accession, String> accessionNumber;
    public static volatile ListAttribute<Accession, Appraisal> appraisalList;
    public static volatile SingularAttribute<Accession, Boolean> yesNo2;
    public static volatile SingularAttribute<Accession, Date> dateReceived;
    public static volatile SingularAttribute<Accession, Boolean> yesNo1;
    public static volatile ListAttribute<Accession, Treatmentevent> treatmenteventList;
    public static volatile SingularAttribute<Accession, BigDecimal> totalValue;
    public static volatile ListAttribute<Accession, Accessionauthorization> accessionauthorizationList;
    public static volatile SingularAttribute<Accession, Repositoryagreement> repositoryAgreementID;
    public static volatile ListAttribute<Accession, Deaccession> deaccessionList;
    public static volatile SingularAttribute<Accession, Date> dateAccessioned;
    public static volatile SingularAttribute<Accession, Date> dateAcknowledged;
    public static volatile SingularAttribute<Accession, String> verbatimDate;
    public static volatile SingularAttribute<Accession, String> text3;
    public static volatile SingularAttribute<Accession, String> text1;
    public static volatile ListAttribute<Accession, Collectionobject> collectionobjectList;
    public static volatile SingularAttribute<Accession, String> text2;
    public static volatile ListAttribute<Accession, Accessionattachment> accessionattachmentList;
    public static volatile SingularAttribute<Accession, Agent> createdByAgentID;
    public static volatile SingularAttribute<Accession, Division> divisionID;
    public static volatile SingularAttribute<Accession, Integer> accessionID;
    public static volatile SingularAttribute<Accession, String> remarks;
    public static volatile SingularAttribute<Accession, String> status;

}