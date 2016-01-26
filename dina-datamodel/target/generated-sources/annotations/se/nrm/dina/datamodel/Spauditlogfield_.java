package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spauditlog;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T15:11:50")
@StaticMetamodel(Spauditlogfield.class)
public class Spauditlogfield_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spauditlogfield, String> newValue;
    public static volatile SingularAttribute<Spauditlogfield, Spauditlog> spAuditLogID;
    public static volatile SingularAttribute<Spauditlogfield, String> fieldName;
    public static volatile SingularAttribute<Spauditlogfield, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spauditlogfield, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spauditlogfield, Integer> spAuditLogFieldID;
    public static volatile SingularAttribute<Spauditlogfield, String> oldValue;

}