package com.bilgeadam.jdbc;

import java.sql.*;

public class JDBCExamplePreparedStatement {
    public static void main(String[] args) {

        Connection connection = null;
        PreparedStatement psmt = null;

        try {
            //create connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bilgeadam_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root","1234");

            //prepare query
            String query = "SELECT * FROM customer2 WHERE id = ? OR salary >= ?";

            //create preparedstatement
            psmt = connection.prepareStatement(query);
            psmt.setInt(1,5);
            psmt.setDouble(2, 7500);

            ResultSet rs = psmt.executeQuery();

            // process on result
            while (rs.next()){
                System.out.printf("ID :%d , Name : %s , Address : %s\n", rs.getInt("id"),
                        rs.getString("name"), rs.getString("address"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // close connections
            try {
                psmt.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }


}
