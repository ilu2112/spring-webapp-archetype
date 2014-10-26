package com.mskiba.archetype.service.impl;

import com.mskiba.archetype.dao.AbstractDAO;
import com.mskiba.archetype.dao.UserDAO;
import com.mskiba.archetype.model.User;
import com.mskiba.archetype.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserServiceImpl extends AbstractServiceImpl<User> implements UserService {

    @Autowired
    private UserDAO userDAO;

    @Override
    public void saveUser(User user) {
        userDAO.save(user);
    }

    @Override
    public AbstractDAO<User> getBaseDAO() {
        return userDAO;
    }
}