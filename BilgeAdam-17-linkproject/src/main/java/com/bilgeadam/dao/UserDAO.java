package com.bilgeadam.dao;

import com.bilgeadam.models.User;
import com.bilgeadam.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {

    public boolean isUserOnDB(User user) {
        Connection conn = DBUtils.getConnection();
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
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


    public boolean checkUserIsExistsOnDatabase(String username) {
        Connection conn = DBUtils.getConnection();
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement("SELECT * FROM users WHERE username=?");
            psmt.setString(1, username);

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

    public int saveUser(User user) {
        Connection conn = DBUtils.getConnection();
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement("INSERT INTO users VALUES (?,?)");
            psmt.setString(1, user.getUsername());
            psmt.setString(2, user.getPassword());
            int result = psmt.executeUpdate();

            return result;
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

        return 0;
    }
}
