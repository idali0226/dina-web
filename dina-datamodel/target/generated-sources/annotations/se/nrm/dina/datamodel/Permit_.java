package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accessionauthorization;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Institution;
import se.nrm.dina.datamodel.Permitattachment;

@Generated(value="EclipseLink-2.7.0.v20160210-rNA", date="2016-02-11T12:23:21")
@StaticMetamodel(Permit.class)
public class Permit_ extends BaseEntity_ {

    public static volatile SingularAttribute<Permit, Date> issuedDate;
    public static volatile ListAttribute<Permit, Accessionauthorization> accessionauthorizationList;
    public static volatile SingularAttribute<Permit, Integer> permitID;
    public static volatile SingularAttribute<Permit, Institution> institutionID;
    public static volatile SingularAttribute<Permit, Date> endDate;
    public static volatile SingularAttribute<Permit, Float> number1;
    public static volatile SingularAttribute<Permit, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Permit, Agent> issuedByID;
    public static volatile SingularAttribute<Permit, Float> number2;
    public static volatile SingularAttribute<Permit, Date> renewalDate;
    public static volatile SingularAttribute<Permit, String> type;
    public static volatile SingularAttribute<Permit, String> permitNumber;
    public static volatile SingularAttribute<Permit, Boolean> yesNo2;
    public static volatile SingularAttribute<Permit, String> text1;
    public static volatile SingularAttribute<Permit, Boolean> yesNo1;
    public static volatile SingularAttribute<Permit, String> text2;
    public static volatile ListAttribute<Permit, Permitattachment> permitattachmentList;
    public static volatile SingularAttribute<Permit, Agent> createdByAgentID;
    public static volatile SingularAttribute<Permit, String> remarks;
    public static volatile SingularAttribute<Permit, Date> startDate;
    public static volatile SingularAttribute<Permit, Agent> issuedToID;

}