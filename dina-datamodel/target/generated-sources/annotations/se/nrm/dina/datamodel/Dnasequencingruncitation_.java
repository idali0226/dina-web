package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Dnasequencingrun;
import se.nrm.dina.datamodel.Referencework;

@Generated(value="EclipseLink-2.7.0.v20160118-rNA", date="2016-01-21T08:43:44")
@StaticMetamodel(Dnasequencingruncitation.class)
public class Dnasequencingruncitation_ extends BaseEntity_ {

    public static volatile SingularAttribute<Dnasequencingruncitation, Boolean> yesNo2;
    public static volatile SingularAttribute<Dnasequencingruncitation, Integer> dNASequencingRunCitationID;
    public static volatile SingularAttribute<Dnasequencingruncitation, String> text1;
    public static volatile SingularAttribute<Dnasequencingruncitation, Boolean> yesNo1;
    public static volatile SingularAttribute<Dnasequencingruncitation, String> text2;
    public static volatile SingularAttribute<Dnasequencingruncitation, Dnasequencingrun> dNASequencingRunID;
    public static volatile SingularAttribute<Dnasequencingruncitation, Float> number1;
    public static volatile SingularAttribute<Dnasequencingruncitation, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Dnasequencingruncitation, Agent> createdByAgentID;
    public static volatile SingularAttribute<Dnasequencingruncitation, Float> number2;
    public static volatile SingularAttribute<Dnasequencingruncitation, Referencework> referenceWorkID;
    public static volatile SingularAttribute<Dnasequencingruncitation, String> remarks;

}