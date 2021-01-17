package com.bilgeadam.jdbc;

import java.sql.*;

public class JDBC_Select {

    public static void main(String[] args) {

        try {
            // create connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bilgeadam_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root", "1234");

            // create statement
            Statement stmt = conn.createStatement();

            // execute query
            ResultSet rs = stmt.executeQuery("SELECT * FROM customer2;");

            // process query result
            while (rs.next()) {
                System.out.println(
                        "ID :" + rs.getInt("id") +
                                ", Name : " + rs.getString("name") +
                                ", Address : " + rs.getString("address")
                );
            }

            // close connections
            stmt.close();
            conn.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }


}
