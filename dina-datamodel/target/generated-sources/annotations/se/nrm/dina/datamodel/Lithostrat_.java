package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Lithostrat;
import se.nrm.dina.datamodel.Lithostrattreedef;
import se.nrm.dina.datamodel.Lithostrattreedefitem;
import se.nrm.dina.datamodel.Paleocontext;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-04-21T15:02:32")
@StaticMetamodel(Lithostrat.class)
public class Lithostrat_ extends BaseEntity_ {

    public static volatile SingularAttribute<Lithostrat, Integer> lithoStratID;
    public static volatile SingularAttribute<Lithostrat, Lithostrattreedef> lithoStratTreeDefID;
    public static volatile ListAttribute<Lithostrat, Lithostrat> lithostratList;
    public static volatile SingularAttribute<Lithostrat, Lithostrat> acceptedID;
    public static volatile SingularAttribute<Lithostrat, Integer> nodeNumber;
    public static volatile SingularAttribute<Lithostrat, String> fullName;
    public static volatile SingularAttribute<Lithostrat, Double> number1;
    public static volatile SingularAttribute<Lithostrat, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Lithostrat, Double> number2;
    public static volatile SingularAttribute<Lithostrat, Lithostrattreedefitem> lithoStratTreeDefItemID;
    public static volatile SingularAttribute<Lithostrat, Lithostrat> parentID;
    public static volatile ListAttribute<Lithostrat, Paleocontext> paleocontextList;
    public static volatile SingularAttribute<Lithostrat, Integer> rankID;
    public static volatile SingularAttribute<Lithostrat, Boolean> yesNo2;
    public static volatile SingularAttribute<Lithostrat, Boolean> yesNo1;
    public static volatile SingularAttribute<Lithostrat, String> text1;
    public static volatile SingularAttribute<Lithostrat, Boolean> isAccepted;
    public static volatile SingularAttribute<Lithostrat, String> text2;
    public static volatile SingularAttribute<Lithostrat, String> name;
    public static volatile SingularAttribute<Lithostrat, String> guid;
    public static volatile SingularAttribute<Lithostrat, Agent> createdByAgentID;
    public static volatile ListAttribute<Lithostrat, Lithostrat> lithostratList1;
    public static volatile SingularAttribute<Lithostrat, String> remarks;
    public static volatile SingularAttribute<Lithostrat, Integer> highestChildNodeNumber;

}