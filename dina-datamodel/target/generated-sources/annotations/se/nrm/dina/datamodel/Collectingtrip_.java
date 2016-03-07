package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectingevent;
import se.nrm.dina.datamodel.Discipline;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-07T10:42:30")
@StaticMetamodel(Collectingtrip.class)
public class Collectingtrip_ extends BaseEntity_ {

    public static volatile SingularAttribute<Collectingtrip, String> sponsor;
    public static volatile SingularAttribute<Collectingtrip, Date> endDate;
    public static volatile SingularAttribute<Collectingtrip, String> collectingTripName;
    public static volatile SingularAttribute<Collectingtrip, String> expedition;
    public static volatile SingularAttribute<Collectingtrip, Discipline> disciplineID;
    public static volatile SingularAttribute<Collectingtrip, Integer> number1;
    public static volatile SingularAttribute<Collectingtrip, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Collectingtrip, Integer> number2;
    public static volatile SingularAttribute<Collectingtrip, Short> endDatePrecision;
    public static volatile SingularAttribute<Collectingtrip, Boolean> yesNo2;
    public static volatile SingularAttribute<Collectingtrip, Boolean> yesNo1;
    public static volatile SingularAttribute<Collectingtrip, String> vessel;
    public static volatile SingularAttribute<Collectingtrip, Short> startTime;
    public static volatile SingularAttribute<Collectingtrip, String> startDateVerbatim;
    public static volatile SingularAttribute<Collectingtrip, Integer> collectingTripID;
    public static volatile SingularAttribute<Collectingtrip, Short> startDatePrecision;
    public static volatile SingularAttribute<Collectingtrip, String> text3;
    public static volatile SingularAttribute<Collectingtrip, String> text4;
    public static volatile SingularAttribute<Collectingtrip, String> text1;
    public static volatile ListAttribute<Collectingtrip, Collectingevent> collectingeventList;
    public static volatile SingularAttribute<Collectingtrip, String> text2;
    public static volatile SingularAttribute<Collectingtrip, String> cruise;
    public static volatile SingularAttribute<Collectingtrip, Agent> createdByAgentID;
    public static volatile SingularAttribute<Collectingtrip, Short> endTime;
    public static volatile SingularAttribute<Collectingtrip, String> remarks;
    public static volatile SingularAttribute<Collectingtrip, Date> startDate;
    public static volatile SingularAttribute<Collectingtrip, String> endDateVerbatim;

}