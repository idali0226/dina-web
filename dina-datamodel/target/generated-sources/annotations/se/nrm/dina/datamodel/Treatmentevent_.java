package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;
import se.nrm.dina.datamodel.Division;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-22T09:50:41")
@StaticMetamodel(Treatmentevent.class)
public class Treatmentevent_ extends BaseEntity_ {

    public static volatile SingularAttribute<Treatmentevent, Date> dateToIsolation;
    public static volatile SingularAttribute<Treatmentevent, String> treatmentNumber;
    public static volatile SingularAttribute<Treatmentevent, String> fieldNumber;
    public static volatile SingularAttribute<Treatmentevent, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Treatmentevent, String> storage;
    public static volatile SingularAttribute<Treatmentevent, Date> dateBoxed;
    public static volatile SingularAttribute<Treatmentevent, String> type;
    public static volatile SingularAttribute<Treatmentevent, Date> dateTreatmentEnded;
    public static volatile SingularAttribute<Treatmentevent, Integer> treatmentEventID;
    public static volatile SingularAttribute<Treatmentevent, Date> dateCleaned;
    public static volatile SingularAttribute<Treatmentevent, Date> dateCompleted;
    public static volatile SingularAttribute<Treatmentevent, Date> dateReceived;
    public static volatile SingularAttribute<Treatmentevent, Agent> createdByAgentID;
    public static volatile SingularAttribute<Treatmentevent, Collectionobject> collectionObjectID;
    public static volatile SingularAttribute<Treatmentevent, Division> divisionID;
    public static volatile SingularAttribute<Treatmentevent, Date> dateTreatmentStarted;
    public static volatile SingularAttribute<Treatmentevent, String> remarks;
    public static volatile SingularAttribute<Treatmentevent, Accession> accessionID;

}