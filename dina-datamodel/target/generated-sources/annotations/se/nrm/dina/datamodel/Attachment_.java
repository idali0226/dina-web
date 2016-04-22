package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accessionattachment;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Agentattachment;
import se.nrm.dina.datamodel.Attachmentmetadata;
import se.nrm.dina.datamodel.Attachmenttag;
import se.nrm.dina.datamodel.Collectingeventattachment;
import se.nrm.dina.datamodel.Collectionobjectattachment;
import se.nrm.dina.datamodel.Conservdescriptionattachment;
import se.nrm.dina.datamodel.Conserveventattachment;
import se.nrm.dina.datamodel.Dnasequenceattachment;
import se.nrm.dina.datamodel.Dnasequencerunattachment;
import se.nrm.dina.datamodel.Fieldnotebookattachment;
import se.nrm.dina.datamodel.Fieldnotebookpageattachment;
import se.nrm.dina.datamodel.Fieldnotebookpagesetattachment;
import se.nrm.dina.datamodel.Loanattachment;
import se.nrm.dina.datamodel.Localityattachment;
import se.nrm.dina.datamodel.Permitattachment;
import se.nrm.dina.datamodel.Preparationattachment;
import se.nrm.dina.datamodel.Repositoryagreementattachment;
import se.nrm.dina.datamodel.Specifyuser;
import se.nrm.dina.datamodel.Storageattachment;
import se.nrm.dina.datamodel.Taxonattachment;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-22T09:50:41")
@StaticMetamodel(Attachment.class)
public class Attachment_ extends BaseEntity_ {

    public static volatile SingularAttribute<Attachment, Integer> scopeID;
    public static volatile ListAttribute<Attachment, Preparationattachment> preparationattachmentList;
    public static volatile ListAttribute<Attachment, Collectingeventattachment> collectingeventattachmentList;
    public static volatile ListAttribute<Attachment, Attachmentmetadata> attachmentmetadataList;
    public static volatile SingularAttribute<Attachment, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Attachment, String> mimeType;
    public static volatile SingularAttribute<Attachment, String> dateImaged;
    public static volatile SingularAttribute<Attachment, String> title;
    public static volatile ListAttribute<Attachment, Conserveventattachment> conserveventattachmentList;
    public static volatile ListAttribute<Attachment, Fieldnotebookpageattachment> fieldnotebookpageattachmentList;
    public static volatile ListAttribute<Attachment, Dnasequencerunattachment> dnasequencerunattachmentList;
    public static volatile SingularAttribute<Attachment, String> copyrightHolder;
    public static volatile SingularAttribute<Attachment, Short> scopeType;
    public static volatile SingularAttribute<Attachment, Short> tableID;
    public static volatile SingularAttribute<Attachment, String> credit;
    public static volatile ListAttribute<Attachment, Localityattachment> localityattachmentList;
    public static volatile ListAttribute<Attachment, Attachmenttag> attachmenttagList;
    public static volatile ListAttribute<Attachment, Loanattachment> loanattachmentList;
    public static volatile SingularAttribute<Attachment, Short> visibility;
    public static volatile ListAttribute<Attachment, Storageattachment> storageattachmentList;
    public static volatile ListAttribute<Attachment, Collectionobjectattachment> collectionobjectattachmentList;
    public static volatile ListAttribute<Attachment, Conservdescriptionattachment> conservdescriptionattachmentList;
    public static volatile SingularAttribute<Attachment, String> attachmentLocation;
    public static volatile SingularAttribute<Attachment, String> license;
    public static volatile ListAttribute<Attachment, Dnasequenceattachment> dnasequenceattachmentList;
    public static volatile ListAttribute<Attachment, Fieldnotebookattachment> fieldnotebookattachmentList;
    public static volatile SingularAttribute<Attachment, Integer> attachmentImageAttributeID;
    public static volatile SingularAttribute<Attachment, Date> fileCreatedDate;
    public static volatile ListAttribute<Attachment, Agentattachment> agentattachmentList;
    public static volatile ListAttribute<Attachment, Fieldnotebookpagesetattachment> fieldnotebookpagesetattachmentList;
    public static volatile ListAttribute<Attachment, Permitattachment> permitattachmentList;
    public static volatile SingularAttribute<Attachment, Specifyuser> visibilitySetByID;
    public static volatile SingularAttribute<Attachment, String> guid;
    public static volatile ListAttribute<Attachment, Accessionattachment> accessionattachmentList;
    public static volatile SingularAttribute<Attachment, Agent> createdByAgentID;
    public static volatile SingularAttribute<Attachment, Integer> attachmentID;
    public static volatile SingularAttribute<Attachment, String> copyrightDate;
    public static volatile SingularAttribute<Attachment, String> origFilename;
    public static volatile ListAttribute<Attachment, Taxonattachment> taxonattachmentList;
    public static volatile SingularAttribute<Attachment, String> remarks;
    public static volatile ListAttribute<Attachment, Repositoryagreementattachment> repositoryagreementattachmentList;

}