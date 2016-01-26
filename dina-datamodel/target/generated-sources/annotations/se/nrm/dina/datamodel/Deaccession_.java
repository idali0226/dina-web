package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Accession;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Deaccessionagent;
import se.nrm.dina.datamodel.Deaccessionpreparation;

@Generated(value="EclipseLink-2.7.0.v20160125-rNA", date="2016-01-26T10:51:25")
@StaticMetamodel(Deaccession.class)
public class Deaccession_ extends BaseEntity_ {

    public static volatile SingularAttribute<Deaccession, String> deaccessionNumber;
    public static volatile SingularAttribute<Deaccession, Float> number1;
    public static volatile ListAttribute<Deaccession, Deaccessionpreparation> deaccessionpreparationList;
    public static volatile SingularAttribute<Deaccession, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Deaccession, Float> number2;
    public static volatile SingularAttribute<Deaccession, String> type;
    public static volatile ListAttribute<Deaccession, Deaccessionagent> deaccessionagentList;
    public static volatile SingularAttribute<Deaccession, Date> deaccessionDate;
    public static volatile SingularAttribute<Deaccession, Boolean> yesNo2;
    public static volatile SingularAttribute<Deaccession, String> text1;
    public static volatile SingularAttribute<Deaccession, Boolean> yesNo1;
    public static volatile SingularAttribute<Deaccession, String> text2;
    public static volatile SingularAttribute<Deaccession, Integer> deaccessionID;
    public static volatile SingularAttribute<Deaccession, Agent> createdByAgentID;
    public static volatile SingularAttribute<Deaccession, String> remarks;
    public static volatile SingularAttribute<Deaccession, Accession> accessionID;

}