package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Container;
import se.nrm.dina.datamodel.Preparation;
import se.nrm.dina.datamodel.Storage;
import se.nrm.dina.datamodel.Storageattachment;
import se.nrm.dina.datamodel.Storagetreedef;
import se.nrm.dina.datamodel.Storagetreedefitem;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-21T15:02:32")
@StaticMetamodel(Storage.class)
public class Storage_ extends BaseEntity_ {

    public static volatile ListAttribute<Storage, Container> containerList;
    public static volatile SingularAttribute<Storage, Integer> number1;
    public static volatile SingularAttribute<Storage, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Storage, Integer> number2;
    public static volatile SingularAttribute<Storage, Storage> parentID;
    public static volatile ListAttribute<Storage, Storage> storageList;
    public static volatile SingularAttribute<Storage, Integer> rankID;
    public static volatile SingularAttribute<Storage, Storagetreedefitem> storageTreeDefItemID;
    public static volatile ListAttribute<Storage, Preparation> preparationList;
    public static volatile SingularAttribute<Storage, Integer> highestChildNodeNumber;
    public static volatile SingularAttribute<Storage, Storage> acceptedID;
    public static volatile SingularAttribute<Storage, Integer> nodeNumber;
    public static volatile SingularAttribute<Storage, String> fullName;
    public static volatile ListAttribute<Storage, Storageattachment> storageattachmentList;
    public static volatile SingularAttribute<Storage, Date> timestampVersion;
    public static volatile ListAttribute<Storage, Storage> storageList1;
    public static volatile SingularAttribute<Storage, String> text1;
    public static volatile SingularAttribute<Storage, Boolean> isAccepted;
    public static volatile SingularAttribute<Storage, String> text2;
    public static volatile SingularAttribute<Storage, String> name;
    public static volatile SingularAttribute<Storage, Agent> createdByAgentID;
    public static volatile SingularAttribute<Storage, String> abbrev;
    public static volatile SingularAttribute<Storage, Storagetreedef> storageTreeDefID;
    public static volatile SingularAttribute<Storage, String> remarks;
    public static volatile SingularAttribute<Storage, Integer> storageID;

}