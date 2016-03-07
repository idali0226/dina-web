package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Dnasequencingrun;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-07T10:42:30")
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