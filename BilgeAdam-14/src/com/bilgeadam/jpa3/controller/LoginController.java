package com.bilgeadam.jpa3.controller;

import com.bilgeadam.jpa3.exception.ExceptionCode;
import com.bilgeadam.jpa3.model.LoginModel;
import com.bilgeadam.jpa3.model.ResponseModel;
import com.bilgeadam.jpa3.service.LoginService;

public class LoginController {


    public ResponseModel control_login_credentials(LoginModel login) { //throws UsernameOrPasswordIsNullException {
        if(login.getUsername().length() < 1 || login.getPassword().length() < 1){
            // throw new UsernameOrPasswordIsNullException("You have to enter all credentials");
            return new ResponseModel(false, ExceptionCode.USERNAME_OR_PASSWORD_NULL);
        } else {
            return new LoginService().check_login_credentials_on_db(login);
        }
    }
}
