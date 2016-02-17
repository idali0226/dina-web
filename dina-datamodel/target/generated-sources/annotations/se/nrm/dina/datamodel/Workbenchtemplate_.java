package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Specifyuser;
import se.nrm.dina.datamodel.Spreport;
import se.nrm.dina.datamodel.Workbench;
import se.nrm.dina.datamodel.Workbenchtemplatemappingitem;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-17T11:15:58")
@StaticMetamodel(Workbenchtemplate.class)
public class Workbenchtemplate_ extends BaseEntity_ {

    public static volatile SingularAttribute<Workbenchtemplate, Integer> workbenchTemplateID;
    public static volatile ListAttribute<Workbenchtemplate, Workbench> workbenchList;
    public static volatile ListAttribute<Workbenchtemplate, Workbenchtemplatemappingitem> workbenchtemplatemappingitemList;
    public static volatile SingularAttribute<Workbenchtemplate, Specifyuser> specifyUserID;
    public static volatile SingularAttribute<Workbenchtemplate, String> name;
    public static volatile ListAttribute<Workbenchtemplate, Spreport> spreportList;
    public static volatile SingularAttribute<Workbenchtemplate, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Workbenchtemplate, Agent> createdByAgentID;
    public static volatile SingularAttribute<Workbenchtemplate, String> srcFilePath;
    public static volatile SingularAttribute<Workbenchtemplate, String> remarks;

}