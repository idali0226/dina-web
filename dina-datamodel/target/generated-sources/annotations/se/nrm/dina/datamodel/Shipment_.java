package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Borrow;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Exchangeout;
import se.nrm.dina.datamodel.Gift;
import se.nrm.dina.datamodel.Loan;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-14T13:38:26")
@StaticMetamodel(Shipment.class)
public class Shipment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Shipment, Agent> shipperID;
    public static volatile SingularAttribute<Shipment, Discipline> disciplineID;
    public static volatile SingularAttribute<Shipment, String> weight;
    public static volatile SingularAttribute<Shipment, Float> number1;
    public static volatile SingularAttribute<Shipment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Shipment, Agent> shippedToID;
    public static volatile SingularAttribute<Shipment, Float> number2;
    public static volatile SingularAttribute<Shipment, Short> numberOfPackages;
    public static volatile SingularAttribute<Shipment, String> shipmentMethod;
    public static volatile SingularAttribute<Shipment, Gift> giftID;
    public static volatile SingularAttribute<Shipment, String> insuredForAmount;
    public static volatile SingularAttribute<Shipment, Boolean> yesNo2;
    public static volatile SingularAttribute<Shipment, Integer> shipmentID;
    public static volatile SingularAttribute<Shipment, Boolean> yesNo1;
    public static volatile SingularAttribute<Shipment, String> text1;
    public static volatile SingularAttribute<Shipment, String> text2;
    public static volatile SingularAttribute<Shipment, Borrow> borrowID;
    public static volatile SingularAttribute<Shipment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Shipment, Date> shipmentDate;
    public static volatile SingularAttribute<Shipment, String> shipmentNumber;
    public static volatile SingularAttribute<Shipment, Loan> loanID;
    public static volatile SingularAttribute<Shipment, String> remarks;
    public static volatile SingularAttribute<Shipment, Exchangeout> exchangeOutID;
    public static volatile SingularAttribute<Shipment, Agent> shippedByID;

}