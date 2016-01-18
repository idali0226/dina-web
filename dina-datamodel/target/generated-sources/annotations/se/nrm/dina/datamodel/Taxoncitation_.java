package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Referencework;
import se.nrm.dina.datamodel.Taxon;

@Generated(value="EclipseLink-2.7.0.v20160114-rNA", date="2016-01-18T16:49:49")
@StaticMetamodel(Taxoncitation.class)
public class Taxoncitation_ extends BaseEntity_ {

    public static volatile SingularAttribute<Taxoncitation, Integer> taxonCitationID;
    public static volatile SingularAttribute<Taxoncitation, Boolean> yesNo2;
    public static volatile SingularAttribute<Taxoncitation, String> text1;
    public static volatile SingularAttribute<Taxoncitation, Boolean> yesNo1;
    public static volatile SingularAttribute<Taxoncitation, String> text2;
    public static volatile SingularAttribute<Taxoncitation, Float> number1;
    public static volatile SingularAttribute<Taxoncitation, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Taxoncitation, Agent> createdByAgentID;
    public static volatile SingularAttribute<Taxoncitation, Float> number2;
    public static volatile SingularAttribute<Taxoncitation, Taxon> taxonID;
    public static volatile SingularAttribute<Taxoncitation, Referencework> referenceWorkID;
    public static volatile SingularAttribute<Taxoncitation, String> remarks;

}