package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectingeventattr;
import se.nrm.dina.datamodel.Collectionobjectattr;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Preparationattr;
import se.nrm.dina.datamodel.Preptype;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-10T17:35:03")
@StaticMetamodel(Attributedef.class)
public class Attributedef_ extends BaseEntity_ {

    public static volatile SingularAttribute<Attributedef, Integer> attributeDefID;
    public static volatile SingularAttribute<Attributedef, Short> tableType;
    public static volatile SingularAttribute<Attributedef, Preptype> prepTypeID;
    public static volatile SingularAttribute<Attributedef, String> fieldName;
    public static volatile ListAttribute<Attributedef, Collectionobjectattr> collectionobjectattrList;
    public static volatile SingularAttribute<Attributedef, Short> dataType;
    public static volatile ListAttribute<Attributedef, Preparationattr> preparationattrList;
    public static volatile SingularAttribute<Attributedef, Discipline> disciplineID;
    public static volatile SingularAttribute<Attributedef, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Attributedef, Agent> createdByAgentID;
    public static volatile ListAttribute<Attributedef, Collectingeventattr> collectingeventattrList;

}