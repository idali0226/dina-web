package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Deaccessionpreparation;
import se.nrm.dina.datamodel.Giftpreparation;
import se.nrm.dina.datamodel.Loanpreparation;
import se.nrm.dina.datamodel.Preparationattachment;
import se.nrm.dina.datamodel.Preparationattr;
import se.nrm.dina.datamodel.Preparationattribute;
import se.nrm.dina.datamodel.Preptype;
import se.nrm.dina.datamodel.Storage;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-10T17:35:03")
@StaticMetamodel(Preparation.class)
public class Preparation_ extends BaseEntity_ {

    public static volatile SingularAttribute<Preparation, Short> preparedDatePrecision;
    public static volatile SingularAttribute<Preparation, Preptype> prepTypeID;
    public static volatile SingularAttribute<Preparation, Agent> preparedByID;
    public static volatile ListAttribute<Preparation, Preparationattachment> preparationattachmentList;
    public static volatile SingularAttribute<Preparation, Date> preparedDate;
    public static volatile SingularAttribute<Preparation, String> description;
    public static volatile SingularAttribute<Preparation, String> storageLocation;
    public static volatile SingularAttribute<Preparation, Integer> integer1;
    public static volatile SingularAttribute<Preparation, Float> number1;
    public static volatile SingularAttribute<Preparation, Agent> modifiedByAgentID;
    public static volatile ListAttribute<Preparation, Deaccessionpreparation> deaccessionpreparationList;
    public static volatile SingularAttribute<Preparation, Float> number2;
    public static volatile SingularAttribute<Preparation, Preparationattribute> preparationAttributeID;
    public static volatile SingularAttribute<Preparation, Integer> integer2;
    public static volatile ListAttribute<Preparation, Loanpreparation> loanpreparationList;
    public static volatile SingularAttribute<Preparation, Boolean> yesNo3;
    public static volatile SingularAttribute<Preparation, Boolean> yesNo2;
    public static volatile SingularAttribute<Preparation, Integer> reservedInteger3;
    public static volatile SingularAttribute<Preparation, Boolean> yesNo1;
    public static volatile SingularAttribute<Preparation, Integer> reservedInteger4;
    public static volatile ListAttribute<Preparation, Giftpreparation> giftpreparationList;
    public static volatile SingularAttribute<Preparation, Integer> preparationID;
    public static volatile SingularAttribute<Preparation, Integer> countAmt;
    public static volatile SingularAttribute<Preparation, String> sampleNumber;
    public static volatile SingularAttribute<Preparation, String> text1;
    public static volatile SingularAttribute<Preparation, String> text2;
    public static volatile ListAttribute<Preparation, Preparationattr> preparationattrList;
    public static volatile SingularAttribute<Preparation, Agent> createdByAgentID;
    public static volatile SingularAttribute<Preparation, Integer> collectionMemberID;
    public static volatile SingularAttribute<Preparation, Collectionobject> collectionObjectID;
    public static volatile SingularAttribute<Preparation, String> remarks;
    public static volatile SingularAttribute<Preparation, String> status;
    public static volatile SingularAttribute<Preparation, Storage> storageID;

}