package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Accessionagent;
import se.nrm.dina.datamodel.Accessionauthorization;
import se.nrm.dina.datamodel.Addressofrecord;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Division;
import se.nrm.dina.datamodel.Repositoryagreementattachment;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-16T12:32:55")
@StaticMetamodel(Repositoryagreement.class)
public class Repositoryagreement_ extends BaseEntity_ {

    public static volatile ListAttribute<Repositoryagreement, Accessionauthorization> accessionauthorizationList;
    public static volatile SingularAttribute<Repositoryagreement, Agent> agentID;
    public static volatile ListAttribute<Repositoryagreement, Accessionagent> accessionagentList;
    public static volatile SingularAttribute<Repositoryagreement, Date> endDate;
    public static volatile SingularAttribute<Repositoryagreement, Addressofrecord> addressOfRecordID;
    public static volatile SingularAttribute<Repositoryagreement, Integer> repositoryAgreementID;
    public static volatile SingularAttribute<Repositoryagreement, Float> number1;
    public static volatile SingularAttribute<Repositoryagreement, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Repositoryagreement, Float> number2;
    public static volatile SingularAttribute<Repositoryagreement, String> repositoryAgreementNumber;
    public static volatile ListAttribute<Repositoryagreement, Accession> accessionList;
    public static volatile SingularAttribute<Repositoryagreement, String> text3;
    public static volatile SingularAttribute<Repositoryagreement, Boolean> yesNo2;
    public static volatile SingularAttribute<Repositoryagreement, Date> dateReceived;
    public static volatile SingularAttribute<Repositoryagreement, String> text1;
    public static volatile SingularAttribute<Repositoryagreement, Boolean> yesNo1;
    public static volatile SingularAttribute<Repositoryagreement, String> text2;
    public static volatile SingularAttribute<Repositoryagreement, Agent> createdByAgentID;
    public static volatile SingularAttribute<Repositoryagreement, Division> divisionID;
    public static volatile SingularAttribute<Repositoryagreement, String> remarks;
    public static volatile SingularAttribute<Repositoryagreement, Date> startDate;
    public static volatile SingularAttribute<Repositoryagreement, String> status;
    public static volatile ListAttribute<Repositoryagreement, Repositoryagreementattachment> repositoryagreementattachmentList;

}