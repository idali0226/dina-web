package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Lithostrat;
import se.nrm.dina.datamodel.Lithostrattreedefitem;

@Generated(value="EclipseLink-2.7.0.v20160118-rNA", date="2016-01-19T06:20:34")
@StaticMetamodel(Lithostrattreedef.class)
public class Lithostrattreedef_ extends BaseEntity_ {

    public static volatile SingularAttribute<Lithostrattreedef, Integer> lithoStratTreeDefID;
    public static volatile ListAttribute<Lithostrattreedef, Lithostrat> lithostratList;
    public static volatile SingularAttribute<Lithostrattreedef, Integer> fullNameDirection;
    public static volatile SingularAttribute<Lithostrattreedef, String> name;
    public static volatile ListAttribute<Lithostrattreedef, Discipline> disciplineList;
    public static volatile SingularAttribute<Lithostrattreedef, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Lithostrattreedef, Agent> createdByAgentID;
    public static volatile ListAttribute<Lithostrattreedef, Lithostrattreedefitem> lithostrattreedefitemList;
    public static volatile SingularAttribute<Lithostrattreedef, String> remarks;

}