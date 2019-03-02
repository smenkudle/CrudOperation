package org.crud.domain;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User implements Serializable {
    static final long serialVersionUID= 1L;
    private String username;

    public User(String username) {
        this.username= username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }


}
