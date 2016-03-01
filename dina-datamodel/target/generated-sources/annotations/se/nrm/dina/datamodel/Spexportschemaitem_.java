package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spexportschema;
import se.nrm.dina.datamodel.Spexportschemaitemmapping;
import se.nrm.dina.datamodel.Splocalecontaineritem;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-01T16:46:53")
@StaticMetamodel(Spexportschemaitem.class)
public class Spexportschemaitem_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spexportschemaitem, String> formatter;
    public static volatile ListAttribute<Spexportschemaitem, Spexportschemaitemmapping> spexportschemaitemmappingList;
    public static volatile SingularAttribute<Spexportschemaitem, String> fieldName;
    public static volatile SingularAttribute<Spexportschemaitem, Integer> spExportSchemaItemID;
    public static volatile SingularAttribute<Spexportschemaitem, String> dataType;
    public static volatile SingularAttribute<Spexportschemaitem, String> description;
    public static volatile SingularAttribute<Spexportschemaitem, Spexportschema> spExportSchemaID;
    public static volatile SingularAttribute<Spexportschemaitem, Splocalecontaineritem> spLocaleContainerItemID;
    public static volatile SingularAttribute<Spexportschemaitem, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spexportschemaitem, Agent> createdByAgentID;

}