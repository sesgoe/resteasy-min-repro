package com.sesgoe;

import io.quarkus.runtime.StartupEvent;
import org.eclipse.microprofile.rest.client.inject.RestClient;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.event.Observes;
import jakarta.inject.Inject;
import jakarta.ws.rs.core.Response;

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
