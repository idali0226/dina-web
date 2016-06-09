/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package se.nrm.dina.keycloak.admin;

import java.io.IOException;
import java.util.Arrays;
import static java.util.Arrays.asList;
import java.util.List;
import javax.ws.rs.core.Response;
import org.jboss.resteasy.client.jaxrs.ResteasyClient;
import org.jboss.resteasy.client.jaxrs.ResteasyClientBuilder;
import org.jboss.resteasy.client.jaxrs.ResteasyWebTarget;
import org.keycloak.admin.client.Keycloak;
import org.keycloak.admin.client.KeycloakBuilder;
import org.keycloak.admin.client.resource.RealmResource;
import org.keycloak.admin.client.resource.RealmsResource;
import org.keycloak.admin.client.resource.UserResource;
import org.keycloak.admin.client.resource.UsersResource;
import org.keycloak.representations.idm.CredentialRepresentation;
import org.keycloak.representations.idm.RealmRepresentation;
import org.keycloak.representations.idm.RoleRepresentation;
import org.keycloak.representations.idm.UserRepresentation;

/**
 *
 * @author ida
 */
public class RealmClass {

    private static final String MASTER_REALM = "master";
    private static final String DINA_REALM = "dina";

    private static final String MASTER_ADMIN_USERNAME = "admin";
    private static final String MASTER_ADMIN_PASSWORD = "dina";

    private static final String MASTER_AUTH_CLIENT_ID = "security-admin-console";
    private static final String URL = "https://beta-sso.dina-web.net/auth";

    private static Keycloak kc;

    public static void main(String[] args) throws IOException {

        kc = KeycloakBuilder.builder()
                .serverUrl("https://beta-sso.dina-web.net/auth") //
                .realm("master")//
                .username("admin") //
                .password("dina") //
                .clientId("admin-cli") // 
                .resteasyClient(new ResteasyClientBuilder().connectionPoolSize(10).build()) //
                .build();

        RealmResource realmsResource = kc.realm("dina");
        RealmRepresentation rp = realmsResource.toRepresentation();
        String id = rp.getId();
        System.out.println("Id => " + id);

        UsersResource userResources = kc.realm(DINA_REALM).users();
        int userCount = userResources.count();
        System.out.println("user count => " + userCount);
         
        CredentialRepresentation credential = new CredentialRepresentation();
        credential.setType(CredentialRepresentation.PASSWORD);
        credential.setValue("test123");
        credential.setTemporary(false);

        UserRepresentation user = new UserRepresentation();
        user.setUsername("testuser");
        user.setFirstName("Test");
        user.setLastName("User");
        user.setCredentials(asList(credential));
        user.setEnabled(true);
        user.setRealmRoles(asList("tester"));
 
        userResources.create(user);

            
//          
//        RealmResource realmResource = kc.realm(DINA_REALM);
//        UsersResource usersResource = realmResource.users();
//        UserResource userResource = usersResource.get("admin");
         
//        userResource.remove();

        
//        kc = KeycloakBuilder.builder() 
//				.serverUrl("https://beta-sso.dina-web.net/auth") //
//				.realm("rest-example")//
//				.username("rest-user-admin") //
//				.password("password") //
//				.clientId("admin-cli") //
//				.resteasyClient(new ResteasyClientBuilder().connectionPoolSize(10).build()) //
//				.build();
//        
//        UsersResource resources = kc.realm(DINA_REALM).users();
//       
//        CredentialRepresentation credential = new CredentialRepresentation();
//        credential.setType(CredentialRepresentation.PASSWORD);
//        credential.setValue("test123");
//        credential.setTemporary(false);
//
//        UserRepresentation user = new UserRepresentation();
//        user.setUsername("testuser");
//        user.setFirstName("Test");
//        user.setLastName("User");
//        user.setCredentials(asList(credential));
//        user.setEnabled(true);
//        user.setRealmRoles(asList("admin"));
//        
//        System.out.println("count : " + resources);
//        
//        resources.create(user);

//		CredentialRepresentation credential = new CredentialRepresentation();
//		credential.setType(CredentialRepresentation.PASSWORD);
//		credential.setValue("test123");
//		credential.setTemporary(false);
//
//		UserRepresentation user = new UserRepresentation();
//		user.setUsername("testuser");
//		user.setFirstName("Test");
//		user.setLastName("User");
//		user.setCredentials(asList(credential));
//		user.setEnabled(true);
//		user.setRealmRoles(asList("admin"));
//
//		// Create testuser
//		Response result = kc.realm("dina").users().create(user);
//		if (result.getStatus() != 201) {
//			System.err.println("Couldn't create user.");
//			System.exit(0);
//		}
//		System.out.println("Testuser created.... verify in keycloak!");
//
//		System.out.println("Press any key...");
//		System.in.read();
//
//		// Delete testuser
//		String locationHeader = result.getHeaderString("Location");
//		String userId = locationHeader.replaceAll(".*/(.*)$", "$1");
//		kc.realm("dina").users().get(userId).remove();
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
//        kc = Keycloak.getInstance(
//                URL,
//                MASTER_REALM, // the realm to log in to
//                MASTER_ADMIN_USERNAME, MASTER_ADMIN_PASSWORD, // the user
//                MASTER_AUTH_CLIENT_ID);
//
////        RealmsResource realms = kc.realms();
////        List<RealmRepresentation> rps = realms.findAll();
////        rps.stream()
////                .forEach(rp -> {
////                    String displayName = rp.getDisplayName();
////                    System.out.println("displayName => " + displayName);
////                });
//
//        CredentialRepresentation credential = new CredentialRepresentation();
//        credential.setType(CredentialRepresentation.PASSWORD);
//        credential.setValue("test123");
//        UserRepresentation user = new UserRepresentation();
//        user.setUsername("testuser");
//        user.setFirstName("Test");
//        user.setLastName("User");
//        user.setCredentials(Arrays.asList(credential));
//        kc.realm("dina").users().create(user);


        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//        RoleRepresentation rr = new RoleRepresentation();
//        rr.setName("admin");
//        rr.setScopeParamRequired(false);
        
//        kc.realm(DINA_REALM).roles().create(rr);
         

    }

}
