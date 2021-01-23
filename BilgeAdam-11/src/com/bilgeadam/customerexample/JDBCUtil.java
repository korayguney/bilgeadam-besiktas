package com.bilgeadam.customerexample;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCUtil {

    public static List<Customer> getCustomerList() {

        Connection connection = null;
        Statement stmt = null;
        List<Customer> customerList = new ArrayList<>();
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
                customerList.add(new Customer(rs.getInt("id"), rs.getString("name"), rs.getString("address"),
                        rs.getInt("age"), rs.getDouble("salary")));
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

        return customerList;

    }
}
