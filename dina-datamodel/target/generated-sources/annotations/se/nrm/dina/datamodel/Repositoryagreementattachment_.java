package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Attachment;
import se.nrm.dina.datamodel.Repositoryagreement;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-21T11:14:44")
@StaticMetamodel(Repositoryagreementattachment.class)
public class Repositoryagreementattachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Repositoryagreementattachment, Integer> repositoryAgreementAttachmentID;
    public static volatile SingularAttribute<Repositoryagreementattachment, Repositoryagreement> repositoryAgreementID;
    public static volatile SingularAttribute<Repositoryagreementattachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Repositoryagreementattachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Repositoryagreementattachment, Attachment> attachmentID;
    public static volatile SingularAttribute<Repositoryagreementattachment, String> remarks;
    public static volatile SingularAttribute<Repositoryagreementattachment, Integer> ordinal;

}