package com.example.config;

import com.example.api.CatalogoSistemaRest;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;
import javax.annotation.PostConstruct;

/**
 * Created by dzuniga on 15/03/2017.
 */
@Configuration
public class JerseyConfig extends ResourceConfig{
    public JerseyConfig(){
        packages(true, "com.example.api");
    }
}
