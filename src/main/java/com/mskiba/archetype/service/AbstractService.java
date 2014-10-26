package com.mskiba.archetype.service;

import com.mskiba.archetype.dao.AbstractDAO;
import com.mskiba.archetype.model.AbstractModel;
import org.springframework.transaction.annotation.Transactional;

public interface AbstractService<T extends AbstractModel> {
    AbstractDAO<T> getBaseDAO();

    @Transactional
    T getById(int id);

    @Transactional
    void save(T entity);

    @Transactional
    void update(T entity);

    @Transactional
    void delete(T entity);
}