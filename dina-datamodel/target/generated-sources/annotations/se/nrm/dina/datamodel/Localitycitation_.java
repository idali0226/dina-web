package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Locality;
import se.nrm.dina.datamodel.Referencework;

@Generated(value="EclipseLink-2.7.0.v20160114-rNA", date="2016-01-18T14:16:56")
@StaticMetamodel(Localitycitation.class)
public class Localitycitation_ extends BaseEntity_ {

    public static volatile SingularAttribute<Localitycitation, Integer> localityCitationID;
    public static volatile SingularAttribute<Localitycitation, Discipline> disciplineID;
    public static volatile SingularAttribute<Localitycitation, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Localitycitation, Agent> createdByAgentID;
    public static volatile SingularAttribute<Localitycitation, Locality> localityID;
    public static volatile SingularAttribute<Localitycitation, Referencework> referenceWorkID;
    public static volatile SingularAttribute<Localitycitation, String> remarks;

}