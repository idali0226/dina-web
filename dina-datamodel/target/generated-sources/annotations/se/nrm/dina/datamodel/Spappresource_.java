package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spappresourcedata;
import se.nrm.dina.datamodel.Spappresourcedir;
import se.nrm.dina.datamodel.Specifyuser;
import se.nrm.dina.datamodel.Spprincipal;
import se.nrm.dina.datamodel.Spreport;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T18:56:38")
@StaticMetamodel(Spappresource.class)
public class Spappresource_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spappresource, Integer> ownerPermissionLevel;
    public static volatile SingularAttribute<Spappresource, Short> level;
    public static volatile SingularAttribute<Spappresource, Specifyuser> specifyUserID;
    public static volatile ListAttribute<Spappresource, Spappresourcedata> spappresourcedataList;
    public static volatile SingularAttribute<Spappresource, Integer> allPermissionLevel;
    public static volatile SingularAttribute<Spappresource, String> description;
    public static volatile SingularAttribute<Spappresource, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spappresource, String> mimeType;
    public static volatile SingularAttribute<Spappresource, Integer> spAppResourceID;
    public static volatile SingularAttribute<Spappresource, Spprincipal> spPrincipalID;
    public static volatile SingularAttribute<Spappresource, String> metaData;
    public static volatile SingularAttribute<Spappresource, String> name;
    public static volatile ListAttribute<Spappresource, Spreport> spreportList;
    public static volatile SingularAttribute<Spappresource, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spappresource, Integer> groupPermissionLevel;
    public static volatile SingularAttribute<Spappresource, Spappresourcedir> spAppResourceDirID;

}