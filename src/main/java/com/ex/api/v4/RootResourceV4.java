
package com.ex.api.v4;

import com.ex.api.v3.RootResourceV3;
import com.webcohesion.enunciate.metadata.rs.ResourceGroup;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("")
@ResourceGroup("RootResource")
public interface RootResourceV4 extends RootResourceV3 {

    /**
     * Simple GET request that returns "Hello, World!"
     */
    @GET
    @Path("/hello")
    @Produces(MediaType.TEXT_PLAIN)
    String sayHello();
}
