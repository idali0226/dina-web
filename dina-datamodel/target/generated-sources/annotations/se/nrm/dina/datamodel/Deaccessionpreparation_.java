package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Deaccession;
import se.nrm.dina.datamodel.Loanreturnpreparation;
import se.nrm.dina.datamodel.Preparation;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-21T15:02:32")
@StaticMetamodel(Deaccessionpreparation.class)
public class Deaccessionpreparation_ extends BaseEntity_ {

    public static volatile SingularAttribute<Deaccessionpreparation, Short> quantity;
    public static volatile ListAttribute<Deaccessionpreparation, Loanreturnpreparation> loanreturnpreparationList;
    public static volatile SingularAttribute<Deaccessionpreparation, Deaccession> deaccessionID;
    public static volatile SingularAttribute<Deaccessionpreparation, Preparation> preparationID;
    public static volatile SingularAttribute<Deaccessionpreparation, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Deaccessionpreparation, Agent> createdByAgentID;
    public static volatile SingularAttribute<Deaccessionpreparation, Integer> deaccessionPreparationID;
    public static volatile SingularAttribute<Deaccessionpreparation, String> remarks;

}