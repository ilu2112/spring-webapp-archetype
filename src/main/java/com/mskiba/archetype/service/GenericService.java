package com.mskiba.archetype.service;

import com.mskiba.archetype.dao.GenericDAO;
import com.mskiba.archetype.model.AbstractModel;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


public interface GenericService<T extends AbstractModel> {
    GenericDAO<T> getBaseDAO();

    T getById(Long id);

    void save(T entity);

    void update(T entity);

    void delete(T entity);
}