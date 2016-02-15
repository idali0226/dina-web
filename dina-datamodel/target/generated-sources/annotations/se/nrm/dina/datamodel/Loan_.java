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
import se.nrm.dina.datamodel.Loanagent;
import se.nrm.dina.datamodel.Loanattachment;
import se.nrm.dina.datamodel.Loanpreparation;
import se.nrm.dina.datamodel.Shipment;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T15:12:39")
@StaticMetamodel(Loan.class)
public class Loan_ extends BaseEntity_ {

    public static volatile SingularAttribute<Loan, String> specialConditions;
    public static volatile SingularAttribute<Loan, Addressofrecord> addressOfRecordID;
    public static volatile SingularAttribute<Loan, String> srcTaxonomy;
    public static volatile SingularAttribute<Loan, Discipline> disciplineID;
    public static volatile SingularAttribute<Loan, Float> number1;
    public static volatile SingularAttribute<Loan, Date> overdueNotiSetDate;
    public static volatile SingularAttribute<Loan, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Loan, Date> currentDueDate;
    public static volatile SingularAttribute<Loan, Float> number2;
    public static volatile SingularAttribute<Loan, Date> dateClosed;
    public static volatile ListAttribute<Loan, Loanagent> loanagentList;
    public static volatile SingularAttribute<Loan, String> purposeOfLoan;
    public static volatile SingularAttribute<Loan, String> srcGeography;
    public static volatile ListAttribute<Loan, Loanpreparation> loanpreparationList;
    public static volatile SingularAttribute<Loan, Boolean> isFinancialResponsibility;
    public static volatile SingularAttribute<Loan, Date> originalDueDate;
    public static volatile SingularAttribute<Loan, Boolean> yesNo2;
    public static volatile SingularAttribute<Loan, Date> dateReceived;
    public static volatile SingularAttribute<Loan, Boolean> yesNo1;
    public static volatile SingularAttribute<Loan, Integer> loanID;
    public static volatile SingularAttribute<Loan, String> receivedComments;
    public static volatile ListAttribute<Loan, Loanattachment> loanattachmentList;
    public static volatile ListAttribute<Loan, Shipment> shipmentList;
    public static volatile SingularAttribute<Loan, Boolean> isClosed;
    public static volatile SingularAttribute<Loan, String> contents;
    public static volatile SingularAttribute<Loan, String> text1;
    public static volatile SingularAttribute<Loan, String> text2;
    public static volatile SingularAttribute<Loan, Date> loanDate;
    public static volatile SingularAttribute<Loan, Agent> createdByAgentID;
    public static volatile SingularAttribute<Loan, Division> divisionID;
    public static volatile SingularAttribute<Loan, String> loanNumber;
    public static volatile SingularAttribute<Loan, String> remarks;

}