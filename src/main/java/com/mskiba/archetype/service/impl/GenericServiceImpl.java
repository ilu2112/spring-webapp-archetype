package com.mskiba.archetype.service.impl;

import com.mskiba.archetype.model.AbstractModel;
import com.mskiba.archetype.service.GenericService;


public abstract class GenericServiceImpl<T extends AbstractModel> implements GenericService<T> {

    public T getById(int id) {
        return getBaseDAO().getById(id);
    }

    public void save(T entity) {
        getBaseDAO().save(entity);
    }

    public void update(T entity) {
        getBaseDAO().update(entity);
    }

    public void delete(T entity) {
        getBaseDAO().delete(entity);
    }
}