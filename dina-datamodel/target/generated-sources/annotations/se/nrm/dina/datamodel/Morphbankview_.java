package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.0.v20160118-rNA", date="2016-01-19T06:20:34")
@StaticMetamodel(Morphbankview.class)
public class Morphbankview_ extends BaseEntity_ {

    public static volatile SingularAttribute<Morphbankview, String> developmentState;
    public static volatile SingularAttribute<Morphbankview, String> imagingTechnique;
    public static volatile SingularAttribute<Morphbankview, String> imagingPreparationTechnique;
    public static volatile SingularAttribute<Morphbankview, Integer> morphBankExternalViewID;
    public static volatile SingularAttribute<Morphbankview, String> form;
    public static volatile SingularAttribute<Morphbankview, String> viewName;
    public static volatile SingularAttribute<Morphbankview, Integer> morphBankViewID;
    public static volatile SingularAttribute<Morphbankview, String> sex;
    public static volatile SingularAttribute<Morphbankview, String> specimenPart;
    public static volatile SingularAttribute<Morphbankview, Integer> modifiedByAgentID;
    public static volatile SingularAttribute<Morphbankview, String> viewAngle;
    public static volatile SingularAttribute<Morphbankview, Integer> createdByAgentID;

}