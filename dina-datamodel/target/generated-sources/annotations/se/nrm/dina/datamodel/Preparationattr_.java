package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attributedef;
import se.nrm.dina.datamodel.Preparation;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-16T16:33:04")
@StaticMetamodel(Preparationattr.class)
public class Preparationattr_ extends BaseEntity_ {

    public static volatile SingularAttribute<Preparationattr, Attributedef> attributeDefID;
    public static volatile SingularAttribute<Preparationattr, Integer> attrID;
    public static volatile SingularAttribute<Preparationattr, Preparation> preparationId;
    public static volatile SingularAttribute<Preparationattr, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Preparationattr, Agent> createdByAgentID;
    public static volatile SingularAttribute<Preparationattr, Integer> collectionMemberID;
    public static volatile SingularAttribute<Preparationattr, Double> doubleValue;
    public static volatile SingularAttribute<Preparationattr, String> strValue;

}