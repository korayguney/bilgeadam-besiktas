package com.bilgeadam.sqlinjection;

import java.sql.*;
import java.util.Scanner;

public class SqlInjectionExample {

    public static void main(String[] args) {

        Connection connection = null;
        Statement stmt = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Write address of customer : ");
        String input = scanner.nextLine();
        PreparedStatement psmt = null;
        try {
            //create connection
            connection = DBUtils.getConnection("bilgeadam_db","root", "1234");

            //create statement
            //stmt = connection.createStatement();
            psmt = connection.prepareStatement("SELECT * FROM customer2 WHERE address = ?");
            psmt.setString(1,input);
            //execute query
            //String query = "SELECT * FROM customer2 WHERE address = '" + input + "'";
            //ResultSet rs = stmt.executeQuery(query);
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
