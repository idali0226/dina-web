package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Borrowmaterial;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-20T13:57:07")
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