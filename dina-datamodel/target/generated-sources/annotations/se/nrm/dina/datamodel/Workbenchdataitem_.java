package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Workbenchrow;
import se.nrm.dina.datamodel.Workbenchtemplatemappingitem;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T10:51:25")
@StaticMetamodel(Workbenchdataitem.class)
public class Workbenchdataitem_ { 

    public static volatile SingularAttribute<Workbenchdataitem, Workbenchtemplatemappingitem> workbenchTemplateMappingItemID;
    public static volatile SingularAttribute<Workbenchdataitem, Integer> workbenchDataItemID;
    public static volatile SingularAttribute<Workbenchdataitem, Workbenchrow> workbenchRowID;
    public static volatile SingularAttribute<Workbenchdataitem, String> cellData;
    public static volatile SingularAttribute<Workbenchdataitem, Short> rowNumber;
    public static volatile SingularAttribute<Workbenchdataitem, Short> validationStatus;

}