package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Geologictimeperiod;
import se.nrm.dina.datamodel.Geologictimeperiodtreedef;
import se.nrm.dina.datamodel.Geologictimeperiodtreedefitem;
import se.nrm.dina.datamodel.Paleocontext;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T15:12:39")
@StaticMetamodel(Geologictimeperiod.class)
public class Geologictimeperiod_ extends BaseEntity_ {

    public static volatile SingularAttribute<Geologictimeperiod, String> standard;
    public static volatile ListAttribute<Geologictimeperiod, Geologictimeperiod> geologictimeperiodList;
    public static volatile SingularAttribute<Geologictimeperiod, Float> endPeriod;
    public static volatile SingularAttribute<Geologictimeperiod, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Geologictimeperiod, Geologictimeperiodtreedef> geologicTimePeriodTreeDefID;
    public static volatile SingularAttribute<Geologictimeperiod, Float> startUncertainty;
    public static volatile SingularAttribute<Geologictimeperiod, Boolean> isBioStrat;
    public static volatile SingularAttribute<Geologictimeperiod, Geologictimeperiod> parentID;
    public static volatile ListAttribute<Geologictimeperiod, Paleocontext> paleocontextList;
    public static volatile ListAttribute<Geologictimeperiod, Paleocontext> paleocontextList1;
    public static volatile SingularAttribute<Geologictimeperiod, Float> startPeriod;
    public static volatile ListAttribute<Geologictimeperiod, Paleocontext> paleocontextList2;
    public static volatile SingularAttribute<Geologictimeperiod, Integer> rankID;
    public static volatile SingularAttribute<Geologictimeperiod, Integer> highestChildNodeNumber;
    public static volatile SingularAttribute<Geologictimeperiod, Geologictimeperiod> acceptedID;
    public static volatile SingularAttribute<Geologictimeperiod, Integer> geologicTimePeriodID;
    public static volatile SingularAttribute<Geologictimeperiod, Integer> nodeNumber;
    public static volatile ListAttribute<Geologictimeperiod, Geologictimeperiod> geologictimeperiodList1;
    public static volatile SingularAttribute<Geologictimeperiod, String> fullName;
    public static volatile SingularAttribute<Geologictimeperiod, Geologictimeperiodtreedefitem> geologicTimePeriodTreeDefItemID;
    public static volatile SingularAttribute<Geologictimeperiod, Float> endUncertainty;
    public static volatile SingularAttribute<Geologictimeperiod, String> text1;
    public static volatile SingularAttribute<Geologictimeperiod, String> text2;
    public static volatile SingularAttribute<Geologictimeperiod, Boolean> isAccepted;
    public static volatile SingularAttribute<Geologictimeperiod, String> name;
    public static volatile SingularAttribute<Geologictimeperiod, String> guid;
    public static volatile SingularAttribute<Geologictimeperiod, Agent> createdByAgentID;
    public static volatile SingularAttribute<Geologictimeperiod, String> remarks;

}