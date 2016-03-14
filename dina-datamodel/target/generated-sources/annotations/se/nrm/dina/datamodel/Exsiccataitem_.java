package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Exsiccata;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-14T13:38:26")
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