package com.mskiba.archetype.service;

import com.mskiba.archetype.dao.UserDAO;
import com.mskiba.archetype.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Service
@Transactional
public class UserService {

    @Autowired
    private UserDAO userDAO;

    public void saveUser(User user) throws Exception {
        userDAO.save(user);
    }
}
