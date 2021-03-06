package com.example.dao;

import java.io.Serializable;
import java.util.List;

/**
 * Created by dzuniga on 17/03/2017.
 */
public interface GenericDao<T extends Serializable, PK extends Serializable> {
    public T save(T t);

    public T findById(PK id);

    public List<T> findAll(T t);
}
