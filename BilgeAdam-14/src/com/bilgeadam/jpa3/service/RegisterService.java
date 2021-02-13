package com.bilgeadam.jpa3.service;

import com.bilgeadam.jpa3.exception.ExceptionCode;
import com.bilgeadam.jpa3.model.RegisterModel;
import com.bilgeadam.jpa3.model.ResponseModel;
import com.bilgeadam.jpa3.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class RegisterService {

    public ResponseModel saveUserToDB(RegisterModel registerModel) {
        //Connection connection = DBUtils.getConnection("bilgeadam_db", "root", "1234");
        Connection connection = DBUtils.getConnection();
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

    public ResponseModel checkUsernameIsExistOrNotOnDB(RegisterModel registerModel) {
       // Connection connection = DBUtils.getConnection("bilgeadam_db", "root", "1234");
        Connection connection = DBUtils.getConnection();
        ResultSet rs = null;
        PreparedStatement psmt = null;
        try {
            psmt = connection.prepareStatement("SELECT * FROM login WHERE username = ?");
            psmt.setString(1, registerModel.getUsername());
            rs = psmt.executeQuery();
            while (rs.next()){
                return new ResponseModel(false, ExceptionCode.USERNAME_IS_ALREADY_REGISTERED);
            }
            return new ResponseModel(true, null);
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
