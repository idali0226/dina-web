package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Division;
import se.nrm.dina.datamodel.Institution;

@Generated(value="EclipseLink-2.7.0.v20160121-rNA", date="2016-01-22T12:22:39")
@StaticMetamodel(Address.class)
public class Address_ extends BaseEntity_ {

    public static volatile SingularAttribute<Address, String> roomOrBuilding;
    public static volatile SingularAttribute<Address, String> country;
    public static volatile SingularAttribute<Address, String> city;
    public static volatile SingularAttribute<Address, Date> endDate;
    public static volatile SingularAttribute<Address, String> typeOfAddr;
    public static volatile SingularAttribute<Address, String> postalCode;
    public static volatile SingularAttribute<Address, String> phone2;
    public static volatile SingularAttribute<Address, Boolean> isShipping;
    public static volatile SingularAttribute<Address, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Address, String> phone1;
    public static volatile SingularAttribute<Address, Boolean> isPrimary;
    public static volatile SingularAttribute<Address, String> address5;
    public static volatile SingularAttribute<Address, String> address4;
    public static volatile SingularAttribute<Address, String> state;
    public static volatile SingularAttribute<Address, String> fax;
    public static volatile SingularAttribute<Address, Agent> agentID;
    public static volatile ListAttribute<Address, Institution> institutionList;
    public static volatile SingularAttribute<Address, String> address;
    public static volatile SingularAttribute<Address, String> address3;
    public static volatile ListAttribute<Address, Division> divisionList;
    public static volatile SingularAttribute<Address, String> address2;
    public static volatile SingularAttribute<Address, Integer> addressID;
    public static volatile SingularAttribute<Address, Boolean> isCurrent;
    public static volatile SingularAttribute<Address, Agent> createdByAgentID;
    public static volatile SingularAttribute<Address, String> positionHeld;
    public static volatile SingularAttribute<Address, String> remarks;
    public static volatile SingularAttribute<Address, Date> startDate;
    public static volatile SingularAttribute<Address, Integer> ordinal;

}