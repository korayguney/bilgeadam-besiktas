package com.bilgeadam.controller;

import com.bilgeadam.model.User;
import com.bilgeadam.service.UserService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "register")
public class RegisterBean {
    private User user;
    private String password2;
    private List<SelectItem> roleList;

    @EJB
    private UserService userService;


    @PostConstruct
    public void init(){
        user = new User();
        roleList = new ArrayList<>();
        User.Role[] roleArr = User.Role.values();

        for (User.Role role : roleArr) {
            roleList.add(new SelectItem(role));
        }
        /*
        roleList.add(new SelectItem("ADMIN"));
        roleList.add(new SelectItem("STUDENT"));
        roleList.add(new SelectItem("INSTRUCTOR"));
         */
    }

    public String registerUser(){

        if(!user.getPassword().equals(password2)){
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR,"Register error",
                    "  Passwords are not match!"));
        } else {
            userService.registerUserToDatabase(user);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Register success",
                    "  User saved to database!"));
        }

        return "register";
    }


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword2() {
        return password2;
    }

    public void setPassword2(String password2) {
        this.password2 = password2;
    }

    public List<SelectItem> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SelectItem> roleList) {
        this.roleList = roleList;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }
}
