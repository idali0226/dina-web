package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attributedef;
import se.nrm.dina.datamodel.Autonumberingscheme;
import se.nrm.dina.datamodel.Collectingevent;
import se.nrm.dina.datamodel.Collectingeventattribute;
import se.nrm.dina.datamodel.Collectingtrip;
import se.nrm.dina.datamodel.Collection;
import se.nrm.dina.datamodel.Datatype;
import se.nrm.dina.datamodel.Division;
import se.nrm.dina.datamodel.Fieldnotebook;
import se.nrm.dina.datamodel.Fieldnotebookpage;
import se.nrm.dina.datamodel.Fieldnotebookpageset;
import se.nrm.dina.datamodel.Geographytreedef;
import se.nrm.dina.datamodel.Geologictimeperiodtreedef;
import se.nrm.dina.datamodel.Gift;
import se.nrm.dina.datamodel.Giftagent;
import se.nrm.dina.datamodel.Giftpreparation;
import se.nrm.dina.datamodel.Lithostrattreedef;
import se.nrm.dina.datamodel.Loan;
import se.nrm.dina.datamodel.Loanagent;
import se.nrm.dina.datamodel.Loanpreparation;
import se.nrm.dina.datamodel.Loanreturnpreparation;
import se.nrm.dina.datamodel.Locality;
import se.nrm.dina.datamodel.Localitycitation;
import se.nrm.dina.datamodel.Localitynamealias;
import se.nrm.dina.datamodel.Paleocontext;
import se.nrm.dina.datamodel.Shipment;
import se.nrm.dina.datamodel.Spappresourcedir;
import se.nrm.dina.datamodel.Spexportschema;
import se.nrm.dina.datamodel.Splocalecontainer;
import se.nrm.dina.datamodel.Sptasksemaphore;
import se.nrm.dina.datamodel.Taxontreedef;

@Generated(value="EclipseLink-2.7.0.v20160114-rNA", date="2016-01-18T14:16:55")
@StaticMetamodel(Discipline.class)
public class Discipline_ extends BaseEntity_ {

    public static volatile ListAttribute<Discipline, Fieldnotebookpageset> fieldnotebookpagesetList;
    public static volatile ListAttribute<Discipline, Giftagent> giftagentList;
    public static volatile SingularAttribute<Discipline, Taxontreedef> taxonTreeDefID;
    public static volatile ListAttribute<Discipline, Attributedef> attributedefList;
    public static volatile SingularAttribute<Discipline, Integer> userGroupScopeId;
    public static volatile ListAttribute<Discipline, Fieldnotebook> fieldnotebookList;
    public static volatile SingularAttribute<Discipline, Datatype> dataTypeID;
    public static volatile SingularAttribute<Discipline, Geologictimeperiodtreedef> geologicTimePeriodTreeDefID;
    public static volatile SingularAttribute<Discipline, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Discipline, String> type;
    public static volatile ListAttribute<Discipline, Localitynamealias> localitynamealiasList;
    public static volatile ListAttribute<Discipline, Splocalecontainer> splocalecontainerList;
    public static volatile ListAttribute<Discipline, Loanagent> loanagentList;
    public static volatile ListAttribute<Discipline, Paleocontext> paleocontextList;
    public static volatile ListAttribute<Discipline, Loanpreparation> loanpreparationList;
    public static volatile SingularAttribute<Discipline, String> regNumber;
    public static volatile SingularAttribute<Discipline, Geographytreedef> geographyTreeDefID;
    public static volatile ListAttribute<Discipline, Spappresourcedir> spappresourcedirList;
    public static volatile ListAttribute<Discipline, Giftpreparation> giftpreparationList;
    public static volatile ListAttribute<Discipline, Autonumberingscheme> autonumberingschemeList;
    public static volatile ListAttribute<Discipline, Collection> collectionList;
    public static volatile ListAttribute<Discipline, Collectingtrip> collectingtripList;
    public static volatile ListAttribute<Discipline, Sptasksemaphore> sptasksemaphoreList;
    public static volatile SingularAttribute<Discipline, Boolean> isPaleoContextEmbedded;
    public static volatile SingularAttribute<Discipline, Lithostrattreedef> lithoStratTreeDefID;
    public static volatile SingularAttribute<Discipline, String> paleoContextChildTable;
    public static volatile ListAttribute<Discipline, Localitycitation> localitycitationList;
    public static volatile ListAttribute<Discipline, Spexportschema> spexportschemaList;
    public static volatile ListAttribute<Discipline, Loan> loanList;
    public static volatile ListAttribute<Discipline, Fieldnotebookpage> fieldnotebookpageList;
    public static volatile SingularAttribute<Discipline, Integer> disciplineId;
    public static volatile ListAttribute<Discipline, Shipment> shipmentList;
    public static volatile ListAttribute<Discipline, Gift> giftList;
    public static volatile ListAttribute<Discipline, Loanreturnpreparation> loanreturnpreparationList;
    public static volatile ListAttribute<Discipline, Collectingevent> collectingeventList;
    public static volatile ListAttribute<Discipline, Collectingeventattribute> collectingeventattributeList;
    public static volatile SingularAttribute<Discipline, String> name;
    public static volatile SingularAttribute<Discipline, Agent> createdByAgentID;
    public static volatile SingularAttribute<Discipline, Division> divisionID;
    public static volatile ListAttribute<Discipline, Locality> localityList;

}