package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Locality;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T15:11:50")
@StaticMetamodel(Localitynamealias.class)
public class Localitynamealias_ extends BaseEntity_ {

    public static volatile SingularAttribute<Localitynamealias, Integer> localityNameAliasID;
    public static volatile SingularAttribute<Localitynamealias, String> name;
    public static volatile SingularAttribute<Localitynamealias, Discipline> disciplineID;
    public static volatile SingularAttribute<Localitynamealias, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Localitynamealias, Agent> createdByAgentID;
    public static volatile SingularAttribute<Localitynamealias, String> source;
    public static volatile SingularAttribute<Localitynamealias, Locality> localityID;

}