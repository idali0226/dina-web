package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Splocalecontainer;
import se.nrm.dina.datamodel.Splocalecontaineritem;

@Generated(value="EclipseLink-2.7.0.v20160114-rNA", date="2016-01-18T14:16:55")
@StaticMetamodel(Splocaleitemstr.class)
public class Splocaleitemstr_ extends BaseEntity_ {

    public static volatile SingularAttribute<Splocaleitemstr, String> country;
    public static volatile SingularAttribute<Splocaleitemstr, Splocalecontainer> spLocaleContainerNameID;
    public static volatile SingularAttribute<Splocaleitemstr, Splocalecontaineritem> spLocaleContainerItemNameID;
    public static volatile SingularAttribute<Splocaleitemstr, Integer> spLocaleItemStrID;
    public static volatile SingularAttribute<Splocaleitemstr, String> variant;
    public static volatile SingularAttribute<Splocaleitemstr, String> language;
    public static volatile SingularAttribute<Splocaleitemstr, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Splocaleitemstr, Agent> createdByAgentID;
    public static volatile SingularAttribute<Splocaleitemstr, Splocalecontainer> spLocaleContainerDescID;
    public static volatile SingularAttribute<Splocaleitemstr, String> text;
    public static volatile SingularAttribute<Splocaleitemstr, Splocalecontaineritem> spLocaleContainerItemDescID;

}