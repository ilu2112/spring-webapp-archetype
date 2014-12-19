package com.mskiba.archetype.dao;

import com.mskiba.archetype.model.AbstractModel;


public interface GenericDAO<T extends AbstractModel> {
    T getById(Long id);

    void save(T entity);

    void update(T entity);

    void delete(T entity);
}