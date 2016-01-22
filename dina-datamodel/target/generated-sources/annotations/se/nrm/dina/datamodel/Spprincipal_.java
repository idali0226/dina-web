package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Recordset;
import se.nrm.dina.datamodel.Spappresource;
import se.nrm.dina.datamodel.Specifyuser;
import se.nrm.dina.datamodel.Sppermission;
import se.nrm.dina.datamodel.Workbench;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T11:48:45")
@StaticMetamodel(Spprincipal.class)
public class Spprincipal_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spprincipal, String> groupSubClass;
    public static volatile ListAttribute<Spprincipal, Spappresource> spappresourceList;
    public static volatile ListAttribute<Spprincipal, Workbench> workbenchList;
    public static volatile SingularAttribute<Spprincipal, String> groupType;
    public static volatile SingularAttribute<Spprincipal, Integer> userGroupScopeID;
    public static volatile ListAttribute<Spprincipal, Sppermission> sppermissionList;
    public static volatile ListAttribute<Spprincipal, Specifyuser> specifyuserList;
    public static volatile SingularAttribute<Spprincipal, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spprincipal, Short> priority;
    public static volatile SingularAttribute<Spprincipal, Integer> spPrincipalID;
    public static volatile SingularAttribute<Spprincipal, String> name;
    public static volatile SingularAttribute<Spprincipal, Agent> createdByAgentID;
    public static volatile ListAttribute<Spprincipal, Recordset> recordsetList;
    public static volatile SingularAttribute<Spprincipal, String> remarks;

}