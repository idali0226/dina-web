/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.data.service;
 
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List; 
import javax.ejb.EJB;
import javax.ejb.Stateless;
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
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import se.nrm.dina.data.exceptions.DinaException; 
import se.nrm.dina.data.logic.DinaDataLogic;     

/**
 *
 * @author idali
 */
@Path("/dina/v0")
@Consumes({MediaType.APPLICATION_JSON+";charset=UTF-8"})
@Produces({MediaType.APPLICATION_JSON+";charset=UTF-8"}) 
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
    public Response getAllByEntityName (@PathParam("entity") String entity, 
                                        @QueryParam("offset") int offset, 
                                        @DefaultValue("50") @QueryParam("limit") int limit, 
                                        @DefaultValue("0") @QueryParam("minid") int minid,
                                        @DefaultValue("0") @QueryParam("maxid") int maxid,
                                        @QueryParam("orderby") String orderby) {
        
        logger.info("getAllByEntityName : {} -- {}", entity, offset + " -- " + limit);   
        logger.info("getAllByEntityName : {} -- {}", minid, maxid);   
        
        List<String> sort = new ArrayList();
        if(orderby != null) {
            sort = Arrays.asList(StringUtils.split(orderby, ","));
        }
      
        try {   
            return Response.ok(logic.findAll(entity, offset, limit, minid, maxid, sort, null)).build();
        } catch(DinaException e) {
            return Response.status(e.getErrorCode()).entity(e.getMessage()).build();
        }   
    }
    
    
    
    @GET
    @Path("{entity}/search")  
    public Response getData(@PathParam("entity") String entity, @Context UriInfo info) {

        MultivaluedMap<String, String> map = info.getQueryParameters();
        logger.info("map : {}", map);

        try {  
            return Response.ok(logic.findAllBySearchCriteria(entity, map)).build();  
        } catch(DinaException e) {
            return Response.status(e.getErrorCode()).entity(e.getMessage()).build();
        }  
    }


    
    
    
    
        
    /**
     * Generic method to get an entity by entity id from database.  
     * This method passes in a PathParam entity class name and entity id 
     * 
     * @param entity - class name of the entity
     * @param id - entity id
     * 
     * @return entity 
     */
    @GET
    @Path("{entity}/{id}/") 
    public Response getEntityById(@PathParam("entity") String entity, @PathParam("id") String id) {
        
        logger.info("getEntityById - entity: {}, id :  {}", entity, id);
   
        try {     
            return Response.ok(logic.findById(id, entity)).build(); 
        } catch (DinaException e) {
            return Response.status(e.getErrorCode()).entity(e.getMessage()).build();
        }
    }


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
              
            Response.ResponseBuilder rb = Response.ok(String.valueOf(count));
            return rb.build(); 
        } catch(DinaException e) { 
            return Response.status(e.getErrorCode()).entity(e.getMessage()).build();
        }  
    }
    
 

    /**
     * Generic method to create an entity by passing SpecifyBeanWrapper, the
     * entity to be created is wrapped into SpecifyBeanWrapper
     *
     * @param entity
     * @param json 
     * @return  Response
     *
     */
    @POST
    @Path("{entity}")
    @Consumes("application/json")
    public Response createNewEntity(@PathParam("entity") String entity, String json) {
        logger.info("createNewEntity - entity: {}", json);
 
        try {  
            return Response.ok(logic.createEntity(entity, json)).build();
         } catch(DinaException e) { 
            return Response.status(e.getErrorCode()).entity(e.getMessage()).build();
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
            return Response.status(e.getErrorCode()).entity(e.getMessage()).build();
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
            logger.info("OK");
            Response.ResponseBuilder rb = Response.ok(); 
            return rb.build(); 
        } catch(DinaException e) { 
            logger.error("not ok");
            return Response.status(e.getErrorCode()).entity(e.getMessage()).build();
        }  
    } 
}
