package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Borrow;
import se.nrm.dina.datamodel.Borrowreturnmaterial;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-22T09:50:41")
@StaticMetamodel(Borrowmaterial.class)
public class Borrowmaterial_ extends BaseEntity_ {

    public static volatile SingularAttribute<Borrowmaterial, String> inComments;
    public static volatile SingularAttribute<Borrowmaterial, Short> quantityReturned;
    public static volatile SingularAttribute<Borrowmaterial, Short> quantity;
    public static volatile SingularAttribute<Borrowmaterial, String> description;
    public static volatile SingularAttribute<Borrowmaterial, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Borrowmaterial, String> outComments;
    public static volatile SingularAttribute<Borrowmaterial, Short> quantityResolved;
    public static volatile SingularAttribute<Borrowmaterial, String> materialNumber;
    public static volatile ListAttribute<Borrowmaterial, Borrowreturnmaterial> borrowreturnmaterialList;
    public static volatile SingularAttribute<Borrowmaterial, Integer> borrowMaterialID;
    public static volatile SingularAttribute<Borrowmaterial, Agent> createdByAgentID;
    public static volatile SingularAttribute<Borrowmaterial, Borrow> borrowID;
    public static volatile SingularAttribute<Borrowmaterial, Integer> collectionMemberID;

}