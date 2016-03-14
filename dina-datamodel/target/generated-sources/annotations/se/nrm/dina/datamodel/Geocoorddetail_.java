package se.nrm.dina.datamodel;

import java.math.BigDecimal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Locality;

@Generated(value="EclipseLink-2.6.0.v20130922-rNA", date="2016-03-14T13:38:26")
@StaticMetamodel(Geocoorddetail.class)
public class Geocoorddetail_ extends BaseEntity_ {

    public static volatile SingularAttribute<Geocoorddetail, String> geoRefAccuracyUnits;
    public static volatile SingularAttribute<Geocoorddetail, Agent> agentID;
    public static volatile SingularAttribute<Geocoorddetail, Integer> geoCoordDetailID;
    public static volatile SingularAttribute<Geocoorddetail, String> uncertaintyPolygon;
    public static volatile SingularAttribute<Geocoorddetail, Double> geoRefAccuracy;
    public static volatile SingularAttribute<Geocoorddetail, Date> geoRefDetDate;
    public static volatile SingularAttribute<Geocoorddetail, BigDecimal> namedPlaceExtent;
    public static volatile SingularAttribute<Geocoorddetail, String> errorPolygon;
    public static volatile SingularAttribute<Geocoorddetail, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Geocoorddetail, String> geoRefRemarks;
    public static volatile SingularAttribute<Geocoorddetail, String> source;
    public static volatile SingularAttribute<Geocoorddetail, BigDecimal> maxUncertaintyEst;
    public static volatile SingularAttribute<Geocoorddetail, String> maxUncertaintyEstUnit;
    public static volatile SingularAttribute<Geocoorddetail, String> protocol;
    public static volatile SingularAttribute<Geocoorddetail, String> text3;
    public static volatile SingularAttribute<Geocoorddetail, String> text1;
    public static volatile SingularAttribute<Geocoorddetail, String> text2;
    public static volatile SingularAttribute<Geocoorddetail, String> originalCoordSystem;
    public static volatile SingularAttribute<Geocoorddetail, String> geoRefDetRef;
    public static volatile SingularAttribute<Geocoorddetail, String> geoRefVerificationStatus;
    public static volatile SingularAttribute<Geocoorddetail, Agent> createdByAgentID;
    public static volatile SingularAttribute<Geocoorddetail, Locality> localityID;
    public static volatile SingularAttribute<Geocoorddetail, String> validation;
    public static volatile SingularAttribute<Geocoorddetail, String> noGeoRefBecause;

}