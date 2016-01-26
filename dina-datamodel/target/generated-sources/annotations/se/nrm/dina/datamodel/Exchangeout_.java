package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Addressofrecord;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Division;
import se.nrm.dina.datamodel.Shipment;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T10:51:25")
@StaticMetamodel(Exchangeout.class)
public class Exchangeout_ extends BaseEntity_ {

    public static volatile SingularAttribute<Exchangeout, Date> exchangeDate;
    public static volatile SingularAttribute<Exchangeout, Short> quantityExchanged;
    public static volatile SingularAttribute<Exchangeout, Addressofrecord> addressOfRecordID;
    public static volatile SingularAttribute<Exchangeout, Agent> catalogedByID;
    public static volatile SingularAttribute<Exchangeout, String> srcTaxonomy;
    public static volatile SingularAttribute<Exchangeout, Float> number1;
    public static volatile SingularAttribute<Exchangeout, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Exchangeout, Float> number2;
    public static volatile ListAttribute<Exchangeout, Shipment> shipmentList;
    public static volatile SingularAttribute<Exchangeout, String> srcGeography;
    public static volatile SingularAttribute<Exchangeout, String> descriptionOfMaterial;
    public static volatile SingularAttribute<Exchangeout, Boolean> yesNo2;
    public static volatile SingularAttribute<Exchangeout, String> contents;
    public static volatile SingularAttribute<Exchangeout, String> text1;
    public static volatile SingularAttribute<Exchangeout, Boolean> yesNo1;
    public static volatile SingularAttribute<Exchangeout, String> text2;
    public static volatile SingularAttribute<Exchangeout, Agent> sentToOrganizationID;
    public static volatile SingularAttribute<Exchangeout, Agent> createdByAgentID;
    public static volatile SingularAttribute<Exchangeout, Division> divisionID;
    public static volatile SingularAttribute<Exchangeout, String> exchangeOutNumber;
    public static volatile SingularAttribute<Exchangeout, Integer> exchangeOutID;
    public static volatile SingularAttribute<Exchangeout, String> remarks;

}