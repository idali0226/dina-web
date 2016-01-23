package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Deaccession;
import se.nrm.dina.datamodel.Loanreturnpreparation;
import se.nrm.dina.datamodel.Preparation;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T16:50:16")
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