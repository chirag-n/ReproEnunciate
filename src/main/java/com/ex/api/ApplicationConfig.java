package com.ex.api;

import jakarta.ws.rs.ApplicationPath;
import jakarta.ws.rs.core.Application;

/**
 * Registers the JAX-RS application at "/api"
 */
@ApplicationPath("/api/")
public class ApplicationConfig extends Application {
    // No implementation needed; JAX-RS will auto-discover the resources.
}
