package com.mskiba.archetype.service;

import com.mskiba.archetype.model.User;

import javax.transaction.Transactional;

public interface UserService extends AbstractService<User> {

    @Transactional
    void saveUser(User user);
}