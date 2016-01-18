package se.nrm.dina.datamodel;

import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectingevent;
import se.nrm.dina.datamodel.Discipline;
import se.nrm.dina.datamodel.Geocoorddetail;
import se.nrm.dina.datamodel.Geography;
import se.nrm.dina.datamodel.Localityattachment;
import se.nrm.dina.datamodel.Localitycitation;
import se.nrm.dina.datamodel.Localitydetail;
import se.nrm.dina.datamodel.Localitynamealias;
import se.nrm.dina.datamodel.Paleocontext;
import se.nrm.dina.datamodel.Specifyuser;

@Generated(value="EclipseLink-2.7.0.v20160114-rNA", date="2016-01-18T16:49:49")
@StaticMetamodel(Locality.class)
public class Locality_ extends BaseEntity_ {

    public static volatile SingularAttribute<Locality, Double> minElevation;
    public static volatile SingularAttribute<Locality, Discipline> disciplineID;
    public static volatile SingularAttribute<Locality, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Locality, BigDecimal> latitude1;
    public static volatile ListAttribute<Locality, Localitynamealias> localitynamealiasList;
    public static volatile SingularAttribute<Locality, String> long1Text;
    public static volatile SingularAttribute<Locality, BigDecimal> latitude2;
    public static volatile SingularAttribute<Locality, String> latLongType;
    public static volatile SingularAttribute<Locality, String> localityName;
    public static volatile SingularAttribute<Locality, Short> sGRStatus;
    public static volatile SingularAttribute<Locality, Double> latLongAccuracy;
    public static volatile SingularAttribute<Locality, String> long2Text;
    public static volatile SingularAttribute<Locality, String> verbatimElevation;
    public static volatile ListAttribute<Locality, Localityattachment> localityattachmentList;
    public static volatile SingularAttribute<Locality, Double> elevationAccuracy;
    public static volatile ListAttribute<Locality, Geocoorddetail> geocoorddetailList;
    public static volatile SingularAttribute<Locality, Short> visibility;
    public static volatile ListAttribute<Locality, Localitycitation> localitycitationList;
    public static volatile SingularAttribute<Locality, String> verbatimLatitude;
    public static volatile SingularAttribute<Locality, BigDecimal> longitude2;
    public static volatile SingularAttribute<Locality, String> relationToNamedPlace;
    public static volatile SingularAttribute<Locality, BigDecimal> longitude1;
    public static volatile SingularAttribute<Locality, String> text3;
    public static volatile SingularAttribute<Locality, String> text4;
    public static volatile SingularAttribute<Locality, String> text1;
    public static volatile SingularAttribute<Locality, String> text2;
    public static volatile SingularAttribute<Locality, String> lat1Text;
    public static volatile SingularAttribute<Locality, String> guid;
    public static volatile SingularAttribute<Locality, String> text5;
    public static volatile SingularAttribute<Locality, Agent> createdByAgentID;
    public static volatile SingularAttribute<Locality, String> shortName;
    public static volatile SingularAttribute<Locality, Geography> geographyID;
    public static volatile SingularAttribute<Locality, Double> maxElevation;
    public static volatile SingularAttribute<Locality, String> namedPlace;
    public static volatile SingularAttribute<Locality, String> datum;
    public static volatile SingularAttribute<Locality, String> latLongMethod;
    public static volatile SingularAttribute<Locality, Short> srcLatLongUnit;
    public static volatile SingularAttribute<Locality, String> gml;
    public static volatile SingularAttribute<Locality, Integer> originalLatLongUnit;
    public static volatile SingularAttribute<Locality, String> originalElevationUnit;
    public static volatile SingularAttribute<Locality, String> lat2Text;
    public static volatile SingularAttribute<Locality, String> verbatimLongitude;
    public static volatile SingularAttribute<Locality, Paleocontext> paleoContextID;
    public static volatile SingularAttribute<Locality, String> elevationMethod;
    public static volatile ListAttribute<Locality, Localitydetail> localitydetailList;
    public static volatile ListAttribute<Locality, Collectingevent> collectingeventList;
    public static volatile SingularAttribute<Locality, Specifyuser> visibilitySetByID;
    public static volatile SingularAttribute<Locality, Integer> localityID;
    public static volatile SingularAttribute<Locality, String> remarks;

}