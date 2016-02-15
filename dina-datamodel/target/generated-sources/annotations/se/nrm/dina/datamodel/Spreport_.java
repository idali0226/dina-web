package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spappresource;
import se.nrm.dina.datamodel.Specifyuser;
import se.nrm.dina.datamodel.Spquery;
import se.nrm.dina.datamodel.Workbenchtemplate;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T16:21:31")
@StaticMetamodel(Spreport.class)
public class Spreport_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spreport, Workbenchtemplate> workbenchTemplateID;
    public static volatile SingularAttribute<Spreport, Spquery> spQueryID;
    public static volatile SingularAttribute<Spreport, Spappresource> appResourceID;
    public static volatile SingularAttribute<Spreport, Specifyuser> specifyUserID;
    public static volatile SingularAttribute<Spreport, Integer> spReportId;
    public static volatile SingularAttribute<Spreport, String> name;
    public static volatile SingularAttribute<Spreport, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spreport, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spreport, String> repeatField;
    public static volatile SingularAttribute<Spreport, String> remarks;
    public static volatile SingularAttribute<Spreport, Integer> repeatCount;

}