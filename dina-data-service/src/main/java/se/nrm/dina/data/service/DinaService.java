/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.service;
    
import java.security.Principal;
import java.util.ArrayList;
import java.util.Arrays; 
import java.util.List;   
import java.util.Map; 
import javax.ejb.EJB; 
import javax.ejb.Stateless; 
import javax.servlet.http.HttpServletRequest;  
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces; 
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.apache.commons.lang.StringUtils;  
import org.keycloak.KeycloakPrincipal;
import org.keycloak.KeycloakSecurityContext; 
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.nrm.dina.data.exceptions.DinaConstraintViolationException;
import se.nrm.dina.data.exceptions.DinaException;  
import se.nrm.dina.data.service.metadata.Metadata;
import se.nrm.dina.data.service.vo.EntityWrapper; 
import se.nrm.dina.data.service.vo.MetadataBean;
import se.nrm.dina.datamodel.EntityBean;
import se.nrm.dina.logic.DinaDataLogic;
 
/**
 *
 * @author idali
 */
@Path("/v0")
@Consumes({MediaType.APPLICATION_JSON+";charset=UTF-8"})
@Produces({MediaType.APPLICATION_JSON + ";charset=UTF-8"})
@Stateless
public class DinaService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @EJB
    private DinaDataLogic logic;
 

    public DinaService() {

    }
    
    public DinaService(DinaDataLogic logic) {
        this.logic = logic;
    }
    
    @GET
    @Path("{entity}") 
    public Response getAllByEntityName (@Context HttpServletRequest req,
                                        @PathParam("entity") String entity, 
                                        @DefaultValue("50") @QueryParam("offset") int offset, 
                                        @DefaultValue("50") @QueryParam("limit") int limit, 
                                        @DefaultValue("0") @QueryParam("minid") int minid,
                                        @DefaultValue("0") @QueryParam("maxid") int maxid,
                                        @DefaultValue("asc") @QueryParam("sort") String sort,
                                        @QueryParam("orderby") String orderby) {
        
        logger.info("getAllByEntityName : {} -- {}", entity, offset + " -- " + limit); 
         
        List<String> order = new ArrayList();
        if(orderby != null) {
            order = Arrays.asList(StringUtils.split(orderby, ","));
        }
      
        try {   
            List<EntityBean> results = logic.findAll(entity, offset, limit, minid, maxid, sort, order );
            Metadata metadata = new Metadata(); 
            MetadataBean meta = metadata.buildMetadata(req, entity, results.size(), limit, order, sort); 
            EntityWrapper wrapper = new EntityWrapper(meta,  results); 
            
            return Response.ok(wrapper).build();
        } catch(DinaException e) {
            return Response.status(e.getErrorCode()) 
                    .entity(e.getMessage()).build();
        }
    }

    @GET
    @Path("{entity}/search")
    public Response getData(@Context HttpServletRequest req, @PathParam("entity") String entity, @Context UriInfo info) {

        MultivaluedMap<String, String> map = info.getQueryParameters();
        String offset = map.getFirst("offset");
        String limit = map.getFirst("limit");
        String minid = map.getFirst("minid");
        String maxid = map.getFirst("maxid");
        String orderBy = map.getFirst("orderby");
        String sort = map.getFirst("sort");
        String exact = map.getFirst("exact");
        
        List<String> orderby = new ArrayList<>();
        if (orderBy != null) {
            orderby = Arrays.asList(orderBy.split(","));
        }

        try {
            List<EntityBean> results = logic.findAllBySearchCriteria(entity, map);
            
            Metadata metadata = new Metadata(); 
//            MetadataBean meta =metadata.buildMetadata(req, entity, results.size(), limit, orderby, sort);
            
            
//            MetadataBean meta = metadata.buildMetadata(req, entity, results.size(), limit, orderby, sort);  
//            EntityWrapper wrapper = new EntityWrapper(meta, results);

//            return Response.ok(wrapper).build();
            return null;
        } catch (DinaException e) {
            return Response.status(e.getErrorCode())
                    .entity(e.getMessage()).build();
        }
    } 
        
    /**
     * Generic method to get an entity by entity id from database.  
     * This method passes in a PathParam entity class name and entity id 
     *  
     * @param req
     * @param entity - class name of the entity
     * @param id - entity id
     * 
     * @return entity 
     */
    @GET
    @Path("{entity}/{id}/") 
    public Response getEntityById(@Context HttpServletRequest req,
                                  @PathParam("entity") String entity, 
                                  @PathParam("id") String id) {
        
        logger.info("getEntityById - entity: {}, id :  {}", entity, id); 
          
        String pathInfo = req.getPathInfo(); 
        String version = StringUtils.substringBetween(pathInfo, "/v", "/" + entity);
      
        try {     
            return Response.ok(logic.findById(id, entity)).build(); 
        } catch (DinaException e) {
            return Response.status(e.getErrorCode()).entity(e.getMessage()).build();
        }
    }
    


    /**
     * Generic method to get an entity by entity id from database. This method
     * passes in a PathParam entity class name and entity id
     *
     * @param req
     * @param entity - class name of the entity
     * @param ids
     * 
     * @return entity 
     */
    @GET
    @Path("{entity}/search/{ids}/") 
    public Response getEntityByIds(@Context HttpServletRequest req,
                                    @PathParam("entity") String entity, @PathParam("ids") String ids) {
        
        logger.info("getEntityByIds - entity: {}, id :  {}", entity, ids);
    
        String pathInfo = req.getPathInfo(); 
        String version = StringUtils.substringBetween(pathInfo, "/v", "/" + entity);
         
        try {      
            return Response.ok(logic.findEntitiesByids(entity, ids)).build(); 
        } catch (DinaException e) {
            return Response.status(e.getErrorCode()) 
                    .entity(e.getMessage()).build();
        }
    }
    
    
