package se.nrm.dina.datamodel;

import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import se.nrm.dina.datamodel.Agent;
import se.nrm.dina.datamodel.Collectingeventattribute;
import se.nrm.dina.datamodel.Commonnametx;
import se.nrm.dina.datamodel.Determination;
import se.nrm.dina.datamodel.Specifyuser;
import se.nrm.dina.datamodel.Taxon;
import se.nrm.dina.datamodel.Taxonattachment;
import se.nrm.dina.datamodel.Taxoncitation;
import se.nrm.dina.datamodel.Taxontreedef;
import se.nrm.dina.datamodel.Taxontreedefitem;

@Generated(value="EclipseLink-2.7.0.v20160122-rNA", date="2016-01-23T14:02:07")
@StaticMetamodel(Taxon.class)
public class Taxon_ extends BaseEntity_ {

    public static volatile ListAttribute<Taxon, Taxon> taxonList3;
    public static volatile SingularAttribute<Taxon, String> commonName;
    public static volatile ListAttribute<Taxon, Taxon> taxonList2;
    public static volatile SingularAttribute<Taxon, String> unitName2;
    public static volatile ListAttribute<Taxon, Taxon> taxonList1;
    public static volatile SingularAttribute<Taxon, String> unitName1;
    public static volatile SingularAttribute<Taxon, String> unitName4;
    public static volatile SingularAttribute<Taxon, String> ncbiTaxonNumber;
    public static volatile SingularAttribute<Taxon, String> unitName3;
    public static volatile SingularAttribute<Taxon, String> citesStatus;
    public static volatile SingularAttribute<Taxon, Agent> modifiedByAgentID;
    public static volatile SingularAttribute<Taxon, String> source;
    public static volatile SingularAttribute<Taxon, String> environmentalProtectionStatus;
    public static volatile ListAttribute<Taxon, Determination> determinationList;
    public static volatile SingularAttribute<Taxon, String> cOLStatus;
    public static volatile SingularAttribute<Taxon, Boolean> yesNo3;
    public static volatile SingularAttribute<Taxon, Boolean> yesNo2;
    public static volatile SingularAttribute<Taxon, Boolean> yesNo1;
    public static volatile SingularAttribute<Taxon, Taxon> hybridParent1ID;
    public static volatile SingularAttribute<Taxon, Integer> highestChildNodeNumber;
    public static volatile SingularAttribute<Taxon, Short> visibility;
    public static volatile SingularAttribute<Taxon, String> author;
    public static volatile SingularAttribute<Taxon, Integer> nodeNumber;
    public static volatile SingularAttribute<Taxon, String> text3;
    public static volatile SingularAttribute<Taxon, String> labelFormat;
    public static volatile SingularAttribute<Taxon, String> text4;
    public static volatile SingularAttribute<Taxon, String> text1;
    public static volatile SingularAttribute<Taxon, Boolean> isAccepted;
    public static volatile SingularAttribute<Taxon, String> text2;
    public static volatile SingularAttribute<Taxon, String> name;
    public static volatile ListAttribute<Taxon, Taxoncitation> taxoncitationList;
    public static volatile SingularAttribute<Taxon, String> guid;
    public static volatile SingularAttribute<Taxon, Boolean> isHybrid;
    public static volatile SingularAttribute<Taxon, String> text5;
    public static volatile SingularAttribute<Taxon, Agent> createdByAgentID;
    public static volatile SingularAttribute<Taxon, Taxontreedef> taxonTreeDefID;
    public static volatile ListAttribute<Taxon, Determination> determinationList1;
    public static volatile SingularAttribute<Taxon, Float> number3;
    public static volatile SingularAttribute<Taxon, Float> number4;
    public static volatile SingularAttribute<Taxon, Integer> number1;
    public static volatile SingularAttribute<Taxon, Integer> number2;
    public static volatile ListAttribute<Taxon, Commonnametx> commonnametxList;
    public static volatile SingularAttribute<Taxon, Integer> taxonID;
    public static volatile SingularAttribute<Taxon, Float> number5;
    public static volatile SingularAttribute<Taxon, Taxon> parentID;
    public static volatile SingularAttribute<Taxon, String> unitInd4;
    public static volatile SingularAttribute<Taxon, String> unitInd3;
    public static volatile SingularAttribute<Taxon, String> esaStatus;
    public static volatile SingularAttribute<Taxon, Taxontreedefitem> taxonTreeDefItemID;
    public static volatile ListAttribute<Taxon, Taxon> taxonList;
    public static volatile SingularAttribute<Taxon, Integer> rankID;
    public static volatile SingularAttribute<Taxon, Taxon> hybridParent2ID;
    public static volatile SingularAttribute<Taxon, String> isisNumber;
    public static volatile SingularAttribute<Taxon, String> unitInd2;
    public static volatile SingularAttribute<Taxon, String> unitInd1;
    public static volatile SingularAttribute<Taxon, String> usfwsCode;
    public static volatile SingularAttribute<Taxon, String> cultivarName;
    public static volatile SingularAttribute<Taxon, Taxon> acceptedID;
    public static volatile SingularAttribute<Taxon, String> fullName;
    public static volatile SingularAttribute<Taxon, String> taxonomicSerialNumber;
    public static volatile SingularAttribute<Taxon, String> groupNumber;
    public static volatile ListAttribute<Taxon, Collectingeventattribute> collectingeventattributeList;
    public static volatile SingularAttribute<Taxon, Specifyuser> visibilitySetByID;
    public static volatile ListAttribute<Taxon, Taxonattachment> taxonattachmentList;
    public static volatile SingularAttribute<Taxon, String> remarks;

}