package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attributedef;
import se.nrm.dina.datamodel.Collectionobject;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-09T12:42:24")
@StaticMetamodel(Collectionobjectattr.class)
public class Collectionobjectattr_ extends BaseEntity_ {

    public static volatile SingularAttribute<Collectionobjectattr, Attributedef> attributeDefID;
    public static volatile SingularAttribute<Collectionobjectattr, Integer> attrID;
    public static volatile SingularAttribute<Collectionobjectattr, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Collectionobjectattr, Agent> createdByAgentID;
    public static volatile SingularAttribute<Collectionobjectattr, Integer> collectionMemberID;
    public static volatile SingularAttribute<Collectionobjectattr, Double> doubleValue;
    public static volatile SingularAttribute<Collectionobjectattr, Collectionobject> collectionObjectID;
    public static volatile SingularAttribute<Collectionobjectattr, String> strValue;

}