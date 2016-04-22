package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Dnasequenceattachment;
import se.nrm.dina.datamodel.Dnasequencingrun;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-22T09:50:41")
@StaticMetamodel(Dnasequence.class)
public class Dnasequence_ extends BaseEntity_ {

    public static volatile SingularAttribute<Dnasequence, Integer> compT;
    public static volatile SingularAttribute<Dnasequence, Float> number3;
    public static volatile SingularAttribute<Dnasequence, Float> number1;
    public static volatile SingularAttribute<Dnasequence, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Dnasequence, Float> number2;
    public static volatile SingularAttribute<Dnasequence, Integer> ambiguousResidues;
    public static volatile SingularAttribute<Dnasequence, Integer> totalResidues;
    public static volatile SingularAttribute<Dnasequence, Boolean> yesNo3;
    public static volatile SingularAttribute<Dnasequence, String> targetMarker;
    public static volatile SingularAttribute<Dnasequence, Boolean> yesNo2;
    public static volatile SingularAttribute<Dnasequence, Boolean> yesNo1;
    public static volatile SingularAttribute<Dnasequence, String> bOLDSampleID;
    public static volatile SingularAttribute<Dnasequence, Agent> agentID;
    public static volatile ListAttribute<Dnasequence, Dnasequencingrun> dnasequencingrunList;
    public static volatile SingularAttribute<Dnasequence, String> bOLDTranslationMatrix;
    public static volatile SingularAttribute<Dnasequence, String> bOLDBarcodeID;
    public static volatile SingularAttribute<Dnasequence, String> genBankAccessionNumber;
    public static volatile ListAttribute<Dnasequence, Dnasequenceattachment> dnasequenceattachmentList;
    public static volatile SingularAttribute<Dnasequence, Integer> compC;
    public static volatile SingularAttribute<Dnasequence, String> text3;
    public static volatile SingularAttribute<Dnasequence, Integer> compA;
    public static volatile SingularAttribute<Dnasequence, String> text1;
    public static volatile SingularAttribute<Dnasequence, String> text2;
    public static volatile SingularAttribute<Dnasequence, String> moleculeType;
    public static volatile SingularAttribute<Dnasequence, Agent> createdByAgentID;
    public static volatile SingularAttribute<Dnasequence, Integer> collectionMemberID;
    public static volatile SingularAttribute<Dnasequence, String> geneSequence;
    public static volatile SingularAttribute<Dnasequence, Collectionobject> collectionObjectID;
    public static volatile SingularAttribute<Dnasequence, Integer> dnaSequenceID;
    public static volatile SingularAttribute<Dnasequence, Date> bOLDLastUpdateDate;
    public static volatile SingularAttribute<Dnasequence, String> remarks;
    public static volatile SingularAttribute<Dnasequence, Integer> compG;

}