package com.mskiba.archetype.dao;

import com.mskiba.archetype.model.AbstractModel;

public interface AbstractDAO<T extends AbstractModel> {
    T getById(int id);

    void save(T entity);

    void update(T entity);

    void delete(T entity);
}
