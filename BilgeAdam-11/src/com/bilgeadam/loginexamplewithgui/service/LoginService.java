package com.bilgeadam.loginexamplewithgui.service;

import com.bilgeadam.loginexamplewithgui.model.LoginModel;
import com.bilgeadam.sqlinjection.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginService {
    public boolean check_login_credentials_on_db(LoginModel login) {
        Connection connection = DBUtils.getConnection("bilgeadam_db", "root", "1234");
        ResultSet rs = null;
        PreparedStatement psmt = null;
        try {
            psmt = connection.prepareStatement("SELECT * FROM login WHERE username = ? AND password = ?");
            psmt.setString(1, login.getUsername());
            psmt.setString(2, login.getPassword());
            rs = psmt.executeQuery();
            while (rs.next()){
                return true;
            }
            return false;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                rs.close();
                psmt.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }

        return false;
    }
}
