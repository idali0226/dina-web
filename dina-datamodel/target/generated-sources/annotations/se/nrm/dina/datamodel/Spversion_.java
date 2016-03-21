package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:43")
@StaticMetamodel(Spversion.class)
public class Spversion_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spversion, String> dbClosedBy;
    public static volatile SingularAttribute<Spversion, String> appVersion;
    public static volatile SingularAttribute<Spversion, String> schemaVersion;
    public static volatile SingularAttribute<Spversion, String> appName;
    public static volatile SingularAttribute<Spversion, Integer> spVersionID;
    public static volatile SingularAttribute<Spversion, Boolean> isDBClosed;
    public static volatile SingularAttribute<Spversion, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spversion, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spversion, String> workbenchSchemaVersion;

}