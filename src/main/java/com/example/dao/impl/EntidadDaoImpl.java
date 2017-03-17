package com.example.dao.impl;

import com.example.dao.EntidadDao;
import com.example.model.Entidad;
import org.springframework.stereotype.Repository;

/**
 * Created by dzuniga on 17/03/2017.
 */
@Repository(value = "entidadDao")
public class EntidadDaoImpl extends GenericDaoImpl implements EntidadDao {
    public EntidadDaoImpl() {
        super(Entidad.class);
    }
}
