package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Gift;
import se.nrm.dina.datamodel.Preparation;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-14T13:38:27")
@StaticMetamodel(Giftpreparation.class)
public class Giftpreparation_ extends BaseEntity_ {

    public static volatile SingularAttribute<Giftpreparation, String> inComments;
    public static volatile SingularAttribute<Giftpreparation, Gift> giftID;
    public static volatile SingularAttribute<Giftpreparation, Integer> giftPreparationID;
    public static volatile SingularAttribute<Giftpreparation, String> descriptionOfMaterial;
    public static volatile SingularAttribute<Giftpreparation, Integer> quantity;
    public static volatile SingularAttribute<Giftpreparation, Discipline> disciplineID;
    public static volatile SingularAttribute<Giftpreparation, Preparation> preparationID;
    public static volatile SingularAttribute<Giftpreparation, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Giftpreparation, Agent> createdByAgentID;
    public static volatile SingularAttribute<Giftpreparation, String> outComments;
    public static volatile SingularAttribute<Giftpreparation, String> receivedComments;

}