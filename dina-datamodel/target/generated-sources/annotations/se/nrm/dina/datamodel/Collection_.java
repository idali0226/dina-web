package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Autonumberingscheme;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Collectionreltype;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Fieldnotebook;
import se.nrm.dina.datamodel.Institution;
import se.nrm.dina.datamodel.Picklist;
import se.nrm.dina.datamodel.Preptype;
import se.nrm.dina.datamodel.Spappresourcedir;
import se.nrm.dina.datamodel.Sptasksemaphore;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-10T12:13:26")
@StaticMetamodel(Collection.class)
public class Collection_ extends BaseEntity_ {

    public static volatile SingularAttribute<Collection, Integer> userGroupScopeId;
    public static volatile ListAttribute<Collection, Fieldnotebook> fieldnotebookList;
    public static volatile SingularAttribute<Collection, String> code;
    public static volatile ListAttribute<Collection, Preptype> preptypeList;
    public static volatile SingularAttribute<Collection, String> catalogFormatNumName;
    public static volatile SingularAttribute<Collection, String> primaryFocus;
    public static volatile ListAttribute<Collection, Picklist> picklistList;
    public static volatile SingularAttribute<Collection, String> description;
    public static volatile SingularAttribute<Collection, Discipline> disciplineID;
    public static volatile SingularAttribute<Collection, String> institutionType;
    public static volatile SingularAttribute<Collection, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Collection, Boolean> isEmbeddedCollectingEvent;
    public static volatile SingularAttribute<Collection, String> webSiteURI;
    public static volatile SingularAttribute<Collection, String> collectionName;
    public static volatile SingularAttribute<Collection, String> isaNumber;
    public static volatile SingularAttribute<Collection, String> primaryPurpose;
    public static volatile SingularAttribute<Collection, String> regNumber;
    public static volatile SingularAttribute<Collection, Integer> estimatedSize;
    public static volatile ListAttribute<Collection, Spappresourcedir> spappresourcedirList;
    public static volatile SingularAttribute<Collection, String> scope;
    public static volatile ListAttribute<Collection, Autonumberingscheme> autonumberingschemeList;
    public static volatile ListAttribute<Collection, Agent> agentList;
    public static volatile SingularAttribute<Collection, Integer> collectionId;
    public static volatile SingularAttribute<Collection, String> webPortalURI;
    public static volatile SingularAttribute<Collection, String> dbContentVersion;
    public static volatile ListAttribute<Collection, Sptasksemaphore> sptasksemaphoreList;
    public static volatile SingularAttribute<Collection, String> preservationMethodType;
    public static volatile ListAttribute<Collection, Collectionreltype> collectionreltypeList;
    public static volatile ListAttribute<Collection, Collectionreltype> collectionreltypeList1;
    public static volatile SingularAttribute<Collection, String> collectionType;
    public static volatile SingularAttribute<Collection, String> kingdomCoverage;
    public static volatile ListAttribute<Collection, Collectionobject> collectionobjectList;
    public static volatile SingularAttribute<Collection, String> guid;
    public static volatile SingularAttribute<Collection, Agent> createdByAgentID;
    public static volatile ListAttribute<Collection, Agent> agentList1;
    public static volatile SingularAttribute<Collection, String> remarks;
    public static volatile SingularAttribute<Collection, String> developmentStatus;
    public static volatile SingularAttribute<Collection, Institution> institutionNetworkID;

}