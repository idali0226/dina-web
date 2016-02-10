package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Workbench;
import se.nrm.dina.datamodel.Workbenchdataitem;
import se.nrm.dina.datamodel.Workbenchrowimage;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-10T12:13:26")
@StaticMetamodel(Workbenchrow.class)
public class Workbenchrow_ { 

    public static volatile SingularAttribute<Workbenchrow, byte[]> cardImageData;
    public static volatile SingularAttribute<Workbenchrow, String> bioGeomancerResults;
    public static volatile SingularAttribute<Workbenchrow, Integer> workbenchRowID;
    public static volatile SingularAttribute<Workbenchrow, Short> uploadStatus;
    public static volatile SingularAttribute<Workbenchrow, Workbench> workbenchID;
    public static volatile SingularAttribute<Workbenchrow, String> long1Text;
    public static volatile SingularAttribute<Workbenchrow, String> cardImageFullPath;
    public static volatile SingularAttribute<Workbenchrow, Integer> recordID;
    public static volatile SingularAttribute<Workbenchrow, Short> sGRStatus;
    public static volatile SingularAttribute<Workbenchrow, String> lat2Text;
    public static volatile SingularAttribute<Workbenchrow, String> lat1Text;
    public static volatile SingularAttribute<Workbenchrow, String> long2Text;
    public static volatile ListAttribute<Workbenchrow, Workbenchrowimage> workbenchrowimageList;
    public static volatile SingularAttribute<Workbenchrow, Short> rowNumber;
    public static volatile ListAttribute<Workbenchrow, Workbenchdataitem> workbenchdataitemList;

}