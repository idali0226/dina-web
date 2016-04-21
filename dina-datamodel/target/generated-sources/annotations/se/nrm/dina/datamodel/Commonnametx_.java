package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Commonnametxcitation;
import se.nrm.dina.datamodel.Taxon;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-21T09:39:58")
@StaticMetamodel(Commonnametx.class)
public class Commonnametx_ extends BaseEntity_ {

    public static volatile SingularAttribute<Commonnametx, String> country;
    public static volatile SingularAttribute<Commonnametx, Integer> commonNameTxID;
    public static volatile ListAttribute<Commonnametx, Commonnametxcitation> commonnametxcitationList;
    public static volatile SingularAttribute<Commonnametx, String> author;
    public static volatile SingularAttribute<Commonnametx, String> name;
    public static volatile SingularAttribute<Commonnametx, String> variant;
    public static volatile SingularAttribute<Commonnametx, String> language;
    public static volatile SingularAttribute<Commonnametx, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Commonnametx, Agent> createdByAgentID;
    public static volatile SingularAttribute<Commonnametx, Taxon> taxonID;

}