package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectingevent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Taxon;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-22T09:50:41")
@StaticMetamodel(Collectingeventattribute.class)
public class Collectingeventattribute_ extends BaseEntity_ {

    public static volatile SingularAttribute<Collectingeventattribute, Float> number3;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number4;
    public static volatile SingularAttribute<Collectingeventattribute, Discipline> disciplineID;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number1;
    public static volatile SingularAttribute<Collectingeventattribute, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number2;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number7;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number8;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number5;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number6;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number9;
    public static volatile SingularAttribute<Collectingeventattribute, Boolean> yesNo5;
    public static volatile SingularAttribute<Collectingeventattribute, Boolean> yesNo4;
    public static volatile SingularAttribute<Collectingeventattribute, Boolean> yesNo3;
    public static volatile SingularAttribute<Collectingeventattribute, Boolean> yesNo2;
    public static volatile SingularAttribute<Collectingeventattribute, Boolean> yesNo1;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number13;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number12;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number11;
    public static volatile SingularAttribute<Collectingeventattribute, Float> number10;
    public static volatile SingularAttribute<Collectingeventattribute, String> text15;
    public static volatile SingularAttribute<Collectingeventattribute, String> text14;
    public static volatile SingularAttribute<Collectingeventattribute, String> text17;
    public static volatile SingularAttribute<Collectingeventattribute, String> text16;
    public static volatile SingularAttribute<Collectingeventattribute, String> text11;
    public static volatile SingularAttribute<Collectingeventattribute, String> text3;
    public static volatile SingularAttribute<Collectingeventattribute, String> text10;
    public static volatile SingularAttribute<Collectingeventattribute, String> text4;
    public static volatile SingularAttribute<Collectingeventattribute, String> text1;
    public static volatile SingularAttribute<Collectingeventattribute, String> text13;
    public static volatile ListAttribute<Collectingeventattribute, Collectingevent> collectingeventList;
    public static volatile SingularAttribute<Collectingeventattribute, String> text12;
    public static volatile SingularAttribute<Collectingeventattribute, String> text2;
    public static volatile SingularAttribute<Collectingeventattribute, String> text7;
    public static volatile SingularAttribute<Collectingeventattribute, String> text8;
    public static volatile SingularAttribute<Collectingeventattribute, String> text5;
    public static volatile SingularAttribute<Collectingeventattribute, Taxon> hostTaxonID;
    public static volatile SingularAttribute<Collectingeventattribute, Agent> createdByAgentID;
    public static volatile SingularAttribute<Collectingeventattribute, String> text6;
    public static volatile SingularAttribute<Collectingeventattribute, String> remarks;
    public static volatile SingularAttribute<Collectingeventattribute, String> text9;
    public static volatile SingularAttribute<Collectingeventattribute, Integer> collectingEventAttributeID;

}