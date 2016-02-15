package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Geologictimeperiod;
import se.nrm.dina.datamodel.Geologictimeperiodtreedef;
import se.nrm.dina.datamodel.Geologictimeperiodtreedefitem;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T16:21:30")
@StaticMetamodel(Geologictimeperiodtreedefitem.class)
public class Geologictimeperiodtreedefitem_ extends BaseEntity_ {

    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, String> fullNameSeparator;
    public static volatile ListAttribute<Geologictimeperiodtreedefitem, Geologictimeperiod> geologictimeperiodList;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, Integer> geologicTimePeriodTreeDefItemID;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, String> textBefore;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, Geologictimeperiodtreedef> geologicTimePeriodTreeDefID;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, String> title;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, String> textAfter;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, Geologictimeperiodtreedefitem> parentItemID;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, Integer> rankID;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, Boolean> isInFullName;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, Boolean> isEnforced;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, String> name;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, Agent> createdByAgentID;
    public static volatile ListAttribute<Geologictimeperiodtreedefitem, Geologictimeperiodtreedefitem> geologictimeperiodtreedefitemList;
    public static volatile SingularAttribute<Geologictimeperiodtreedefitem, String> remarks;

}