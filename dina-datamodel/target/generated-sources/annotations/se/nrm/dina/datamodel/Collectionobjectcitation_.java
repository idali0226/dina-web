package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Referencework;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T11:48:45")
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