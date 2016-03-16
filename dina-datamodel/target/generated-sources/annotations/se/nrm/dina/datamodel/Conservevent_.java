package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Conservdescription;
import se.nrm.dina.datamodel.Conserveventattachment;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-16T12:32:55")
@StaticMetamodel(Conservevent.class)
public class Conservevent_ extends BaseEntity_ {

    public static volatile SingularAttribute<Conservevent, Date> curatorApprovalDate;
    public static volatile SingularAttribute<Conservevent, Date> examDate;
    public static volatile SingularAttribute<Conservevent, String> advTestingExam;
    public static volatile SingularAttribute<Conservevent, Integer> number1;
    public static volatile SingularAttribute<Conservevent, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Conservevent, Integer> number2;
    public static volatile SingularAttribute<Conservevent, Short> examDatePrecision;
    public static volatile SingularAttribute<Conservevent, String> treatmentReport;
    public static volatile ListAttribute<Conservevent, Conserveventattachment> conserveventattachmentList;
    public static volatile SingularAttribute<Conservevent, Boolean> yesNo2;
    public static volatile SingularAttribute<Conservevent, String> completedComments;
    public static volatile SingularAttribute<Conservevent, Boolean> yesNo1;
    public static volatile SingularAttribute<Conservevent, Date> treatmentCompDate;
    public static volatile SingularAttribute<Conservevent, Short> completedDatePrecision;
    public static volatile SingularAttribute<Conservevent, Short> treatmentCompDatePrecision;
    public static volatile SingularAttribute<Conservevent, String> photoDocs;
    public static volatile SingularAttribute<Conservevent, Agent> examinedByAgentID;
    public static volatile SingularAttribute<Conservevent, Conservdescription> conservDescriptionID;
    public static volatile SingularAttribute<Conservevent, Integer> conservEventID;
    public static volatile SingularAttribute<Conservevent, Short> curatorApprovalDatePrecision;
    public static volatile SingularAttribute<Conservevent, Date> completedDate;
    public static volatile SingularAttribute<Conservevent, String> conditionReport;
    public static volatile SingularAttribute<Conservevent, Agent> curatorID;
    public static volatile SingularAttribute<Conservevent, String> advTestingExamResults;
    public static volatile SingularAttribute<Conservevent, String> text1;
    public static volatile SingularAttribute<Conservevent, String> text2;
    public static volatile SingularAttribute<Conservevent, Agent> createdByAgentID;
    public static volatile SingularAttribute<Conservevent, Agent> treatedByAgentID;
    public static volatile SingularAttribute<Conservevent, String> remarks;

}