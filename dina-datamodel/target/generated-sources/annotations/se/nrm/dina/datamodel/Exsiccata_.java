package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Exsiccataitem;
import se.nrm.dina.datamodel.Referencework;

@Generated(value="EclipseLink-2.7.0.v20160114-rNA", date="2016-01-18T14:16:55")
@StaticMetamodel(Exsiccata.class)
public class Exsiccata_ extends BaseEntity_ {

    public static volatile ListAttribute<Exsiccata, Exsiccataitem> exsiccataitemList;
    public static volatile SingularAttribute<Exsiccata, Integer> exsiccataID;
    public static volatile SingularAttribute<Exsiccata, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Exsiccata, Agent> createdByAgentID;
    public static volatile SingularAttribute<Exsiccata, String> title;
    public static volatile SingularAttribute<Exsiccata, Referencework> referenceWorkID;

}