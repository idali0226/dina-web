package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Workbenchrow;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-14T13:38:27")
@StaticMetamodel(Workbenchrowimage.class)
public class Workbenchrowimage_ { 

    public static volatile SingularAttribute<Workbenchrowimage, byte[]> cardImageData;
    public static volatile SingularAttribute<Workbenchrowimage, String> attachToTableName;
    public static volatile SingularAttribute<Workbenchrowimage, Workbenchrow> workbenchRowID;
    public static volatile SingularAttribute<Workbenchrowimage, Integer> imageOrder;
    public static volatile SingularAttribute<Workbenchrowimage, Integer> workbenchRowImageID;
    public static volatile SingularAttribute<Workbenchrowimage, String> cardImageFullPath;

}