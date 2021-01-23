package com.bilgeadam.loginexample;

import com.bilgeadam.sqlinjection.DBUtils;

import java.sql.*;

public class JDBCUtils {
   public static boolean isUserOnDb(String username, String password) throws SQLException {

        Connection connection = null;
        PreparedStatement psmt = null;

            //create connection
            connection = DBUtils.getConnection("bilgeadam_db","root", "1234");

            //prepare query
            String query = "SELECT * FROM login WHERE username = ? AND password >= ?";

            //create preparedstatement
            psmt = connection.prepareStatement(query);
            psmt.setString(1,username);
            psmt.setString(2, password);

            ResultSet rs = psmt.executeQuery();

            // process on result
            boolean result = rs.next()?true:false;

            psmt.close();
            connection.close();

            return result;

        }

}
