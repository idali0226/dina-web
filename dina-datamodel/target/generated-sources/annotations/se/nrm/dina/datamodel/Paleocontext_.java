package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectingevent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Geologictimeperiod;
import se.nrm.dina.datamodel.Lithostrat;
import se.nrm.dina.datamodel.Locality;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T15:12:39")
@StaticMetamodel(Paleocontext.class)
public class Paleocontext_ extends BaseEntity_ {

    public static volatile SingularAttribute<Paleocontext, Lithostrat> lithoStratID;
    public static volatile SingularAttribute<Paleocontext, Double> number3;
    public static volatile SingularAttribute<Paleocontext, Double> number4;
    public static volatile SingularAttribute<Paleocontext, Discipline> disciplineID;
    public static volatile SingularAttribute<Paleocontext, Double> number1;
    public static volatile SingularAttribute<Paleocontext, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Paleocontext, Double> number2;
    public static volatile SingularAttribute<Paleocontext, Geologictimeperiod> bioStratID;
    public static volatile SingularAttribute<Paleocontext, Double> number5;
    public static volatile SingularAttribute<Paleocontext, Boolean> yesNo5;
    public static volatile SingularAttribute<Paleocontext, Boolean> yesNo4;
    public static volatile SingularAttribute<Paleocontext, Boolean> yesNo3;
    public static volatile SingularAttribute<Paleocontext, Boolean> yesNo2;
    public static volatile SingularAttribute<Paleocontext, Boolean> yesNo1;
    public static volatile SingularAttribute<Paleocontext, String> paleoContextName;
    public static volatile SingularAttribute<Paleocontext, Geologictimeperiod> chronosStratID;
    public static volatile SingularAttribute<Paleocontext, Integer> paleoContextID;
    public static volatile SingularAttribute<Paleocontext, Geologictimeperiod> chronosStratEndID;
    public static volatile SingularAttribute<Paleocontext, String> text3;
    public static volatile SingularAttribute<Paleocontext, String> text4;
    public static volatile SingularAttribute<Paleocontext, String> text1;
    public static volatile ListAttribute<Paleocontext, Collectionobject> collectionobjectList;
    public static volatile ListAttribute<Paleocontext, Collectingevent> collectingeventList;
    public static volatile SingularAttribute<Paleocontext, String> text2;
    public static volatile SingularAttribute<Paleocontext, String> text5;
    public static volatile SingularAttribute<Paleocontext, Agent> createdByAgentID;
    public static volatile ListAttribute<Paleocontext, Locality> localityList;
    public static volatile SingularAttribute<Paleocontext, String> remarks;

}