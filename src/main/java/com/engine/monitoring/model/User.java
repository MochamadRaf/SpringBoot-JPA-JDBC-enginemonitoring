package com.engine.monitoring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users ")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "username")
    private String username;

    @Column(name = "name")
    private Integer name;

    @Column(name = "password")
    private String password;

    public User(String username, Integer name, String username1, String encryptedpassword) {
    }

    public User(Integer id, String username, Integer name, String password) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.password = password;
    }

    public User() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getName() {
        return name;
    }

    public void setName(Integer name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(String username, Integer name, String password) {
          this.username = username;
        this.name = name;
        this.password = password;
    }

    public User(String username, Integer name, String signupDtoUsername, Integer encryptedpassword) {
    }
}
