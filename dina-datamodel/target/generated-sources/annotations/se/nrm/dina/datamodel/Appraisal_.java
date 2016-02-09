package se.nrm.dina.datamodel;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectionobject;

@Generated(value="EclipseLink-2.7.0.v20160208-rNA", date="2016-02-09T12:42:24")
@StaticMetamodel(Appraisal.class)
public class Appraisal_ extends BaseEntity_ {

    public static volatile SingularAttribute<Appraisal, String> appraisalNumber;
    public static volatile SingularAttribute<Appraisal, String> monetaryUnitType;
    public static volatile SingularAttribute<Appraisal, Agent> agentID;
    public static volatile SingularAttribute<Appraisal, String> notes;
    public static volatile SingularAttribute<Appraisal, BigDecimal> appraisalValue;
    public static volatile ListAttribute<Appraisal, Collectionobject> collectionobjectList;
    public static volatile SingularAttribute<Appraisal, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Appraisal, Agent> createdByAgentID;
    public static volatile SingularAttribute<Appraisal, Integer> appraisalID;
    public static volatile SingularAttribute<Appraisal, Date> appraisalDate;
    public static volatile SingularAttribute<Appraisal, Accession> accessionID;

}