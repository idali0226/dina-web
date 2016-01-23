package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectingeventattachment;
import se.nrm.dina.datamodel.Collectingeventattr;
import se.nrm.dina.datamodel.Collectingeventattribute;
import se.nrm.dina.datamodel.Collectingtrip;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Collector;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Locality;
import se.nrm.dina.datamodel.Paleocontext;
import se.nrm.dina.datamodel.Specifyuser;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T15:02:45")
@StaticMetamodel(Collectingevent.class)
public class Collectingevent_ extends BaseEntity_ {

    public static volatile SingularAttribute<Collectingevent, Date> endDate;
    public static volatile ListAttribute<Collectingevent, Collectingeventattachment> collectingeventattachmentList;
    public static volatile SingularAttribute<Collectingevent, Integer> integer1;
    public static volatile SingularAttribute<Collectingevent, Discipline> disciplineID;
    public static volatile SingularAttribute<Collectingevent, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Collectingevent, Integer> integer2;
    public static volatile SingularAttribute<Collectingevent, Short> endDatePrecision;
    public static volatile SingularAttribute<Collectingevent, Short> sGRStatus;
    public static volatile SingularAttribute<Collectingevent, Integer> reservedInteger3;
    public static volatile SingularAttribute<Collectingevent, Integer> reservedInteger4;
    public static volatile SingularAttribute<Collectingevent, Short> startTime;
    public static volatile ListAttribute<Collectingevent, Collectingeventattr> collectingeventattrList;
    public static volatile SingularAttribute<Collectingevent, Paleocontext> paleoContextID;
    public static volatile SingularAttribute<Collectingevent, String> method;
    public static volatile SingularAttribute<Collectingevent, Short> visibility;
    public static volatile SingularAttribute<Collectingevent, String> startDateVerbatim;
    public static volatile SingularAttribute<Collectingevent, String> verbatimLocality;
    public static volatile SingularAttribute<Collectingevent, String> stationFieldNumber;
    public static volatile SingularAttribute<Collectingevent, Collectingtrip> collectingTripID;
    public static volatile SingularAttribute<Collectingevent, String> reservedText1;
    public static volatile SingularAttribute<Collectingevent, String> reservedText2;
    public static volatile ListAttribute<Collectingevent, Collector> collectorList;
    public static volatile SingularAttribute<Collectingevent, Short> startDatePrecision;
    public static volatile SingularAttribute<Collectingevent, String> verbatimDate;
    public static volatile SingularAttribute<Collectingevent, String> text1;
    public static volatile ListAttribute<Collectingevent, Collectionobject> collectionobjectList;
    public static volatile SingularAttribute<Collectingevent, String> text2;
    public static volatile SingularAttribute<Collectingevent, Specifyuser> visibilitySetByID;
    public static volatile SingularAttribute<Collectingevent, Integer> collectingEventID;
    public static volatile SingularAttribute<Collectingevent, String> guid;
    public static volatile SingularAttribute<Collectingevent, Agent> createdByAgentID;
    public static volatile SingularAttribute<Collectingevent, Short> endTime;
    public static volatile SingularAttribute<Collectingevent, Locality> localityID;
    public static volatile SingularAttribute<Collectingevent, String> remarks;
    public static volatile SingularAttribute<Collectingevent, Date> startDate;
    public static volatile SingularAttribute<Collectingevent, String> endDateVerbatim;
    public static volatile SingularAttribute<Collectingevent, Collectingeventattribute> collectingEventAttributeID;

}