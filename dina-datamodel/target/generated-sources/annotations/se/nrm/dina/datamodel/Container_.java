package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Container;
import se.nrm.dina.datamodel.Storage;

@Generated(value="EclipseLink-2.7.0.v20160203-rNA", date="2016-02-05T11:53:22")
@StaticMetamodel(Container.class)
public class Container_ extends BaseEntity_ {

    public static volatile ListAttribute<Container, Container> containerList;
    public static volatile SingularAttribute<Container, String> description;
    public static volatile SingularAttribute<Container, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Container, Short> type;
    public static volatile SingularAttribute<Container, Container> parentID;
    public static volatile SingularAttribute<Container, Integer> number;
    public static volatile ListAttribute<Container, Collectionobject> collectionobjectList1;
    public static volatile ListAttribute<Container, Collectionobject> collectionobjectList;
    public static volatile SingularAttribute<Container, String> name;
    public static volatile SingularAttribute<Container, Agent> createdByAgentID;
    public static volatile SingularAttribute<Container, Integer> collectionMemberID;
    public static volatile SingularAttribute<Container, Integer> containerID;
    public static volatile SingularAttribute<Container, Storage> storageID;

}