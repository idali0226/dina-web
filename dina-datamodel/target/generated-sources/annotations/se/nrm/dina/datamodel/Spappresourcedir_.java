package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collection;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Spappresource;
import se.nrm.dina.datamodel.Specifyuser;
import se.nrm.dina.datamodel.Spviewsetobj;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T15:02:45")
@StaticMetamodel(Spappresourcedir.class)
public class Spappresourcedir_ extends BaseEntity_ {

    public static volatile ListAttribute<Spappresourcedir, Spappresource> spappresourceList;
    public static volatile SingularAttribute<Spappresourcedir, String> disciplineType;
    public static volatile ListAttribute<Spappresourcedir, Spviewsetobj> spviewsetobjList;
    public static volatile SingularAttribute<Spappresourcedir, Specifyuser> specifyUserID;
    public static volatile SingularAttribute<Spappresourcedir, Discipline> disciplineID;
    public static volatile SingularAttribute<Spappresourcedir, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spappresourcedir, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spappresourcedir, Boolean> isPersonal;
    public static volatile SingularAttribute<Spappresourcedir, String> userType;
    public static volatile SingularAttribute<Spappresourcedir, Integer> spAppResourceDirID;
    public static volatile SingularAttribute<Spappresourcedir, Collection> collectionID;

}