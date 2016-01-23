package se.nrm.dina.datamodel;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Spexportschema;
import se.nrm.dina.datamodel.Spexportschemaitemmapping;
import se.nrm.dina.datamodel.Spsymbiotainstance;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T14:02:07")
@StaticMetamodel(Spexportschemamapping.class)
public class Spexportschemamapping_ extends BaseEntity_ {

    public static volatile ListAttribute<Spexportschemamapping, Spexportschemaitemmapping> spexportschemaitemmappingList;
    public static volatile ListAttribute<Spexportschemamapping, Spsymbiotainstance> spsymbiotainstanceList;
    public static volatile SingularAttribute<Spexportschemamapping, String> mappingName;
    public static volatile ListAttribute<Spexportschemamapping, Spexportschema> spexportschemaList;
    public static volatile SingularAttribute<Spexportschemamapping, Integer> spExportSchemaMappingID;
    public static volatile SingularAttribute<Spexportschemamapping, Date> timeStampExported;
    public static volatile SingularAttribute<Spexportschemamapping, String> description;
    public static volatile SingularAttribute<Spexportschemamapping, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Spexportschemamapping, Agent> createdByAgentID;
    public static volatile SingularAttribute<Spexportschemamapping, Integer> collectionMemberID;

}