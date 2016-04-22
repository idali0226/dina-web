package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Splocalecontaineritem;
import se.nrm.dina.datamodel.Splocaleitemstr;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-22T09:50:41")
@StaticMetamodel(Splocalecontainer.class)
public class Splocalecontainer_ extends BaseEntity_ {

    public static volatile ListAttribute<Splocalecontainer, Splocaleitemstr> splocaleitemstrList;
    public static volatile SingularAttribute<Splocalecontainer, String> defaultUI;
    public static volatile SingularAttribute<Splocalecontainer, String> aggregator;
    public static volatile SingularAttribute<Splocalecontainer, String> format;
    public static volatile SingularAttribute<Splocalecontainer, Discipline> disciplineID;
    public static volatile SingularAttribute<Splocalecontainer, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Splocalecontainer, String> type;
    public static volatile SingularAttribute<Splocalecontainer, Boolean> isHidden;
    public static volatile SingularAttribute<Splocalecontainer, Boolean> isSystem;
    public static volatile SingularAttribute<Splocalecontainer, Integer> spLocaleContainerID;
    public static volatile ListAttribute<Splocalecontainer, Splocaleitemstr> splocaleitemstrList1;
    public static volatile SingularAttribute<Splocalecontainer, Boolean> isUIFormatter;
    public static volatile ListAttribute<Splocalecontainer, Splocalecontaineritem> splocalecontaineritemList;
    public static volatile SingularAttribute<Splocalecontainer, String> name;
    public static volatile SingularAttribute<Splocalecontainer, Short> schemaType;
    public static volatile SingularAttribute<Splocalecontainer, String> pickListName;
    public static volatile SingularAttribute<Splocalecontainer, Agent> createdByAgentID;

}