package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Preparation;

@Generated(value="EclipseLink-2.7.0.v20160203-rNA", date="2016-02-05T11:53:22")
@StaticMetamodel(Preparationattachment.class)
public class Preparationattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Preparationattachment, Preparation> preparationID;
    public static volatile SingularAttribute<Preparationattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Preparationattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Preparationattachment, Integer> collectionMemberID;
    public static volatile SingularAttribute<Preparationattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Preparationattachment, Integer> preparationAttachmentID;
    public static volatile SingularAttribute<Preparationattachment, String> remarks;
    public static volatile SingularAttribute<Preparationattachment, Integer> ordinal;

}