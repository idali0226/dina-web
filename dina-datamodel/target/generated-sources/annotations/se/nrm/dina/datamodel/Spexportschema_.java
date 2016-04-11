package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Spexportschemaitem;
import se.nrm.dina.datamodel.Spexportschemamapping;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-11T16:29:46")
@StaticMetamodel(Spexportschema.class)
public class Spexportschema_ extends BaseEntity_ {

    public static volatile ListAttribute<Spexportschema, Spexportschemaitem> spexportschemaitemList;
    public static volatile SingularAttribute<Spexportschema, String> schemaVersion;
    public static volatile SingularAttribute<Spexportschema, Integer> spExportSchemaID;
    public static volatile SingularAttribute<Spexportschema, String> description;
    public static volatile ListAttribute<Spexportschema, Spexportschemamapping> spexportschemamappingList;
    public static volatile SingularAttribute<Spexportschema, Discipline> disciplineID;
    public static volatile SingularAttribute<Spexportschema, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spexportschema, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spexportschema, String> schemaName;

}