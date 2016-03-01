package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spauditlogfield;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-01T16:46:53")
@StaticMetamodel(Spauditlog.class)
public class Spauditlog_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spauditlog, Integer> recordId;
    public static volatile SingularAttribute<Spauditlog, Integer> spAuditLogID;
    public static volatile SingularAttribute<Spauditlog, Integer> recordVersion;
    public static volatile SingularAttribute<Spauditlog, Integer> tableNum;
    public static volatile SingularAttribute<Spauditlog, Integer> action;
    public static volatile SingularAttribute<Spauditlog, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spauditlog, Agent> createdByAgentID;
    public static volatile ListAttribute<Spauditlog, Spauditlogfield> spauditlogfieldList;
    public static volatile SingularAttribute<Spauditlog, Integer> parentRecordId;
    public static volatile SingularAttribute<Spauditlog, Short> parentTableNum;

}