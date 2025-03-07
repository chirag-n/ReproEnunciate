package com.ex.api;

import com.webcohesion.enunciate.metadata.rs.ResourceGroup;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

/**
 * Root API endpoint
 */
@Path("/")
@ResourceGroup("Root API")
public class RootResource {

    /**
     * Health check endpoint
     * @return API status
     */
    @GET
    @Path("/status")
    @Produces(MediaType.TEXT_PLAIN)
    public String getStatus() {
        return "API is running!";
    }
}
