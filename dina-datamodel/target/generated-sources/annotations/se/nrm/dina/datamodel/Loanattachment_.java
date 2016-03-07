package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Loan;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-07T10:42:30")
@StaticMetamodel(Loanattachment.class)
public class Loanattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Loanattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Loanattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Loanattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Loanattachment, Integer> loanAttachmentID;
    public static volatile SingularAttribute<Loanattachment, String> remarks;
    public static volatile SingularAttribute<Loanattachment, Loan> loanID;
    public static volatile SingularAttribute<Loanattachment, Integer> ordinal;

}