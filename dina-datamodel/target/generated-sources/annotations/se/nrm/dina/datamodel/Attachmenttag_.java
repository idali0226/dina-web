package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T16:21:31")
@StaticMetamodel(Attachmenttag.class)
public class Attachmenttag_ extends BaseEntity_ {

    public static volatile SingularAttribute<Attachmenttag, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Attachmenttag, Agent> createdByAgentID;
    public static volatile SingularAttribute<Attachmenttag, String> tag;
    public static volatile SingularAttribute<Attachmenttag, Attachment> attachmentID;
    public static volatile SingularAttribute<Attachmenttag, Integer> attachmentTagID;

}