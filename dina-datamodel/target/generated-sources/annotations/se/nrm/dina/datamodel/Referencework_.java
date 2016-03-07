package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Author;
import se.nrm.dina.datamodel.Collectionobjectcitation;
import se.nrm.dina.datamodel.Commonnametxcitation;
import se.nrm.dina.datamodel.Determinationcitation;
import se.nrm.dina.datamodel.Dnasequencingruncitation;
import se.nrm.dina.datamodel.Exsiccata;
import se.nrm.dina.datamodel.Institution;
import se.nrm.dina.datamodel.Journal;
import se.nrm.dina.datamodel.Localitycitation;
import se.nrm.dina.datamodel.Referencework;
import se.nrm.dina.datamodel.Taxoncitation;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-07T10:42:30")
@StaticMetamodel(Referencework.class)
public class Referencework_ extends BaseEntity_ {

    public static volatile ListAttribute<Referencework, Exsiccata> exsiccataList;
    public static volatile SingularAttribute<Referencework, Institution> institutionID;
    public static volatile SingularAttribute<Referencework, String> isbn;
    public static volatile SingularAttribute<Referencework, Float> number1;
    public static volatile ListAttribute<Referencework, Determinationcitation> determinationcitationList;
    public static volatile SingularAttribute<Referencework, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Referencework, Float> number2;
    public static volatile SingularAttribute<Referencework, String> libraryNumber;
    public static volatile SingularAttribute<Referencework, String> title;
    public static volatile ListAttribute<Referencework, Referencework> referenceworkList;
    public static volatile SingularAttribute<Referencework, String> pages;
    public static volatile SingularAttribute<Referencework, String> workDate;
    public static volatile SingularAttribute<Referencework, Boolean> yesNo2;
    public static volatile SingularAttribute<Referencework, Boolean> yesNo1;
    public static volatile ListAttribute<Referencework, Dnasequencingruncitation> dnasequencingruncitationList;
    public static volatile ListAttribute<Referencework, Localitycitation> localitycitationList;
    public static volatile ListAttribute<Referencework, Commonnametxcitation> commonnametxcitationList;
    public static volatile SingularAttribute<Referencework, Boolean> isPublished;
    public static volatile SingularAttribute<Referencework, Journal> journalID;
    public static volatile SingularAttribute<Referencework, String> url;
    public static volatile SingularAttribute<Referencework, String> volume;
    public static volatile SingularAttribute<Referencework, Short> referenceWorkType;
    public static volatile SingularAttribute<Referencework, String> placeOfPublication;
    public static volatile SingularAttribute<Referencework, String> text1;
    public static volatile ListAttribute<Referencework, Author> authorList;
    public static volatile SingularAttribute<Referencework, String> text2;
    public static volatile ListAttribute<Referencework, Taxoncitation> taxoncitationList;
    public static volatile SingularAttribute<Referencework, String> guid;
    public static volatile SingularAttribute<Referencework, String> publisher;
    public static volatile SingularAttribute<Referencework, Agent> createdByAgentID;
    public static volatile ListAttribute<Referencework, Collectionobjectcitation> collectionobjectcitationList;
    public static volatile SingularAttribute<Referencework, Integer> referenceWorkID;
    public static volatile SingularAttribute<Referencework, Referencework> containedRFParentID;
    public static volatile SingularAttribute<Referencework, String> remarks;

}