package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spexportschemaitem;
import se.nrm.dina.datamodel.Spexportschemamapping;
import se.nrm.dina.datamodel.Spqueryfield;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T12:22:40")
@StaticMetamodel(Spexportschemaitemmapping.class)
public class Spexportschemaitemmapping_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spexportschemaitemmapping, Spexportschemaitem> exportSchemaItemID;
    public static volatile SingularAttribute<Spexportschemaitemmapping, Spexportschemamapping> spExportSchemaMappingID;
    public static volatile SingularAttribute<Spexportschemaitemmapping, Integer> spExportSchemaItemMappingID;
    public static volatile SingularAttribute<Spexportschemaitemmapping, Spqueryfield> spQueryFieldID;
    public static volatile SingularAttribute<Spexportschemaitemmapping, String> exportedFieldName;
    public static volatile SingularAttribute<Spexportschemaitemmapping, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spexportschemaitemmapping, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spexportschemaitemmapping, String> remarks;

}