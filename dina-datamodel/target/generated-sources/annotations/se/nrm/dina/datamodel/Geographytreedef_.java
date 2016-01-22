package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Geography;
import se.nrm.dina.datamodel.Geographytreedefitem;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T11:48:45")
@StaticMetamodel(Geographytreedef.class)
public class Geographytreedef_ extends BaseEntity_ {

    public static volatile SingularAttribute<Geographytreedef, Integer> geographyTreeDefID;
    public static volatile ListAttribute<Geographytreedef, Geography> geographyList;
    public static volatile SingularAttribute<Geographytreedef, Integer> fullNameDirection;
    public static volatile SingularAttribute<Geographytreedef, String> name;
    public static volatile ListAttribute<Geographytreedef, Discipline> disciplineList;
    public static volatile SingularAttribute<Geographytreedef, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Geographytreedef, Agent> createdByAgentID;
    public static volatile ListAttribute<Geographytreedef, Geographytreedefitem> geographytreedefitemList;
    public static volatile SingularAttribute<Geographytreedef, String> remarks;

}