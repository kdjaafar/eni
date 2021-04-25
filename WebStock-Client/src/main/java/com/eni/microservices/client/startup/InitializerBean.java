package com.eni.microservices.client.startup;

import com.eni.microservices.client.entite.*;
import com.eni.microservices.client.service.*;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;

/**
 *
 * @author djafaka
 */

@Startup
@Singleton
public class InitializerBean {

    @Inject
    private ClientService clientService;

    @PostConstruct
    public void init() {

        Client c1 = new Client("Karim", "Djaafar", "kdjaafar@eni.fr");
        Client c2 = new Client("John", "Doe", "jdoe@eni.fr");

        clientService.createClient(c1);
        clientService.createClient(c2);

    }

}