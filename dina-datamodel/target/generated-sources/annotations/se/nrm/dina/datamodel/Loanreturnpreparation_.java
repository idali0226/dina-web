package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Deaccessionpreparation;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Loanpreparation;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T12:22:39")
@StaticMetamodel(Loanreturnpreparation.class)
public class Loanreturnpreparation_ extends BaseEntity_ {

    public static volatile SingularAttribute<Loanreturnpreparation, Integer> quantityReturned;
    public static volatile SingularAttribute<Loanreturnpreparation, Agent> receivedByID;
    public static volatile SingularAttribute<Loanreturnpreparation, Loanpreparation> loanPreparationID;
    public static volatile SingularAttribute<Loanreturnpreparation, Integer> loanReturnPreparationID;
    public static volatile SingularAttribute<Loanreturnpreparation, Discipline> disciplineID;
    public static volatile SingularAttribute<Loanreturnpreparation, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Loanreturnpreparation, Agent> createdByAgentID;
    public static volatile SingularAttribute<Loanreturnpreparation, Integer> quantityResolved;
    public static volatile SingularAttribute<Loanreturnpreparation, String> remarks;
    public static volatile SingularAttribute<Loanreturnpreparation, Deaccessionpreparation> deaccessionPreparationID;
    public static volatile SingularAttribute<Loanreturnpreparation, Date> returnedDate;

}