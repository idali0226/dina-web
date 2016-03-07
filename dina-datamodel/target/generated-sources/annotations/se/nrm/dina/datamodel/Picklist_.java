package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collection;
import se.nrm.dina.datamodel.Picklistitem;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-07T10:42:30")
@StaticMetamodel(Picklist.class)
public class Picklist_ extends BaseEntity_ {

    public static volatile SingularAttribute<Picklist, String> fieldName;
    public static volatile SingularAttribute<Picklist, Integer> pickListID;
    public static volatile SingularAttribute<Picklist, Boolean> readOnly;
    public static volatile SingularAttribute<Picklist, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Picklist, Short> type;
    public static volatile SingularAttribute<Picklist, String> tableName;
    public static volatile SingularAttribute<Picklist, String> formatter;
    public static volatile SingularAttribute<Picklist, Boolean> isSystem;
    public static volatile SingularAttribute<Picklist, Integer> sizeLimit;
    public static volatile ListAttribute<Picklist, Picklistitem> picklistitemList;
    public static volatile SingularAttribute<Picklist, String> filterValue;
    public static volatile SingularAttribute<Picklist, Short> sortType;
    public static volatile SingularAttribute<Picklist, String> name;
    public static volatile SingularAttribute<Picklist, Agent> createdByAgentID;
    public static volatile SingularAttribute<Picklist, String> filterFieldName;
    public static volatile SingularAttribute<Picklist, Collection> collectionID;

}