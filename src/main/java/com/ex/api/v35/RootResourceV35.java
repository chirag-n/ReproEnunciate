
package com.ex.api.v35;

import com.ex.api.v34.RootResourceV34;
import com.webcohesion.enunciate.metadata.rs.ResourceGroup;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
@ResourceGroup("RootResource")
public interface RootResourceV35 extends RootResourceV34 {

    /**
     * Simple GET request that returns "Hello, World!"
     */
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    String sayHello();
}
