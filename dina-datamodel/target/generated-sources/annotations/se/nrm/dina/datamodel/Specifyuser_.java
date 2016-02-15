package se.nrm.dina.datamodel;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Collectingevent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Locality;
import se.nrm.dina.datamodel.Recordset;
import se.nrm.dina.datamodel.Spappresource;
import se.nrm.dina.datamodel.Spappresourcedir;
import se.nrm.dina.datamodel.Spprincipal;
import se.nrm.dina.datamodel.Spquery;
import se.nrm.dina.datamodel.Spreport;
import se.nrm.dina.datamodel.Sptasksemaphore;
import se.nrm.dina.datamodel.Taxon;
import se.nrm.dina.datamodel.Workbench;
import se.nrm.dina.datamodel.Workbenchtemplate;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T16:21:31")
@StaticMetamodel(Specifyuser.class)
public class Specifyuser_ extends BaseEntity_ {

    public static volatile ListAttribute<Specifyuser, Spappresource> spappresourceList;
    public static volatile ListAttribute<Specifyuser, Workbench> workbenchList;
    public static volatile SingularAttribute<Specifyuser, Integer> specifyUserID;
    public static volatile SingularAttribute<Specifyuser, String> loginDisciplineName;
    public static volatile SingularAttribute<Specifyuser, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Specifyuser, String> eMail;
    public static volatile SingularAttribute<Specifyuser, String> password;
    public static volatile ListAttribute<Specifyuser, Taxon> taxonList;
    public static volatile ListAttribute<Specifyuser, Spappresourcedir> spappresourcedirList;
    public static volatile ListAttribute<Specifyuser, Attachment> attachmentList;
    public static volatile ListAttribute<Specifyuser, Recordset> recordsetList;
    public static volatile ListAttribute<Specifyuser, Agent> agentList;
    public static volatile ListAttribute<Specifyuser, Sptasksemaphore> sptasksemaphoreList;
    public static volatile ListAttribute<Specifyuser, Spprincipal> spprincipalList;
    public static volatile SingularAttribute<Specifyuser, BigInteger> accumMinLoggedIn;
    public static volatile SingularAttribute<Specifyuser, Date> loginOutTime;
    public static volatile ListAttribute<Specifyuser, Spquery> spqueryList;
    public static volatile SingularAttribute<Specifyuser, String> loginCollectionName;
    public static volatile SingularAttribute<Specifyuser, Boolean> isLoggedInReport;
    public static volatile ListAttribute<Specifyuser, Collectionobject> collectionobjectList;
    public static volatile ListAttribute<Specifyuser, Collectingevent> collectingeventList;
    public static volatile SingularAttribute<Specifyuser, String> name;
    public static volatile SingularAttribute<Specifyuser, Boolean> isLoggedIn;
    public static volatile ListAttribute<Specifyuser, Spreport> spreportList;
    public static volatile SingularAttribute<Specifyuser, Agent> createdByAgentID;
    public static volatile SingularAttribute<Specifyuser, String> userType;
    public static volatile ListAttribute<Specifyuser, Locality> localityList;
    public static volatile ListAttribute<Specifyuser, Workbenchtemplate> workbenchtemplateList;

}