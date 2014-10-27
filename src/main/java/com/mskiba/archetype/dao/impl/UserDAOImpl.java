package com.mskiba.archetype.dao.impl;

import com.mskiba.archetype.dao.UserDAO;
import com.mskiba.archetype.model.User;
import org.springframework.stereotype.Repository;


@Repository
public class UserDAOImpl extends GenericDAOImpl<User> implements UserDAO {
}