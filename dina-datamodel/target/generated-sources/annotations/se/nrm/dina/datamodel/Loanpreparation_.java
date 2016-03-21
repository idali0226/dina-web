package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Loan;
import se.nrm.dina.datamodel.Loanreturnpreparation;
import se.nrm.dina.datamodel.Preparation;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:43")
@StaticMetamodel(Loanpreparation.class)
public class Loanpreparation_ extends BaseEntity_ {

    public static volatile SingularAttribute<Loanpreparation, String> inComments;
    public static volatile SingularAttribute<Loanpreparation, Integer> quantityReturned;
    public static volatile SingularAttribute<Loanpreparation, Integer> loanPreparationID;
    public static volatile SingularAttribute<Loanpreparation, Integer> quantity;
    public static volatile SingularAttribute<Loanpreparation, Discipline> disciplineID;
    public static volatile SingularAttribute<Loanpreparation, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Loanpreparation, String> outComments;
    public static volatile SingularAttribute<Loanpreparation, Integer> quantityResolved;
    public static volatile SingularAttribute<Loanpreparation, String> descriptionOfMaterial;
    public static volatile ListAttribute<Loanpreparation, Loanreturnpreparation> loanreturnpreparationList;
    public static volatile SingularAttribute<Loanpreparation, Preparation> preparationID;
    public static volatile SingularAttribute<Loanpreparation, Agent> createdByAgentID;
    public static volatile SingularAttribute<Loanpreparation, Boolean> isResolved;
    public static volatile SingularAttribute<Loanpreparation, Loan> loanID;
    public static volatile SingularAttribute<Loanpreparation, String> receivedComments;

}