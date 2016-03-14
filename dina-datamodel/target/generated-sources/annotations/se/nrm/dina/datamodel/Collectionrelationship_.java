package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Collectionreltype;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-14T13:38:26")
@StaticMetamodel(Collectionrelationship.class)
public class Collectionrelationship_ extends BaseEntity_ {

    public static volatile SingularAttribute<Collectionrelationship, Collectionobject> leftSideCollectionID;
    public static volatile SingularAttribute<Collectionrelationship, String> text1;
    public static volatile SingularAttribute<Collectionrelationship, String> text2;
    public static volatile SingularAttribute<Collectionrelationship, Collectionreltype> collectionRelTypeID;
    public static volatile SingularAttribute<Collectionrelationship, Collectionobject> rightSideCollectionID;
    public static volatile SingularAttribute<Collectionrelationship, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Collectionrelationship, Agent> createdByAgentID;
    public static volatile SingularAttribute<Collectionrelationship, Integer> collectionRelationshipID;

}