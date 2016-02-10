package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spexportschemaitemmapping;
import se.nrm.dina.datamodel.Spquery;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-10T12:13:26")
@StaticMetamodel(Spqueryfield.class)
public class Spqueryfield_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spqueryfield, Spquery> spQueryID;
    public static volatile ListAttribute<Spqueryfield, Spexportschemaitemmapping> spexportschemaitemmappingList;
    public static volatile SingularAttribute<Spqueryfield, Short> operStart;
    public static volatile SingularAttribute<Spqueryfield, Boolean> alwaysFilter;
    public static volatile SingularAttribute<Spqueryfield, String> fieldName;
    public static volatile SingularAttribute<Spqueryfield, String> endValue;
    public static volatile SingularAttribute<Spqueryfield, Integer> contextTableIdent;
    public static volatile SingularAttribute<Spqueryfield, String> formatName;
    public static volatile SingularAttribute<Spqueryfield, Boolean> isPrompt;
    public static volatile SingularAttribute<Spqueryfield, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spqueryfield, String> columnAlias;
    public static volatile SingularAttribute<Spqueryfield, Boolean> isDisplay;
    public static volatile SingularAttribute<Spqueryfield, String> stringId;
    public static volatile SingularAttribute<Spqueryfield, Boolean> isNot;
    public static volatile SingularAttribute<Spqueryfield, Boolean> allowNulls;
    public static volatile SingularAttribute<Spqueryfield, Short> sortType;
    public static volatile SingularAttribute<Spqueryfield, Integer> spQueryFieldID;
    public static volatile SingularAttribute<Spqueryfield, Boolean> isRelFld;
    public static volatile SingularAttribute<Spqueryfield, String> tableList;
    public static volatile SingularAttribute<Spqueryfield, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spqueryfield, Short> operEnd;
    public static volatile SingularAttribute<Spqueryfield, Short> position;
    public static volatile SingularAttribute<Spqueryfield, String> startValue;

}