package com.mskiba.archetype.service;

import com.mskiba.archetype.dao.GenericDAO;
import com.mskiba.archetype.model.AbstractModel;
import org.springframework.transaction.annotation.Transactional;


public interface GenericService<T extends AbstractModel> {
    GenericDAO<T> getBaseDAO();

    @Transactional
    T getById(int id);

    @Transactional
    void save(T entity);

    @Transactional
    void update(T entity);

    @Transactional
    void delete(T entity);
}