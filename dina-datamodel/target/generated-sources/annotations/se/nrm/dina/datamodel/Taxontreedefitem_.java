package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Taxon;
import se.nrm.dina.datamodel.Taxontreedef;
import se.nrm.dina.datamodel.Taxontreedefitem;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T17:07:59")
@StaticMetamodel(Taxontreedefitem.class)
public class Taxontreedefitem_ extends BaseEntity_ {

    public static volatile SingularAttribute<Taxontreedefitem, String> fullNameSeparator;
    public static volatile SingularAttribute<Taxontreedefitem, Taxontreedef> taxonTreeDefID;
    public static volatile SingularAttribute<Taxontreedefitem, String> textBefore;
    public static volatile SingularAttribute<Taxontreedefitem, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Taxontreedefitem, String> title;
    public static volatile SingularAttribute<Taxontreedefitem, String> formatToken;
    public static volatile SingularAttribute<Taxontreedefitem, Integer> taxonTreeDefItemID;
    public static volatile SingularAttribute<Taxontreedefitem, String> textAfter;
    public static volatile ListAttribute<Taxontreedefitem, Taxon> taxonList;
    public static volatile SingularAttribute<Taxontreedefitem, Taxontreedefitem> parentItemID;
    public static volatile SingularAttribute<Taxontreedefitem, Integer> rankID;
    public static volatile SingularAttribute<Taxontreedefitem, Boolean> isInFullName;
    public static volatile SingularAttribute<Taxontreedefitem, Boolean> isEnforced;
    public static volatile SingularAttribute<Taxontreedefitem, String> name;
    public static volatile SingularAttribute<Taxontreedefitem, Agent> createdByAgentID;
    public static volatile ListAttribute<Taxontreedefitem, Taxontreedefitem> taxontreedefitemList;
    public static volatile SingularAttribute<Taxontreedefitem, String> remarks;

}