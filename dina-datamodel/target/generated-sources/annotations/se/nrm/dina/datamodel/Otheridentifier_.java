package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;

@Generated(value="EclipseLink-2.7.0.v20160210-rNA", date="2016-02-11T12:23:21")
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