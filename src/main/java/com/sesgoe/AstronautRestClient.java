package com.sesgoe;

import org.eclipse.microprofile.rest.client.inject.RegisterRestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@RegisterRestClient(configKey = "rest-test")
@ApplicationScoped
public interface AstronautRestClient {

    @GET
    @Produces("application/json")
    Response getAstronautsInSpace();
}
