package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Addressofrecord;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Division;
import se.nrm.dina.datamodel.Giftagent;
import se.nrm.dina.datamodel.Giftpreparation;
import se.nrm.dina.datamodel.Shipment;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T14:02:07")
@StaticMetamodel(Gift.class)
public class Gift_ extends BaseEntity_ {

    public static volatile ListAttribute<Gift, Giftagent> giftagentList;
    public static volatile SingularAttribute<Gift, String> specialConditions;
    public static volatile SingularAttribute<Gift, Addressofrecord> addressOfRecordID;
    public static volatile SingularAttribute<Gift, String> srcTaxonomy;
    public static volatile SingularAttribute<Gift, Discipline> disciplineID;
    public static volatile SingularAttribute<Gift, Float> number1;
    public static volatile SingularAttribute<Gift, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Gift, Float> number2;
    public static volatile SingularAttribute<Gift, String> srcGeography;
    public static volatile SingularAttribute<Gift, Boolean> isFinancialResponsibility;
    public static volatile SingularAttribute<Gift, Boolean> yesNo2;
    public static volatile SingularAttribute<Gift, Date> dateReceived;
    public static volatile SingularAttribute<Gift, String> purposeOfGift;
    public static volatile SingularAttribute<Gift, Boolean> yesNo1;
    public static volatile ListAttribute<Gift, Giftpreparation> giftpreparationList;
    public static volatile SingularAttribute<Gift, String> receivedComments;
    public static volatile SingularAttribute<Gift, Date> giftDate;
    public static volatile ListAttribute<Gift, Shipment> shipmentList;
    public static volatile SingularAttribute<Gift, Integer> giftID;
    public static volatile SingularAttribute<Gift, String> contents;
    public static volatile SingularAttribute<Gift, String> text1;
    public static volatile SingularAttribute<Gift, String> text2;
    public static volatile SingularAttribute<Gift, Agent> createdByAgentID;
    public static volatile SingularAttribute<Gift, Division> divisionID;
    public static volatile SingularAttribute<Gift, String> remarks;
    public static volatile SingularAttribute<Gift, String> giftNumber;

}