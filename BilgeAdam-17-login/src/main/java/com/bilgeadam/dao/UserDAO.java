package com.bilgeadam.dao;

import com.bilgeadam.model.User;
import com.bilgeadam.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public boolean isUserOnDB(User user) {

        Connection conn = DBUtils.getConnection();

        try {
            PreparedStatement psmt = conn.prepareStatement("select * from users where username =? and password =?");
            psmt.setString(1, user.getUsername());
            psmt.setString(2, user.getPassword());

            ResultSet rs = psmt.executeQuery();

            while (rs.next()) {
                return true;
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (!conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return false;

    }
}
