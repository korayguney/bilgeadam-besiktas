package com.bilgeadam.loginexamplewithgui.controller;

import com.bilgeadam.loginexamplewithgui.exception.ExceptionCode;
import com.bilgeadam.loginexamplewithgui.model.RegisterModel;
import com.bilgeadam.loginexamplewithgui.model.ResponseModel;
import com.bilgeadam.loginexamplewithgui.service.RegisterService;

import javax.swing.*;

public class RegisterController {
    private ResponseModel checkPasswordsAreEqual(RegisterModel registerModel) {
        if (!registerModel.getPassword().equals(registerModel.getPassword2())) {
            JOptionPane.showMessageDialog(null, "Passwords are mismatch", "WARNING", JOptionPane.WARNING_MESSAGE);
            return new ResponseModel(false, ExceptionCode.PASSWORDS_ARE_MISMATCHED);
        }
        return new ResponseModel(true,null);
    }

    public ResponseModel signUpNewUser(RegisterModel registerModel) {
       ResponseModel model = checkPasswordsAreEqual(registerModel);
       if(model.isResult()){
           if(registerModel.getUsername().length() < 1 || registerModel.getPassword().length() < 1){
               return new ResponseModel(false, ExceptionCode.USERNAME_OR_PASSWORD_NULL);
           }
           return new RegisterService().saveUserToDB(registerModel);
       } else {
           return model;
       }
    }
}
