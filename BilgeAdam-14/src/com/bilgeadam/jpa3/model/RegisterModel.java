package com.bilgeadam.jpa3.model;

import java.util.Objects;

// POJO ---> Plain Old Java Object
public class RegisterModel {

    // variables
    private int id;
    private String username;
    private String password;
    private String password2;


    // constructor
    public RegisterModel() {
    }

    public RegisterModel(String username, String password, String password2) {
        this.username = username;
        this.password = password;
        this.password2 = password2;
    }

    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    // override Object class methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegisterModel that = (RegisterModel) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "LoginModel{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

}
