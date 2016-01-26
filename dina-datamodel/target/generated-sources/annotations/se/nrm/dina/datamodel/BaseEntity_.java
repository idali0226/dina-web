package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T10:51:25")
@StaticMetamodel(BaseEntity.class)
public abstract class BaseEntity_ { 

    public static volatile SingularAttribute<BaseEntity, Date> timestampModified;
    public static volatile SingularAttribute<BaseEntity, Date> timestampCreated;
    public static volatile SingularAttribute<BaseEntity, Integer> version;

}