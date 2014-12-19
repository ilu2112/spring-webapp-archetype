package com.mskiba.archetype.service.impl;

import com.mskiba.archetype.model.AbstractModel;
import com.mskiba.archetype.service.GenericService;
import org.springframework.transaction.annotation.Transactional;


public abstract class GenericServiceImpl<T extends AbstractModel> implements GenericService<T> {

    @Transactional
    public T getById(Long id) {
        return getBaseDAO().getById(id);
    }

    @Transactional
    public void save(T entity) {
        getBaseDAO().save(entity);
    }

    @Transactional
    public void update(T entity) {
        getBaseDAO().update(entity);
    }

    @Transactional
    public void delete(T entity) {
        getBaseDAO().delete(entity);
    }
}