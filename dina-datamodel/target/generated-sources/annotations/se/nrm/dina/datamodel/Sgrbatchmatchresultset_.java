package se.nrm.dina.datamodel;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Sgrbatchmatchresultitem;
import se.nrm.dina.datamodel.Sgrmatchconfiguration;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T17:07:59")
@StaticMetamodel(Sgrbatchmatchresultset.class)
public class Sgrbatchmatchresultset_ { 

    public static volatile SingularAttribute<Sgrbatchmatchresultset, Date> insertTime;
    public static volatile SingularAttribute<Sgrbatchmatchresultset, String> query;
    public static volatile SingularAttribute<Sgrbatchmatchresultset, String> name;
    public static volatile SingularAttribute<Sgrbatchmatchresultset, BigInteger> recordSetID;
    public static volatile SingularAttribute<Sgrbatchmatchresultset, Long> id;
    public static volatile SingularAttribute<Sgrbatchmatchresultset, Integer> dbTableId;
    public static volatile SingularAttribute<Sgrbatchmatchresultset, Sgrmatchconfiguration> matchConfigurationId;
    public static volatile SingularAttribute<Sgrbatchmatchresultset, String> remarks;
    public static volatile ListAttribute<Sgrbatchmatchresultset, Sgrbatchmatchresultitem> sgrbatchmatchresultitemList;

}