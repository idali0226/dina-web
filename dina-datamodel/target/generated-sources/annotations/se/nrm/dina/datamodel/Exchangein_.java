package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Addressofrecord;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Division;

@Generated(value="EclipseLink-2.7.0.v20160211-rNA", date="2016-02-16T16:33:04")
@StaticMetamodel(Exchangein.class)
public class Exchangein_ extends BaseEntity_ {

    public static volatile SingularAttribute<Exchangein, Date> exchangeDate;
    public static volatile SingularAttribute<Exchangein, Short> quantityExchanged;
    public static volatile SingularAttribute<Exchangein, Agent> receivedFromOrganizationID;
    public static volatile SingularAttribute<Exchangein, Addressofrecord> addressOfRecordID;
    public static volatile SingularAttribute<Exchangein, Agent> catalogedByID;
    public static volatile SingularAttribute<Exchangein, String> srcTaxonomy;
    public static volatile SingularAttribute<Exchangein, Float> number1;
    public static volatile SingularAttribute<Exchangein, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Exchangein, Float> number2;
    public static volatile SingularAttribute<Exchangein, String> srcGeography;
    public static volatile SingularAttribute<Exchangein, Integer> exchangeInID;
    public static volatile SingularAttribute<Exchangein, String> descriptionOfMaterial;
    public static volatile SingularAttribute<Exchangein, Boolean> yesNo2;
    public static volatile SingularAttribute<Exchangein, String> contents;
    public static volatile SingularAttribute<Exchangein, String> text1;
    public static volatile SingularAttribute<Exchangein, Boolean> yesNo1;
    public static volatile SingularAttribute<Exchangein, String> exchangeInNumber;
    public static volatile SingularAttribute<Exchangein, String> text2;
    public static volatile SingularAttribute<Exchangein, Agent> createdByAgentID;
    public static volatile SingularAttribute<Exchangein, Division> divisionID;
    public static volatile SingularAttribute<Exchangein, String> remarks;

}