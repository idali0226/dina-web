package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Workbenchdataitem;
import se.nrm.dina.datamodel.Workbenchtemplate;

@Generated(value="EclipseLink-2.7.0.v20160118-rNA", date="2016-01-19T06:20:34")
@StaticMetamodel(Workbenchtemplatemappingitem.class)
public class Workbenchtemplatemappingitem_ extends BaseEntity_ {

    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Short> dataFieldLength;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Boolean> isRequired;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Short> yCoord;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, String> fieldName;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Boolean> isExportableToContent;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, String> caption;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Boolean> isIncludedInTitle;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Short> dataColumnIndex;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, String> tableName;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Workbenchtemplate> workbenchTemplateID;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, String> metaData;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Integer> workbenchTemplateMappingItemID;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Short> viewOrder;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Short> xCoord;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Boolean> isEditable;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Boolean> carryForward;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Integer> tableId;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, String> importedColName;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Agent> createdByAgentID;
    public static volatile SingularAttribute<Workbenchtemplatemappingitem, Short> fieldType;
    public static volatile ListAttribute<Workbenchtemplatemappingitem, Workbenchdataitem> workbenchdataitemList;

}