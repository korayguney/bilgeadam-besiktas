package com.bilgeadam.controller;

import com.bilgeadam.model.User;
import com.bilgeadam.service.LoginService;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.FacesContext;

@ManagedBean(name = "login")
public class LoginBean {
    private String email;
    private String password;
    private User user;

    @EJB
    LoginService loginService;

    @ManagedProperty("#{sessionScopeBean}")
    SessionScopeBean sessionScopeBean;

    public String checkUser(){
        boolean result = loginService.checkUserOnDB(email, password);

        if(result){
            user = loginService.getUser(email, password);
            sessionScopeBean.setUser(user);
            return "main_operation";
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_WARN,"Login error",
                    "Email or Password is wrong!"));
            return "login";
        }

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

    public LoginService getLoginService() {
        return loginService;
    }

    public void setLoginService(LoginService loginService) {
        this.loginService = loginService;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public SessionScopeBean getSessionScopeBean() {
        return sessionScopeBean;
    }

    public void setSessionScopeBean(SessionScopeBean sessionScopeBean) {
        this.sessionScopeBean = sessionScopeBean;
    }
}
