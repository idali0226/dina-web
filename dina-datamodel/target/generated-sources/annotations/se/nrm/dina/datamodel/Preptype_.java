package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attributedef;
import se.nrm.dina.datamodel.Collection;
import se.nrm.dina.datamodel.Preparation;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-01T16:46:53")
@StaticMetamodel(Preptype.class)
public class Preptype_ extends BaseEntity_ {

    public static volatile ListAttribute<Preptype, Attributedef> attributedefList;
    public static volatile SingularAttribute<Preptype, Integer> prepTypeID;
    public static volatile SingularAttribute<Preptype, Boolean> isLoanable;
    public static volatile SingularAttribute<Preptype, String> name;
    public static volatile SingularAttribute<Preptype, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Preptype, Agent> createdByAgentID;
    public static volatile ListAttribute<Preptype, Preparation> preparationList;
    public static volatile SingularAttribute<Preptype, Collection> collectionID;

}