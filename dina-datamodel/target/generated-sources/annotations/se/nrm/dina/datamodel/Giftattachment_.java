package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20160118-rNA", date="2016-01-21T08:43:44")
@StaticMetamodel(Giftattachment.class)
public class Giftattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Giftattachment, Integer> giftID;
    public static volatile SingularAttribute<Giftattachment, Integer> giftAttachmentID;
    public static volatile SingularAttribute<Giftattachment, Integer> createdByAgentID;
    public static volatile SingularAttribute<Giftattachment, Integer> modifiedByAgentID;
    public static volatile SingularAttribute<Giftattachment, Integer> attachmentID;
    public static volatile SingularAttribute<Giftattachment, String> remarks;
    public static volatile SingularAttribute<Giftattachment, Integer> ordinal;

}