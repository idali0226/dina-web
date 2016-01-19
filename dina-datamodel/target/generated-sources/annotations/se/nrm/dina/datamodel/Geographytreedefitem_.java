package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Geography;
import se.nrm.dina.datamodel.Geographytreedef;
import se.nrm.dina.datamodel.Geographytreedefitem;

@Generated(value="EclipseLink-2.7.0.v20160118-rNA", date="2016-01-19T06:20:34")
@StaticMetamodel(Geographytreedefitem.class)
public class Geographytreedefitem_ extends BaseEntity_ {

    public static volatile SingularAttribute<Geographytreedefitem, String> fullNameSeparator;
    public static volatile SingularAttribute<Geographytreedefitem, String> textBefore;
    public static volatile SingularAttribute<Geographytreedefitem, Agent> modifiedByAgentID;
    public static volatile ListAttribute<Geographytreedefitem, Geographytreedefitem> geographytreedefitemList;
    public static volatile SingularAttribute<Geographytreedefitem, String> title;
    public static volatile SingularAttribute<Geographytreedefitem, Geographytreedef> geographyTreeDefID;
    public static volatile SingularAttribute<Geographytreedefitem, String> textAfter;
    public static volatile ListAttribute<Geographytreedefitem, Geography> geographyList;
    public static volatile SingularAttribute<Geographytreedefitem, Geographytreedefitem> parentItemID;
    public static volatile SingularAttribute<Geographytreedefitem, Integer> rankID;
    public static volatile SingularAttribute<Geographytreedefitem, Boolean> isInFullName;
    public static volatile SingularAttribute<Geographytreedefitem, Integer> geographyTreeDefItemID;
    public static volatile SingularAttribute<Geographytreedefitem, Boolean> isEnforced;
    public static volatile SingularAttribute<Geographytreedefitem, String> name;
    public static volatile SingularAttribute<Geographytreedefitem, Agent> createdByAgentID;
    public static volatile SingularAttribute<Geographytreedefitem, String> remarks;

}