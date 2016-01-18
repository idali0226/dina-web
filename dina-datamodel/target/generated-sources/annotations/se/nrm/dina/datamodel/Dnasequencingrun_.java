package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Dnasequence;
import se.nrm.dina.datamodel.Dnasequencerunattachment;
import se.nrm.dina.datamodel.Dnasequencingruncitation;

@Generated(value="EclipseLink-2.7.0.v20160114-rNA", date="2016-01-18T16:49:49")
@StaticMetamodel(Dnasequencingrun.class)
public class Dnasequencingrun_ extends BaseEntity_ {

    public static volatile SingularAttribute<Dnasequencingrun, String> sequencePrimerCode;
    public static volatile SingularAttribute<Dnasequencingrun, Date> runDate;
    public static volatile SingularAttribute<Dnasequencingrun, String> sequencePrimerSequence53;
    public static volatile SingularAttribute<Dnasequencingrun, Agent> runByAgentID;
    public static volatile SingularAttribute<Dnasequencingrun, String> traceFileName;
    public static volatile SingularAttribute<Dnasequencingrun, Float> number3;
    public static volatile SingularAttribute<Dnasequencingrun, Integer> dNASequencingRunID;
    public static volatile SingularAttribute<Dnasequencingrun, Float> number1;
    public static volatile SingularAttribute<Dnasequencingrun, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Dnasequencingrun, Float> number2;
    public static volatile SingularAttribute<Dnasequencingrun, Boolean> pCRCocktailPrimer;
    public static volatile SingularAttribute<Dnasequencingrun, String> pCRPrimerSequence53;
    public static volatile SingularAttribute<Dnasequencingrun, String> readDirection;
    public static volatile ListAttribute<Dnasequencingrun, Dnasequencerunattachment> dnasequencerunattachmentList;
    public static volatile SingularAttribute<Dnasequencingrun, Boolean> yesNo3;
    public static volatile SingularAttribute<Dnasequencingrun, Agent> preparedByAgentID;
    public static volatile SingularAttribute<Dnasequencingrun, Boolean> yesNo2;
    public static volatile SingularAttribute<Dnasequencingrun, Boolean> yesNo1;
    public static volatile SingularAttribute<Dnasequencingrun, String> sequencePrimerName;
    public static volatile SingularAttribute<Dnasequencingrun, String> pCRPrimerName;
    public static volatile SingularAttribute<Dnasequencingrun, String> pCRForwardPrimerCode;
    public static volatile ListAttribute<Dnasequencingrun, Dnasequencingruncitation> dnasequencingruncitationList;
    public static volatile SingularAttribute<Dnasequencingrun, Boolean> sequenceCocktailPrimer;
    public static volatile SingularAttribute<Dnasequencingrun, String> pCRReversePrimerCode;
    public static volatile SingularAttribute<Dnasequencingrun, Dnasequence> dNASequenceID;
    public static volatile SingularAttribute<Dnasequencingrun, String> text3;
    public static volatile SingularAttribute<Dnasequencingrun, String> scoreFileName;
    public static volatile SingularAttribute<Dnasequencingrun, String> text1;
    public static volatile SingularAttribute<Dnasequencingrun, String> text2;
    public static volatile SingularAttribute<Dnasequencingrun, Agent> createdByAgentID;
    public static volatile SingularAttribute<Dnasequencingrun, Integer> collectionMemberID;
    public static volatile SingularAttribute<Dnasequencingrun, String> geneSequence;
    public static volatile SingularAttribute<Dnasequencingrun, String> remarks;
    public static volatile SingularAttribute<Dnasequencingrun, Integer> ordinal;

}