package com.mskiba.archetype.service.impl;

import com.mskiba.archetype.model.AbstractModel;
import com.mskiba.archetype.service.AbstractService;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public abstract class AbstractServiceImpl<T extends AbstractModel> implements AbstractService<T> {

    private Class<T> type;

    public AbstractServiceImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

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