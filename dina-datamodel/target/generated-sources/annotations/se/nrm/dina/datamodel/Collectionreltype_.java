package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collection;
import se.nrm.dina.datamodel.Collectionrelationship;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-10T17:35:03")
@StaticMetamodel(Collectionreltype.class)
public class Collectionreltype_ extends BaseEntity_ {

    public static volatile SingularAttribute<Collectionreltype, Collection> leftSideCollectionID;
    public static volatile ListAttribute<Collectionreltype, Collectionrelationship> collectionrelationshipList;
    public static volatile SingularAttribute<Collectionreltype, String> name;
    public static volatile SingularAttribute<Collectionreltype, Integer> collectionRelTypeID;
    public static volatile SingularAttribute<Collectionreltype, Collection> rightSideCollectionID;
    public static volatile SingularAttribute<Collectionreltype, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Collectionreltype, Agent> createdByAgentID;
    public static volatile SingularAttribute<Collectionreltype, String> remarks;

}