package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Referencework;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-01T16:46:53")
@StaticMetamodel(Collectionobjectcitation.class)
public class Collectionobjectcitation_ extends BaseEntity_ {

    public static volatile SingularAttribute<Collectionobjectcitation, Integer> collectionObjectCitationID;
    public static volatile SingularAttribute<Collectionobjectcitation, Boolean> isFigured;
    public static volatile SingularAttribute<Collectionobjectcitation, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Collectionobjectcitation, Agent> createdByAgentID;
    public static volatile SingularAttribute<Collectionobjectcitation, Integer> collectionMemberID;
    public static volatile SingularAttribute<Collectionobjectcitation, Collectionobject> collectionObjectID;
    public static volatile SingularAttribute<Collectionobjectcitation, Referencework> referenceWorkID;
    public static volatile SingularAttribute<Collectionobjectcitation, String> remarks;

}