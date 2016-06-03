/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.service.metadata;

import java.time.LocalDateTime;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import org.apache.commons.lang.StringUtils; 
import se.nrm.dina.data.service.vo.MetadataBean;
import se.nrm.dina.logic.util.HelpClass;

/**
 *
 * @author idali
 */
public class Metadata {
    
    public Metadata() {
        
    }

    public MetadataBean buildMetadata(HttpServletRequest req, String entity, int totalResults, int limit, List<String> orderby, String sortOrder) {
         
        String pathInfo = req.getPathInfo(); 
        String version = StringUtils.substringBetween(pathInfo, "/v", "/" + entity);

        MetadataBean meta = new MetadataBean();
        meta.setCallEndpoint(buildURI(req));
        meta.setApiVersion(version);
        meta.setCallDate(HelpClass.getInstance().dateTimeToString(LocalDateTime.now()));
        meta.setNumOfResults(totalResults);
        meta.setSupportedLanguages(HelpClass.getInstance().getSupportedLanguages());
        meta.setLimit(limit);
        meta.setOrderBy(orderby);
        meta.setSortOrder(sortOrder == null ? "" : sortOrder);
        meta.setMaintenanceContact(HelpClass.getInstance().getMaintanceContact());
        return meta;
    }

    public MetadataBean buildMetadata(String endPoint, int totalResults, int limit, List<String> orderby, String sortOrder, String version) {

        MetadataBean meta = new MetadataBean();
        meta.setCallEndpoint(endPoint);
        meta.setApiVersion(version);
        meta.setCallDate(HelpClass.getInstance().dateTimeToString(LocalDateTime.now())); 
        meta.setNumOfResults(totalResults);
        meta.setSupportedLanguages(HelpClass.getInstance().getSupportedLanguages());
        meta.setLimit(limit);
        meta.setOrderBy(orderby);
        meta.setSortOrder(sortOrder == null ? "" : sortOrder);
        meta.setMaintenanceContact(HelpClass.getInstance().getMaintanceContact());
        return meta;
    }

    private String buildURI(HttpServletRequest request) {
        String uri = request.getRequestURI();
        String hostName = request.getLocalName();
        String protocal = request.getProtocol();

        return StringUtils.replace(protocal, "/1.1", "://").toLowerCase() + hostName + uri;
    }
}
