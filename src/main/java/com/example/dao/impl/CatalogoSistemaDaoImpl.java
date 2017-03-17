package com.example.dao.impl;

import com.example.dao.CatalogoSistemaDao;
import com.example.model.CatalogoSistema;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.lang.reflect.ParameterizedType;
import java.util.List;

/**
 * Created by dzuniga on 16/03/2017.
 */
@Repository(value = "catalogoSistemaDao")
public class CatalogoSistemaDaoImpl extends GenericDaoImpl implements CatalogoSistemaDao{
    public CatalogoSistemaDaoImpl() {
        super(CatalogoSistema.class);
    }
    /*@Autowired
    private SessionFactory sessionFactory;

    private Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }*/
}
