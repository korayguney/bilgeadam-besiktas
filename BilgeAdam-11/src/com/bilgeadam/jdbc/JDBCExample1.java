package com.bilgeadam.jdbc;

import java.sql.*;

public class JDBCExample1 {

    public static void main(String[] args) {

        Connection connection = null;
        Statement stmt = null;

        try {
            //create connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bilgeadam_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root","1234");

            //create statement
            stmt = connection.createStatement();

            //execute query
            String query = "SELECT * FROM customer2";
            ResultSet rs = stmt.executeQuery(query);

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
                stmt.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
