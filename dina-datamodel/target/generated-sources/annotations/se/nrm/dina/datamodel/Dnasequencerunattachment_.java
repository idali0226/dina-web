package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Dnasequencingrun;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T10:51:25")
@StaticMetamodel(Dnasequencerunattachment.class)
public class Dnasequencerunattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Dnasequencerunattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Dnasequencerunattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Dnasequencerunattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Dnasequencerunattachment, Integer> dnaSequencingRunAttachmentId;
    public static volatile SingularAttribute<Dnasequencerunattachment, String> remarks;
    public static volatile SingularAttribute<Dnasequencerunattachment, Dnasequencingrun> dnaSequencingRunID;
    public static volatile SingularAttribute<Dnasequencerunattachment, Integer> ordinal;

}