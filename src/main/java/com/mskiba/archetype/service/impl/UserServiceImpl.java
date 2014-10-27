package com.mskiba.archetype.service.impl;

import com.mskiba.archetype.dao.GenericDAO;
import com.mskiba.archetype.dao.UserDAO;
import com.mskiba.archetype.model.User;
import com.mskiba.archetype.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl extends GenericServiceImpl<User> implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public GenericDAO<User> getBaseDAO() {
        return userDAO;
    }
}