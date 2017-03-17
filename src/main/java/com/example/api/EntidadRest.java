package com.example.api;

import com.example.model.Entidad;
import com.example.service.EntidadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import java.util.List;

/**
 * Created by dzuniga on 17/03/2017.
 */
@Component
@Path("/entidad")
public class EntidadRest {
    @Autowired
    @Qualifier(value = "entidadService")
    private EntidadService entidadService;

    @GET
    @Path("/")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Entidad> list() {
        return entidadService.list();
    }

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Entidad id(@PathParam("id") Long id) {
        return entidadService.id(id);
    }
}