//    @GET
//    @Path("{entity}/{field}") 
//    public Response getEntitiesBySearchQuery(@PathParam("entity") String entity, @PathParam("field") String field, @Context UriInfo info) {
//        logger.info("getEntitiesBySearchQuery - entity: {}, field :  {}", entity, field);
//        
//        MultivaluedMap<String, String> map = info.getQueryParameters();
//        logic.findBysearchQuery(entity, field, map);
//        
//        return Response.ok().build();
//    }


    /**
     * Generic method to get an entity by entity id from database.  
     * This method passes in a PathParam entity class name and entity id 
     * 
     * @param entity - class name of the entity 
     * 
     * @return entity 
     */
    @GET
    @Path("{entity}/count")  
    public Response getEntityCount(@PathParam("entity") String entity ) {
        
        logger.info("getEntityById - entity: {} ", entity );

        try {  
            int count = logic.findEntityCount(entity); 
              
            return Response.ok(String.valueOf(count)).build(); 
        } catch(DinaException e) { 
            return Response.status(e.getErrorCode()) 
                    .entity(e.getMessage()).build();
        }  
    } 

    /**
     * Generic method to create an entity by passing SpecifyBeanWrapper, the
     * entity to be created is wrapped into SpecifyBeanWrapper
     *
     * @param headers
     * @param req
     * @param entity
     * @param json 
     * @return  Response
     *
     */
    @POST
    @Path("{entity}")
    @Consumes("application/json")
    public Response createNewEntity(@Context HttpHeaders headers,
                                    @Context HttpServletRequest req,
                                    @PathParam("entity") String entity, String json) {
        logger.info("createNewEntity - entity: {}", json);
  
        try {  
            int agentId = getAgentIdToken(req);
            
            return Response.ok(logic.createEntity(entity, json, agentId)).build();
         } catch(DinaConstraintViolationException e) {   
            return Response.status(e.getErrorCode()) 
                    .entity(e.getErrorBeans()).build();
        }  
    }
    
    
         

    private int getAgentIdToken(HttpServletRequest req) {
        
        Principal userPrincipal = req.getUserPrincipal();  
        if (userPrincipal instanceof KeycloakPrincipal) { 
            KeycloakPrincipal<KeycloakSecurityContext> kp = (KeycloakPrincipal<KeycloakSecurityContext>) userPrincipal;
            Map<String, Object> map = kp.getKeycloakSecurityContext().getToken().getOtherClaims();
            
            try {
                String strId = (String)map.get("agentId"); 
                return Integer.parseInt(strId); 
            } catch(NumberFormatException e) {
                throw new DinaException("Wrong agent id", 400); 
            } 
        } else {
            throw new RuntimeException();
        } 
    }
    
    

    /**
     * Generic method update an entity
     * 
     * @param entity
     * @param json 
     *
     * @return
     *
     */
    @PUT
    @Path("{entity}") 
    public Response updateEntity(@PathParam("entity") String entity, String json) {
    
        logger.info("update entity: {} -- {}", entity, json);
        
         try {  
            return Response.ok(logic.updateEntity(entity, json)).build(); 
         } catch(DinaException e) { 
            return Response.status(e.getErrorCode()) 
                    .entity(e.getMessage()).build();
        }  
    }
      
    /**
     * Generic method to delete an entity by entity id from database.  
     * This method passes in a PathParam entity class name and entity id 
     * 
     * @param entity - class name of the entity 
     * @param id 
     * 
     * @return entity 
     */
    @DELETE
    @Path("{entity}/{id}")  
    public Response deleteEntityById(@PathParam("entity") String entity, @PathParam("id") int id) {
        
        logger.info("deleteEntityById - entity -- id: {} -- {}", entity, id );

        try {   
            logic.deleteEntity(entity, id);  
            return Response.ok().build();  
        } catch(DinaException e) { 
            logger.error("not ok");
            return Response.status(e.getErrorCode()) 
                    .entity(e.getMessage()).build();
        }  
    } 
}
