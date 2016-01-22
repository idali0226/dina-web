package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Determination;
import se.nrm.dina.datamodel.Referencework;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T12:22:39")
@StaticMetamodel(Determinationcitation.class)
public class Determinationcitation_ extends BaseEntity_ {

    public static volatile SingularAttribute<Determinationcitation, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Determinationcitation, Agent> createdByAgentID;
    public static volatile SingularAttribute<Determinationcitation, Integer> collectionMemberID;
    public static volatile SingularAttribute<Determinationcitation, Determination> determinationID;
    public static volatile SingularAttribute<Determinationcitation, Referencework> referenceWorkID;
    public static volatile SingularAttribute<Determinationcitation, String> remarks;
    public static volatile SingularAttribute<Determinationcitation, Integer> determinationCitationID;

}