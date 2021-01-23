package com.bilgeadam.jdbc;

import java.sql.*;

public class JDBCExample5 {

    public static void main(String[] args) throws SQLException {

        // Autocloseable example
        try (
                Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bilgeadam_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                "root","1234");
                Statement stmt = connection.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM customer2 ORDER BY name");
                ){

            // process on result
            while (rs.next()){
                System.out.printf("ID :%d , Name : %s , Address : %s\n", rs.getInt("id"),
                                                    rs.getString("name"), rs.getString("address"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

    }
}
