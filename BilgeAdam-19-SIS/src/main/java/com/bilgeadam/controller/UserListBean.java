package com.bilgeadam.controller;

import com.bilgeadam.model.User;
import com.bilgeadam.service.UserService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import java.util.List;

@ManagedBean
public class UserListBean {

    private List<User> userList;

    @EJB
    private UserService userService;

    @PostConstruct
    public void init(){
        userList = userService.getAllUsers();
    }

    public String deleteUser(User user){
        userService.deleteUser(user);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Delete success",
                "  User deleted from database!"));
        return "userlist?faces-redirect=true";
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
