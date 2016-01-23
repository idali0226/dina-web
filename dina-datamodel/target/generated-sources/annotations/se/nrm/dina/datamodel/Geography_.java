package se.nrm.dina.datamodel;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Agentgeography;
import se.nrm.dina.datamodel.Geography;
import se.nrm.dina.datamodel.Geographytreedef;
import se.nrm.dina.datamodel.Geographytreedefitem;
import se.nrm.dina.datamodel.Locality;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T15:02:45")
@StaticMetamodel(Geography.class)
public class Geography_ extends BaseEntity_ {

    public static volatile SingularAttribute<Geography, String> commonName;
    public static volatile SingularAttribute<Geography, String> geographyCode;
    public static volatile SingularAttribute<Geography, String> gml;
    public static volatile SingularAttribute<Geography, Integer> number1;
    public static volatile SingularAttribute<Geography, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Geography, Integer> number2;
    public static volatile SingularAttribute<Geography, Geography> parentID;
    public static volatile SingularAttribute<Geography, Geographytreedef> geographyTreeDefID;
    public static volatile ListAttribute<Geography, Agentgeography> agentgeographyList;
    public static volatile SingularAttribute<Geography, Integer> rankID;
    public static volatile SingularAttribute<Geography, Geographytreedefitem> geographyTreeDefItemID;
    public static volatile SingularAttribute<Geography, Integer> highestChildNodeNumber;
    public static volatile SingularAttribute<Geography, Geography> acceptedID;
    public static volatile SingularAttribute<Geography, Integer> nodeNumber;
    public static volatile SingularAttribute<Geography, String> fullName;
    public static volatile SingularAttribute<Geography, BigDecimal> centroidLon;
    public static volatile SingularAttribute<Geography, Date> timestampVersion;
    public static volatile SingularAttribute<Geography, Boolean> isCurrent;
    public static volatile ListAttribute<Geography, Geography> geographyList;
    public static volatile SingularAttribute<Geography, String> text1;
    public static volatile ListAttribute<Geography, Geography> geographyList1;
    public static volatile SingularAttribute<Geography, Boolean> isAccepted;
    public static volatile SingularAttribute<Geography, String> text2;
    public static volatile SingularAttribute<Geography, String> name;
    public static volatile SingularAttribute<Geography, String> guid;
    public static volatile SingularAttribute<Geography, Agent> createdByAgentID;
    public static volatile SingularAttribute<Geography, String> abbrev;
    public static volatile SingularAttribute<Geography, Integer> geographyID;
    public static volatile ListAttribute<Geography, Locality> localityList;
    public static volatile SingularAttribute<Geography, BigDecimal> centroidLat;
    public static volatile SingularAttribute<Geography, String> remarks;

}