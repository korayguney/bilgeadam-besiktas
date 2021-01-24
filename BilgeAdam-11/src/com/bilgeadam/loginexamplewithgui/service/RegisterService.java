package com.bilgeadam.loginexamplewithgui.service;

import com.bilgeadam.loginexamplewithgui.exception.ExceptionCode;
import com.bilgeadam.loginexamplewithgui.model.LoginModel;
import com.bilgeadam.loginexamplewithgui.model.RegisterModel;
import com.bilgeadam.loginexamplewithgui.model.ResponseModel;
import com.bilgeadam.sqlinjection.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterService {

    public ResponseModel saveUserToDB(RegisterModel registerModel) {
        Connection connection = DBUtils.getConnection("bilgeadam_db", "root", "1234");
        PreparedStatement psmt = null;
        try {
            psmt = connection.prepareStatement("INSERT INTO login(username,password) VALUES (?,?)");
            psmt.setString(1, registerModel.getUsername());
            psmt.setString(2, registerModel.getPassword());
            int affected_row = psmt.executeUpdate();
            if(affected_row > 0){
                return new ResponseModel(true, null);
            }
            return new ResponseModel(false, ExceptionCode.USER_CANNOT_SAVED);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return new ResponseModel(false, ExceptionCode.SQL_EXCEPTION_GENERATED);
        } finally {
            try {
                psmt.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
