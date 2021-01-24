package com.bilgeadam.loginexamplewithgui.controller;

import com.bilgeadam.loginexamplewithgui.exception.UsernameOrPasswordIsNullException;
import com.bilgeadam.loginexamplewithgui.model.LoginModel;
import com.bilgeadam.loginexamplewithgui.service.LoginService;

public class LoginController {


    public boolean control_login_credentials(LoginModel login) throws UsernameOrPasswordIsNullException {
        if(login.getUsername().length() < 1 || login.getPassword().length() < 1){
            throw new UsernameOrPasswordIsNullException("You have to enter all credentials");
        } else {
            return new LoginService().check_login_credentials_on_db(login);
        }
    }
}
