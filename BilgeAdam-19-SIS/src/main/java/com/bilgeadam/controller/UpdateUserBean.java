package com.bilgeadam.controller;

import com.bilgeadam.model.User;
import com.bilgeadam.service.UserService;

import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@SessionScoped
public class UpdateUserBean {
    private User user;
    private List<SelectItem> roleList;

    @EJB
    private UserService userService;

    @PostConstruct
    public void init(){
        roleList = new ArrayList<>();
        User.Role[] roleArr = User.Role.values();

        for (User.Role role : roleArr) {
            roleList.add(new SelectItem(role));
        }

        HttpServletRequest req = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
        int userId = Integer.valueOf(req.getParameter("userId"));
        user = userService.findUser(userId);
    }

    public String updateUser(){
        userService.updateUser(this.user);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,"Update success",
                "  User updated on database!"));
        return "updateuser";
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public List<SelectItem> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<SelectItem> roleList) {
        this.roleList = roleList;
    }
}
