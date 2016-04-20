package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-20T13:57:06")
@StaticMetamodel(Attachmenttag.class)
public class Attachmenttag_ extends BaseEntity_ {

    public static volatile SingularAttribute<Attachmenttag, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Attachmenttag, Agent> createdByAgentID;
    public static volatile SingularAttribute<Attachmenttag, String> tag;
    public static volatile SingularAttribute<Attachmenttag, Attachment> attachmentID;
    public static volatile SingularAttribute<Attachmenttag, Integer> attachmentTagID;

}