
package com.ex.api.v55;

import com.ex.api.v54.RootResourceV54;
import com.webcohesion.enunciate.metadata.rs.ResourceGroup;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
@ResourceGroup("RootResource")
public interface RootResourceV55 extends RootResourceV54 {

    /**
     * Simple GET request that returns "Hello, World!"
     */
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    String sayHello();
}
