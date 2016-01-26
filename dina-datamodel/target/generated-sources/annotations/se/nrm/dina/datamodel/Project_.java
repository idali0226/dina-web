package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T10:51:25")
@StaticMetamodel(Project.class)
public class Project_ extends BaseEntity_ {

    public static volatile SingularAttribute<Project, String> grantAgency;
    public static volatile SingularAttribute<Project, String> projectname;
    public static volatile SingularAttribute<Project, Date> endDate;
    public static volatile SingularAttribute<Project, String> projectNumber;
    public static volatile SingularAttribute<Project, Float> number1;
    public static volatile SingularAttribute<Project, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Project, Agent> projectAgentID;
    public static volatile SingularAttribute<Project, Float> number2;
    public static volatile SingularAttribute<Project, String> url;
    public static volatile SingularAttribute<Project, Boolean> yesNo2;
    public static volatile SingularAttribute<Project, String> text1;
    public static volatile SingularAttribute<Project, Boolean> yesNo1;
    public static volatile SingularAttribute<Project, String> text2;
    public static volatile SingularAttribute<Project, String> projectDescription;
    public static volatile SingularAttribute<Project, Agent> createdByAgentID;
    public static volatile SingularAttribute<Project, Integer> collectionMemberID;
    public static volatile SingularAttribute<Project, Integer> projectID;
    public static volatile SingularAttribute<Project, String> grantNumber;
    public static volatile SingularAttribute<Project, String> remarks;
    public static volatile SingularAttribute<Project, Date> startDate;

}