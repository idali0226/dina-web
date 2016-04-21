package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spappresource;
import se.nrm.dina.datamodel.Spviewsetobj;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-21T09:39:58")
@StaticMetamodel(Spappresourcedata.class)
public class Spappresourcedata_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spappresourcedata, byte[]> data;
    public static volatile SingularAttribute<Spappresourcedata, Spviewsetobj> spViewSetObjID;
    public static volatile SingularAttribute<Spappresourcedata, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spappresourcedata, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spappresourcedata, Integer> spAppResourceDataID;
    public static volatile SingularAttribute<Spappresourcedata, Spappresource> spAppResourceID;

}