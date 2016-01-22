package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Addressofrecord;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Borrowagent;
import se.nrm.dina.datamodel.Borrowmaterial;
import se.nrm.dina.datamodel.Shipment;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T18:36:38")
@StaticMetamodel(Borrow.class)
public class Borrow_ extends BaseEntity_ {

    public static volatile ListAttribute<Borrow, Borrowmaterial> borrowmaterialList;
    public static volatile SingularAttribute<Borrow, Addressofrecord> addressOfRecordID;
    public static volatile SingularAttribute<Borrow, Short> borrowDatePrecision;
    public static volatile SingularAttribute<Borrow, Float> number1;
    public static volatile SingularAttribute<Borrow, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Borrow, Date> currentDueDate;
    public static volatile SingularAttribute<Borrow, Float> number2;
    public static volatile SingularAttribute<Borrow, Integer> numberOfItemsBorrowed;
    public static volatile SingularAttribute<Borrow, Date> dateClosed;
    public static volatile SingularAttribute<Borrow, Boolean> isFinancialResponsibility;
    public static volatile SingularAttribute<Borrow, Date> originalDueDate;
    public static volatile SingularAttribute<Borrow, Boolean> yesNo2;
    public static volatile SingularAttribute<Borrow, Boolean> yesNo1;
    public static volatile SingularAttribute<Borrow, String> invoiceNumber;
    public static volatile SingularAttribute<Borrow, Integer> borrowID;
    public static volatile SingularAttribute<Borrow, Date> receivedDate;
    public static volatile ListAttribute<Borrow, Borrowagent> borrowagentList;
    public static volatile SingularAttribute<Borrow, Date> borrowDate;
    public static volatile ListAttribute<Borrow, Shipment> shipmentList;
    public static volatile SingularAttribute<Borrow, Boolean> isClosed;
    public static volatile SingularAttribute<Borrow, String> text1;
    public static volatile SingularAttribute<Borrow, String> text2;
    public static volatile SingularAttribute<Borrow, Agent> createdByAgentID;
    public static volatile SingularAttribute<Borrow, Integer> collectionMemberID;
    public static volatile SingularAttribute<Borrow, String> remarks;

}