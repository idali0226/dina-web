package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-02T11:43:24")
@StaticMetamodel(Borrowattachment.class)
public class Borrowattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Borrowattachment, Integer> modifiedByAgentID;
    public static volatile SingularAttribute<Borrowattachment, Integer> createdByAgentID;
    public static volatile SingularAttribute<Borrowattachment, Integer> borrowID;
    public static volatile SingularAttribute<Borrowattachment, Integer> attachmentID;
    public static volatile SingularAttribute<Borrowattachment, Integer> borrowAttachmentID;
    public static volatile SingularAttribute<Borrowattachment, String> remarks;
    public static volatile SingularAttribute<Borrowattachment, Integer> ordinal;

}