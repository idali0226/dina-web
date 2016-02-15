package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collection;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Division;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-15T15:12:39")
@StaticMetamodel(Autonumberingscheme.class)
public class Autonumberingscheme_ extends BaseEntity_ {

    public static volatile SingularAttribute<Autonumberingscheme, Boolean> isNumericOnly;
    public static volatile ListAttribute<Autonumberingscheme, Division> divisionList;
    public static volatile SingularAttribute<Autonumberingscheme, String> schemeClassName;
    public static volatile SingularAttribute<Autonumberingscheme, String> formatName;
    public static volatile SingularAttribute<Autonumberingscheme, String> schemeName;
    public static volatile ListAttribute<Autonumberingscheme, Collection> collectionList;
    public static volatile ListAttribute<Autonumberingscheme, Discipline> disciplineList;
    public static volatile SingularAttribute<Autonumberingscheme, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Autonumberingscheme, Agent> createdByAgentID;
    public static volatile SingularAttribute<Autonumberingscheme, Integer> autoNumberingSchemeID;
    public static volatile SingularAttribute<Autonumberingscheme, Integer> tableNumber;

}