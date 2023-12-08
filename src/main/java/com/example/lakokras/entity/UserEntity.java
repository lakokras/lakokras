package com.example.lakokras.entity;

import org.springframework.boot.autoconfigure.domain.EntityScan;


@EntityScan
public class UserEntity {
    private long id;
    private String username;
    private String password;

    public UserEntity(long id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public void setId(long id) {
        this.id = id;
    }
    public long getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }
    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
    }
}
