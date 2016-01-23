package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Institution;
import se.nrm.dina.datamodel.Storage;
import se.nrm.dina.datamodel.Storagetreedefitem;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T17:07:59")
@StaticMetamodel(Storagetreedef.class)
public class Storagetreedef_ extends BaseEntity_ {

    public static volatile ListAttribute<Storagetreedef, Storage> storageList;
    public static volatile ListAttribute<Storagetreedef, Institution> institutionList;
    public static volatile SingularAttribute<Storagetreedef, Integer> fullNameDirection;
    public static volatile SingularAttribute<Storagetreedef, String> name;
    public static volatile SingularAttribute<Storagetreedef, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Storagetreedef, Agent> createdByAgentID;
    public static volatile SingularAttribute<Storagetreedef, Integer> storageTreeDefID;
    public static volatile ListAttribute<Storagetreedef, Storagetreedefitem> storagetreedefitemList;
    public static volatile SingularAttribute<Storagetreedef, String> remarks;

}