package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Spprincipal;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T12:22:39")
@StaticMetamodel(Sppermission.class)
public class Sppermission_ { 

    public static volatile SingularAttribute<Sppermission, String> permissionClass;
    public static volatile SingularAttribute<Sppermission, Integer> targetId;
    public static volatile ListAttribute<Sppermission, Spprincipal> spprincipalList;
    public static volatile SingularAttribute<Sppermission, String> name;
    public static volatile SingularAttribute<Sppermission, Integer> spPermissionID;
    public static volatile SingularAttribute<Sppermission, String> actions;

}