package com.bilgeadam.loginexamplewithgui.controller;

import com.bilgeadam.loginexamplewithgui.model.LoginModel;
import com.bilgeadam.loginexamplewithgui.service.LoginService;

public class LoginController {


    public boolean control_login_credentials(LoginModel login) {
        if(login.getUsername() == null || login.getPassword() == null){
            return false;
        } else {
            return new LoginService().check_login_credentials_on_db(login);
        }
    }
}
