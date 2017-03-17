package com.example.service;

import com.example.dao.EntidadDao;
import com.example.model.CatalogoSistema;
import com.example.model.Entidad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by dzuniga on 17/03/2017.
 */
@Service
@Transactional(readOnly = true)
public class EntidadService {
    @Autowired
    @Qualifier(value = "entidadDao")
    private EntidadDao entidadDao;

    public List<Entidad> list() {
        Entidad entidad = new Entidad();
        return (List<Entidad>) entidadDao.findAll(entidad);
    }

    public Entidad id(Long id) {
        return (Entidad) entidadDao.findById(id);
    }
}
