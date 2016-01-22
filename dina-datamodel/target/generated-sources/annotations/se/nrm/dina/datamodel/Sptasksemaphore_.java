package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collection;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Specifyuser;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T18:56:38")
@StaticMetamodel(Sptasksemaphore.class)
public class Sptasksemaphore_ extends BaseEntity_ {

    public static volatile SingularAttribute<Sptasksemaphore, Discipline> disciplineID;
    public static volatile SingularAttribute<Sptasksemaphore, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Sptasksemaphore, Specifyuser> ownerID;
    public static volatile SingularAttribute<Sptasksemaphore, Date> lockedTime;
    public static volatile SingularAttribute<Sptasksemaphore, String> machineName;
    public static volatile SingularAttribute<Sptasksemaphore, Integer> usageCount;
    public static volatile SingularAttribute<Sptasksemaphore, Integer> taskSemaphoreID;
    public static volatile SingularAttribute<Sptasksemaphore, Boolean> isLocked;
    public static volatile SingularAttribute<Sptasksemaphore, Short> scope;
    public static volatile SingularAttribute<Sptasksemaphore, String> context;
    public static volatile SingularAttribute<Sptasksemaphore, String> taskName;
    public static volatile SingularAttribute<Sptasksemaphore, Agent> createdByAgentID;
    public static volatile SingularAttribute<Sptasksemaphore, Collection> collectionID;

}