package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Recordset;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T15:11:50")
@StaticMetamodel(Inforequest.class)
public class Inforequest_ extends BaseEntity_ {

    public static volatile SingularAttribute<Inforequest, String> firstname;
    public static volatile SingularAttribute<Inforequest, Agent> agentID;
    public static volatile SingularAttribute<Inforequest, Integer> infoRequestID;
    public static volatile SingularAttribute<Inforequest, Date> replyDate;
    public static volatile SingularAttribute<Inforequest, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Inforequest, String> lastname;
    public static volatile SingularAttribute<Inforequest, String> institution;
    public static volatile SingularAttribute<Inforequest, String> infoReqNumber;
    public static volatile SingularAttribute<Inforequest, Date> requestDate;
    public static volatile SingularAttribute<Inforequest, Agent> createdByAgentID;
    public static volatile SingularAttribute<Inforequest, Integer> collectionMemberID;
    public static volatile ListAttribute<Inforequest, Recordset> recordsetList;
    public static volatile SingularAttribute<Inforequest, String> email;
    public static volatile SingularAttribute<Inforequest, String> remarks;

}