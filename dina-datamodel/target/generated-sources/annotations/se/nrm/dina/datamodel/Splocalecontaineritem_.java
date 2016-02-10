package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spexportschemaitem;
import se.nrm.dina.datamodel.Splocalecontainer;
import se.nrm.dina.datamodel.Splocaleitemstr;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-10T12:13:26")
@StaticMetamodel(Splocalecontaineritem.class)
public class Splocalecontaineritem_ extends BaseEntity_ {

    public static volatile SingularAttribute<Splocalecontaineritem, Boolean> isRequired;
    public static volatile ListAttribute<Splocalecontaineritem, Spexportschemaitem> spexportschemaitemList;
    public static volatile ListAttribute<Splocalecontaineritem, Splocaleitemstr> splocaleitemstrList;
    public static volatile SingularAttribute<Splocalecontaineritem, String> format;
    public static volatile SingularAttribute<Splocalecontaineritem, Integer> spLocaleContainerItemID;
    public static volatile SingularAttribute<Splocalecontaineritem, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Splocalecontaineritem, String> type;
    public static volatile SingularAttribute<Splocalecontaineritem, Boolean> isHidden;
    public static volatile SingularAttribute<Splocalecontaineritem, Boolean> isSystem;
    public static volatile ListAttribute<Splocalecontaineritem, Splocaleitemstr> splocaleitemstrList1;
    public static volatile SingularAttribute<Splocalecontaineritem, Splocalecontainer> spLocaleContainerID;
    public static volatile SingularAttribute<Splocalecontaineritem, Boolean> isUIFormatter;
    public static volatile SingularAttribute<Splocalecontaineritem, String> name;
    public static volatile SingularAttribute<Splocalecontaineritem, String> pickListName;
    public static volatile SingularAttribute<Splocalecontaineritem, String> webLinkName;
    public static volatile SingularAttribute<Splocalecontaineritem, Agent> createdByAgentID;

}