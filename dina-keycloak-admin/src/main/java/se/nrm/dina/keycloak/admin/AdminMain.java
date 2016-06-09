/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.keycloak.admin;

import java.util.ArrayList;
import static java.util.Arrays.asList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.admin.client.resource.UsersResource;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.RealmRepresentation;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;

/**
 *
 * @author ida
 */
public class AdminMain {
    
    private static final String MASTER_REALM = "master";
    private static final String DINA_REALM = "dina";
    
    private static final String ADMIN_REALM = "admin-cli";

    private static final String MASTER_ADMIN_USERNAME = "admin";
    private static final String MASTER_ADMIN_PASSWORD = "dina";

    private static final String URL = "https://beta-sso.dina-web.net/auth";

    private static Keycloak kc;

    public static void main(String[] args) {

        kc = KeycloakBuilder.builder()
                .serverUrl(URL) //
                .realm(MASTER_REALM)//
                .username(MASTER_ADMIN_USERNAME) //
                .password(MASTER_ADMIN_PASSWORD) //
                .clientId(ADMIN_REALM) // 
                .resteasyClient(new ResteasyClientBuilder().connectionPoolSize(10).build()) //
                .build();
        
//        createClientRole("admin", "dina-rest");
        createUser("test1", "test1");
         
    }
    
    private static void createUser(String userName, String password) {
 
        UsersResource userResources = kc.realm(DINA_REALM).users();
        int userCount = userResources.count();
        System.out.println("user count => " + userCount);
        
        List<String> groups = new ArrayList();
        groups.add("admin");
        groups.add("tester");
         
        Map<String, List<String>> roleMap = new HashMap<>();
        roleMap.put("collections", groups);
        roleMap.put("dina-rest", groups);

        CredentialRepresentation credential = new CredentialRepresentation();
        credential.setType(CredentialRepresentation.PASSWORD);
        credential.setValue(password);
        credential.setTemporary(false);

        UserRepresentation user = new UserRepresentation();
        user.setUsername(userName);
        user.setFirstName("Test");
        user.setLastName("User");
        user.setCredentials(asList(credential));
        user.setEnabled(true);
        user.setRealmRoles(asList("admin"));
        user.setClientRoles(roleMap); 
        
        
        
        Map<String, Object> attributes = new HashMap<>();
        List<String> attList = new ArrayList<>();
        attList.add("20");
        attributes.put("userid", attList);

        List<String> attAgent = new ArrayList();
        attAgent.add("1");
        attributes.put("agentId", attAgent);

        List<String> attSpecify = new ArrayList();
        attSpecify.add("20");
        attributes.put("specifyId", attSpecify);
        user.setAttributes(attributes);
 

        userResources.create(user);
    }


    private static void createClientRole(String roleName, String clientId) {
        RoleRepresentation rr = new RoleRepresentation();
        rr.setName(roleName);
        rr.setScopeParamRequired(false); 
        kc.realm(DINA_REALM).clients().get(clientId).roles().create(rr); 
    }
    
    private static void createRealmRole(String roleName) {
        RoleRepresentation rr = new RoleRepresentation();
        rr.setName(roleName);
        rr.setScopeParamRequired(false);
  
        RealmResource realmsResource = kc.realm(DINA_REALM);
        realmsResource.roles().create(rr);
        
        
        
    }
    
}
