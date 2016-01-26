package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spappresource;
import se.nrm.dina.datamodel.Spviewsetobj;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T10:51:25")
@StaticMetamodel(Spappresourcedata.class)
public class Spappresourcedata_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spappresourcedata, byte[]> data;
    public static volatile SingularAttribute<Spappresourcedata, Spviewsetobj> spViewSetObjID;
    public static volatile SingularAttribute<Spappresourcedata, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spappresourcedata, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spappresourcedata, Integer> spAppResourceDataID;
    public static volatile SingularAttribute<Spappresourcedata, Spappresource> spAppResourceID;

}