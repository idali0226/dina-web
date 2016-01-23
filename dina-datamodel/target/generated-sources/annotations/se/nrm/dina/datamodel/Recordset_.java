package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Inforequest;
import se.nrm.dina.datamodel.Recordsetitem;
import se.nrm.dina.datamodel.Specifyuser;
import se.nrm.dina.datamodel.Spprincipal;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T17:07:59")
@StaticMetamodel(Recordset.class)
public class Recordset_ extends BaseEntity_ {

    public static volatile SingularAttribute<Recordset, Integer> ownerPermissionLevel;
    public static volatile SingularAttribute<Recordset, Inforequest> infoRequestID;
    public static volatile SingularAttribute<Recordset, Specifyuser> specifyUserID;
    public static volatile SingularAttribute<Recordset, Integer> allPermissionLevel;
    public static volatile SingularAttribute<Recordset, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Recordset, Short> type;
    public static volatile SingularAttribute<Recordset, Spprincipal> spPrincipalID;
    public static volatile ListAttribute<Recordset, Recordsetitem> recordsetitemList;
    public static volatile SingularAttribute<Recordset, String> name;
    public static volatile SingularAttribute<Recordset, Integer> tableID;
    public static volatile SingularAttribute<Recordset, Integer> recordSetID;
    public static volatile SingularAttribute<Recordset, Agent> createdByAgentID;
    public static volatile SingularAttribute<Recordset, Integer> collectionMemberID;
    public static volatile SingularAttribute<Recordset, Integer> groupPermissionLevel;
    public static volatile SingularAttribute<Recordset, String> remarks;

}