package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Geologictimeperiod;
import se.nrm.dina.datamodel.Geologictimeperiodtreedefitem;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T10:51:25")
@StaticMetamodel(Geologictimeperiodtreedef.class)
public class Geologictimeperiodtreedef_ extends BaseEntity_ {

    public static volatile ListAttribute<Geologictimeperiodtreedef, Geologictimeperiod> geologictimeperiodList;
    public static volatile SingularAttribute<Geologictimeperiodtreedef, Integer> fullNameDirection;
    public static volatile SingularAttribute<Geologictimeperiodtreedef, String> name;
    public static volatile SingularAttribute<Geologictimeperiodtreedef, Integer> geologicTimePeriodTreeDefID;
    public static volatile SingularAttribute<Geologictimeperiodtreedef, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Geologictimeperiodtreedef, Agent> createdByAgentID;
    public static volatile ListAttribute<Geologictimeperiodtreedef, Discipline> disciplineList;
    public static volatile ListAttribute<Geologictimeperiodtreedef, Geologictimeperiodtreedefitem> geologictimeperiodtreedefitemList;
    public static volatile SingularAttribute<Geologictimeperiodtreedef, String> remarks;

}