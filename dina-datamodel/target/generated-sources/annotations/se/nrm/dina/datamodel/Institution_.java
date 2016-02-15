package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Address;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collection;
import se.nrm.dina.datamodel.Division;
import se.nrm.dina.datamodel.Journal;
import se.nrm.dina.datamodel.Permit;
import se.nrm.dina.datamodel.Referencework;
import se.nrm.dina.datamodel.Storagetreedef;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T15:12:39")
@StaticMetamodel(Institution.class)
public class Institution_ extends BaseEntity_ {

    public static volatile SingularAttribute<Institution, Integer> userGroupScopeId;
    public static volatile SingularAttribute<Institution, String> copyright;
    public static volatile SingularAttribute<Institution, String> code;
    public static volatile SingularAttribute<Institution, String> description;
    public static volatile SingularAttribute<Institution, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Institution, String> regNumber;
    public static volatile ListAttribute<Institution, Referencework> referenceworkList;
    public static volatile SingularAttribute<Institution, Boolean> isAccessionsGlobal;
    public static volatile ListAttribute<Institution, Journal> journalList;
    public static volatile SingularAttribute<Institution, Short> minimumPwdLength;
    public static volatile ListAttribute<Institution, Collection> collectionList;
    public static volatile SingularAttribute<Institution, String> altName;
    public static volatile SingularAttribute<Institution, String> currentManagedRelVersion;
    public static volatile SingularAttribute<Institution, Boolean> isReleaseManagedGlobally;
    public static volatile ListAttribute<Institution, Agent> agentList;
    public static volatile SingularAttribute<Institution, String> disclaimer;
    public static volatile SingularAttribute<Institution, String> iconURI;
    public static volatile SingularAttribute<Institution, Boolean> isSharingLocalities;
    public static volatile SingularAttribute<Institution, Integer> institutionId;
    public static volatile ListAttribute<Institution, Division> divisionList;
    public static volatile SingularAttribute<Institution, String> currentManagedSchemaVersion;
    public static volatile SingularAttribute<Institution, String> ipr;
    public static volatile SingularAttribute<Institution, String> uri;
    public static volatile SingularAttribute<Institution, Address> addressID;
    public static volatile SingularAttribute<Institution, String> license;
    public static volatile SingularAttribute<Institution, Boolean> hasBeenAsked;
    public static volatile SingularAttribute<Institution, Boolean> isAnonymous;
    public static volatile SingularAttribute<Institution, String> termsOfUse;
    public static volatile SingularAttribute<Institution, Boolean> isSecurityOn;
    public static volatile SingularAttribute<Institution, String> lsidAuthority;
    public static volatile SingularAttribute<Institution, String> name;
    public static volatile SingularAttribute<Institution, String> guid;
    public static volatile SingularAttribute<Institution, Boolean> isServerBased;
    public static volatile SingularAttribute<Institution, Agent> createdByAgentID;
    public static volatile SingularAttribute<Institution, Boolean> isSingleGeographyTree;
    public static volatile ListAttribute<Institution, Permit> permitList;
    public static volatile ListAttribute<Institution, Agent> agentList1;
    public static volatile SingularAttribute<Institution, Storagetreedef> storageTreeDefID;
    public static volatile SingularAttribute<Institution, String> remarks;

}