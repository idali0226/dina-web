package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Picklist;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-18T10:19:04")
@StaticMetamodel(Picklistitem.class)
public class Picklistitem_ extends BaseEntity_ {

    public static volatile SingularAttribute<Picklistitem, Integer> pickListItemID;
    public static volatile SingularAttribute<Picklistitem, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Picklistitem, Picklist> pickListID;
    public static volatile SingularAttribute<Picklistitem, Agent> createdByAgentID;
    public static volatile SingularAttribute<Picklistitem, String> title;
    public static volatile SingularAttribute<Picklistitem, String> value;
    public static volatile SingularAttribute<Picklistitem, Integer> ordinal;

}