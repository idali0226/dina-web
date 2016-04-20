package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Specifyuser;
import se.nrm.dina.datamodel.Spqueryfield;
import se.nrm.dina.datamodel.Spreport;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-20T13:57:07")
@StaticMetamodel(Spquery.class)
public class Spquery_ extends BaseEntity_ {

    public static volatile SingularAttribute<Spquery, Integer> spQueryID;
    public static volatile SingularAttribute<Spquery, Boolean> searchSynonymy;
    public static volatile SingularAttribute<Spquery, Boolean> selectDistinct;
    public static volatile SingularAttribute<Spquery, String> contextName;
    public static volatile SingularAttribute<Spquery, Specifyuser> specifyUserID;
    public static volatile SingularAttribute<Spquery, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spquery, String> sqlStr;
    public static volatile SingularAttribute<Spquery, Short> contextTableId;
    public static volatile SingularAttribute<Spquery, Boolean> countOnly;
    public static volatile SingularAttribute<Spquery, String> name;
    public static volatile ListAttribute<Spquery, Spreport> spreportList;
    public static volatile SingularAttribute<Spquery, Agent> createdByAgentID;
    public static volatile ListAttribute<Spquery, Spqueryfield> spqueryfieldList;
    public static volatile SingularAttribute<Spquery, Boolean> smushed;
    public static volatile SingularAttribute<Spquery, String> remarks;
    public static volatile SingularAttribute<Spquery, Boolean> isFavorite;
    public static volatile SingularAttribute<Spquery, Short> ordinal;

}