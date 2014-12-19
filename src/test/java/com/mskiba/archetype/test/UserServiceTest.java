package com.mskiba.archetype.test;

import com.mskiba.archetype.model.User;
import com.mskiba.archetype.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:contexts/applicationContext.xml"})
@Transactional
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void createUserTest() {
        User user = new User();
        user.setUsername("Test");
        user.setEmail("test@example.com");
        user.setPassword("test");
        userService.save(user);
        Long id = user.getId();
        User fetchedUser = userService.getById(id);
        assertNotNull(fetchedUser);
        assertEquals(fetchedUser.getUsername(), "Test");
        assertEquals(fetchedUser.getEmail(), "test@example.com");
        assertEquals(fetchedUser.getPassword(), "test");
    }
}