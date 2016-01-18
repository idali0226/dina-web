package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Referencework;

@Generated(value="EclipseLink-2.7.0.v20160114-rNA", date="2016-01-18T14:16:56")
@StaticMetamodel(Author.class)
public class Author_ extends BaseEntity_ {

    public static volatile SingularAttribute<Author, Agent> agentID;
    public static volatile SingularAttribute<Author, Short> orderNumber;
    public static volatile SingularAttribute<Author, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Author, Agent> createdByAgentID;
    public static volatile SingularAttribute<Author, Integer> authorID;
    public static volatile SingularAttribute<Author, Referencework> referenceWorkID;
    public static volatile SingularAttribute<Author, String> remarks;

}