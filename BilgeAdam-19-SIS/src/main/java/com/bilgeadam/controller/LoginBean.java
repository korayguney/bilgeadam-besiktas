package com.bilgeadam.controller;

import com.sun.org.glassfish.gmbal.ManagedData;

import javax.faces.bean.ManagedBean;

@ManagedBean(name = "login")
public class LoginBean {
    private String email;
    private String password;

    public void checkUser(){
        System.out.println("User checked...");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
