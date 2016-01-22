package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Exsiccata;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T12:22:39")
@StaticMetamodel(Exsiccataitem.class)
public class Exsiccataitem_ extends BaseEntity_ {

    public static volatile SingularAttribute<Exsiccataitem, String> number;
    public static volatile SingularAttribute<Exsiccataitem, Exsiccata> exsiccataID;
    public static volatile SingularAttribute<Exsiccataitem, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Exsiccataitem, Agent> createdByAgentID;
    public static volatile SingularAttribute<Exsiccataitem, String> fascicle;
    public static volatile SingularAttribute<Exsiccataitem, Collectionobject> collectionObjectID;
    public static volatile SingularAttribute<Exsiccataitem, Integer> exsiccataItemID;

}