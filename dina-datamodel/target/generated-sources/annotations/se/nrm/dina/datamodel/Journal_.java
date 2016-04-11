package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Institution;
import se.nrm.dina.datamodel.Referencework;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-11T16:29:46")
@StaticMetamodel(Journal.class)
public class Journal_ extends BaseEntity_ {

    public static volatile ListAttribute<Journal, Referencework> referenceworkList;
    public static volatile SingularAttribute<Journal, String> journalName;
    public static volatile SingularAttribute<Journal, String> issn;
    public static volatile SingularAttribute<Journal, Institution> institutionID;
    public static volatile SingularAttribute<Journal, String> text1;
    public static volatile SingularAttribute<Journal, Integer> journalID;
    public static volatile SingularAttribute<Journal, String> guid;
    public static volatile SingularAttribute<Journal, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Journal, Agent> createdByAgentID;
    public static volatile SingularAttribute<Journal, String> remarks;
    public static volatile SingularAttribute<Journal, String> journalAbbreviation;

}