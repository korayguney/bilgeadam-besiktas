package com.bilgeadam.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample3 {

    public static void main(String[] args) {

        Connection connection = null;
        Statement stmt = null;

        try {
            //create connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bilgeadam_db?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root", "1234");

            //create statement
            stmt = connection.createStatement();

            //execute query
            String query = "UPDATE customer5 SET address = 'Kars' WHERE id = 6";
            int affected_row_count = stmt.executeUpdate(query);
            // boolean result = stmt.execute(query);
            // System.out.println(result);

            // process on result

            System.out.println("Affected row count : " + affected_row_count + " ROW");
            System.out.println("Update is OK...");


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
