package com.bilgeadam.loginexamplewithgui.service;

import com.bilgeadam.loginexamplewithgui.exception.ExceptionCode;
import com.bilgeadam.loginexamplewithgui.model.LoginModel;
import com.bilgeadam.loginexamplewithgui.model.ResponseModel;
import com.bilgeadam.loginexamplewithgui.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {
    public ResponseModel check_login_credentials_on_db(LoginModel login) {
        //Connection connection = DBUtils.getConnection("bilgeadam_db", "root", "1234");
        Connection connection = DBUtils.getConnection();
        ResultSet rs = null;
        PreparedStatement psmt = null;
        try {
            psmt = connection.prepareStatement("SELECT * FROM login WHERE username = ? AND password = ?");
            psmt.setString(1, login.getUsername());
            psmt.setString(2, login.getPassword());
            rs = psmt.executeQuery();
            while (rs.next()){
                return new ResponseModel(true, null);
            }
            return new ResponseModel(false, ExceptionCode.USER_IS_NOT_FOUND_ON_DB);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return new ResponseModel(false, ExceptionCode.SQL_EXCEPTION_GENERATED);
        } finally {
            try {
                rs.close();
                psmt.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

    }
}
