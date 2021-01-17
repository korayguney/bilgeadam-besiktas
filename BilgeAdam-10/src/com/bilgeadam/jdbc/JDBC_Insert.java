package com.bilgeadam.jdbc;

import java.sql.*;

public class JDBC_Insert {

    public static void main(String[] args) {

        try {
            // create connection
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bilgeadam_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root", "1234");

            // create statement
            Statement stmt = conn.createStatement();

            // execute query
            int affected_row_count = stmt.executeUpdate("INSERT INTO customer(name,age,address) VALUES ('Sefa',26,'Istanbul'); ");

            if(affected_row_count > 0) {
                System.out.println("The record inserted");
            }

            // close connections
            stmt.close();
            conn.close();

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }


    }


}
