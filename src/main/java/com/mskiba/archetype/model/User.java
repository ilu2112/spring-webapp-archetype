package com.mskiba.archetype.model;

import javax.persistence.Entity;
import javax.persistence.Table;


@Entity
@Table(name = "UM_USERS")
public class User extends AbstractModel {

    private static final long serialVersionUID = -8254517593973860020L;

    private String username;
    private String password;
    private String email;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}