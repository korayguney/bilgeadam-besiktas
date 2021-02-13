package com.bilgeadam.jpa3.controller;

import com.bilgeadam.jpa3.exception.ExceptionCode;
import com.bilgeadam.jpa3.model.RegisterModel;
import com.bilgeadam.jpa3.model.ResponseModel;
import com.bilgeadam.jpa3.service.RegisterService;

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
           model = new RegisterService().checkUsernameIsExistOrNotOnDB(registerModel);
           if(model.isResult()){
               return new RegisterService().saveUserToDB(registerModel);
           } else {
               return model;
           }
       } else {
           return model;
       }
    }
}
