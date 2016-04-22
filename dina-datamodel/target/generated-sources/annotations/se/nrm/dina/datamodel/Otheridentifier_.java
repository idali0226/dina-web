package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-22T09:50:41")
@StaticMetamodel(Otheridentifier.class)
public class Otheridentifier_ extends BaseEntity_ {

    public static volatile SingularAttribute<Otheridentifier, String> identifier;
    public static volatile SingularAttribute<Otheridentifier, String> institution;
    public static volatile SingularAttribute<Otheridentifier, Integer> otherIdentifierID;
    public static volatile SingularAttribute<Otheridentifier, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Otheridentifier, Agent> createdByAgentID;
    public static volatile SingularAttribute<Otheridentifier, Integer> collectionMemberID;
    public static volatile SingularAttribute<Otheridentifier, Collectionobject> collectionObjectID;
    public static volatile SingularAttribute<Otheridentifier, String> remarks;

}