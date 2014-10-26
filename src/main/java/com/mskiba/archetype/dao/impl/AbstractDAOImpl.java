package com.mskiba.archetype.dao.impl;

import com.mskiba.archetype.dao.AbstractDAO;
import com.mskiba.archetype.model.AbstractModel;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;


public abstract class AbstractDAOImpl<T extends AbstractModel> implements AbstractDAO<T> {

    private Class<T> type;

    @Autowired
    private SessionFactory sessionFactory;

    public AbstractDAOImpl() {
        Type t = getClass().getGenericSuperclass();
        ParameterizedType pt = (ParameterizedType) t;
        type = (Class) pt.getActualTypeArguments()[0];
    }

    @Override
    public T getById(int id) {
        return (T) sessionFactory.getCurrentSession().get(type, id);
    }

    @Override
    public void save(T entity) {
        sessionFactory.getCurrentSession().save(entity);
    }

    @Override
    public void update(T entity) {
        sessionFactory.getCurrentSession().update(entity);
    }

    @Override
    public void delete(T entity) {
        sessionFactory.getCurrentSession().delete(entity);
    }
}