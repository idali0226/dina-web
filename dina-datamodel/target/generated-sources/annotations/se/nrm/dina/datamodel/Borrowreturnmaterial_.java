package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Borrowmaterial;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T16:21:31")
@StaticMetamodel(Borrowreturnmaterial.class)
public class Borrowreturnmaterial_ extends BaseEntity_ {

    public static volatile SingularAttribute<Borrowreturnmaterial, Short> quantity;
    public static volatile SingularAttribute<Borrowreturnmaterial, Agent> returnedByID;
    public static volatile SingularAttribute<Borrowreturnmaterial, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Borrowreturnmaterial, Agent> createdByAgentID;
    public static volatile SingularAttribute<Borrowreturnmaterial, Borrowmaterial> borrowMaterialID;
    public static volatile SingularAttribute<Borrowreturnmaterial, Integer> collectionMemberID;
    public static volatile SingularAttribute<Borrowreturnmaterial, String> remarks;
    public static volatile SingularAttribute<Borrowreturnmaterial, Integer> borrowReturnMaterialID;
    public static volatile SingularAttribute<Borrowreturnmaterial, Date> returnedDate;

}