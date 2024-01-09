package com.sesgoe;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.Response;

@RegisterRestClient(configKey = "rest-test")
@ApplicationScoped
public interface AstronautRestClient {

    @GET
    @Produces("application/json")
    Response getAstronautsInSpace();
}
