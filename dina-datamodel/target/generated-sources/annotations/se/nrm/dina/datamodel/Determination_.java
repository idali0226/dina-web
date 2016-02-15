package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Determinationcitation;
import se.nrm.dina.datamodel.Taxon;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T16:21:31")
@StaticMetamodel(Determination.class)
public class Determination_ extends BaseEntity_ {

    public static volatile SingularAttribute<Determination, String> typeStatusName;
    public static volatile SingularAttribute<Determination, String> featureOrBasis;
    public static volatile SingularAttribute<Determination, Short> determinedDatePrecision;
    public static volatile SingularAttribute<Determination, Agent> determinerID;
    public static volatile SingularAttribute<Determination, Float> number1;
    public static volatile SingularAttribute<Determination, Agent> modifiedByAgentID;
    public static volatile ListAttribute<Determination, Determinationcitation> determinationcitationList;
    public static volatile SingularAttribute<Determination, Float> number2;
    public static volatile SingularAttribute<Determination, String> varQualifier;
    public static volatile SingularAttribute<Determination, Taxon> taxonID;
    public static volatile SingularAttribute<Determination, Boolean> yesNo2;
    public static volatile SingularAttribute<Determination, Date> determinedDate;
    public static volatile SingularAttribute<Determination, Boolean> yesNo1;
    public static volatile SingularAttribute<Determination, Taxon> preferredTaxonID;
    public static volatile SingularAttribute<Determination, String> addendum;
    public static volatile SingularAttribute<Determination, String> method;
    public static volatile SingularAttribute<Determination, String> confidence;
    public static volatile SingularAttribute<Determination, String> alternateName;
    public static volatile SingularAttribute<Determination, String> nameUsage;
    public static volatile SingularAttribute<Determination, String> subSpQualifier;
    public static volatile SingularAttribute<Determination, Boolean> isCurrent;
    public static volatile SingularAttribute<Determination, String> text1;
    public static volatile SingularAttribute<Determination, String> qualifier;
    public static volatile SingularAttribute<Determination, String> text2;
    public static volatile SingularAttribute<Determination, String> guid;
    public static volatile SingularAttribute<Determination, Agent> createdByAgentID;
    public static volatile SingularAttribute<Determination, Integer> determinationID;
    public static volatile SingularAttribute<Determination, Integer> collectionMemberID;
    public static volatile SingularAttribute<Determination, Collectionobject> collectionObjectID;
    public static volatile SingularAttribute<Determination, String> remarks;

}