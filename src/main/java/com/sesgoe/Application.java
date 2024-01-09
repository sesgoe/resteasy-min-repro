package com.sesgoe;

import io.quarkus.runtime.StartupEvent;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.ws.rs.core.Response;

@ApplicationScoped
public class Application {

    @RestClient
    @Inject
    AstronautRestClient astronautRestClient;

    public void init(@Observes StartupEvent startupEvent) {

        System.out.println("Getting astronauts");

        Response astronauts = astronautRestClient.getAstronautsInSpace();

        System.out.println("Got astronauts: " + astronauts.readEntity(String.class));

    }
}
