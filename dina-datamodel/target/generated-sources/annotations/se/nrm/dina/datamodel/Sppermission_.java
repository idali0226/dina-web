package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Spprincipal;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-22T09:50:41")
@StaticMetamodel(Sppermission.class)
public class Sppermission_ { 

    public static volatile SingularAttribute<Sppermission, String> permissionClass;
    public static volatile SingularAttribute<Sppermission, Integer> targetId;
    public static volatile ListAttribute<Sppermission, Spprincipal> spprincipalList;
    public static volatile SingularAttribute<Sppermission, String> name;
    public static volatile SingularAttribute<Sppermission, Integer> spPermissionID;
    public static volatile SingularAttribute<Sppermission, String> actions;

}