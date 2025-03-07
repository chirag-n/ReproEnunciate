package com.ex.api.v1;

import com.webcohesion.enunciate.metadata.rs.ResourceGroup;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

/**
 * User management API
 */
@Path("/users")
@ResourceGroup("User Management")
public class UserResource {

    /**
     * Fetches a list of users
     * @return List of usernames
     */
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> getUsers() {
        List<String> users = new ArrayList<>();
        users.add("Alice");
        users.add("Bob");
        users.add("Charlie");
        return users;
    }

    /**
     * Gets a specific user
     * @param id User ID
     * @return User name
     */
    @GET
    @Path("/{id}")
    @Produces(MediaType.TEXT_PLAIN)
    public String getUserById(@PathParam("id") int id) {
        String[] users = {"Alice", "Bob", "Charlie"};
        if (id >= 0 && id < users.length) {
            return users[id];
        } else {
            throw new WebApplicationException("User not found", 404);
        }
    }
}
