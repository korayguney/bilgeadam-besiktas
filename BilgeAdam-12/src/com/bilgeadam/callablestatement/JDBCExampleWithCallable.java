package com.bilgeadam.callablestatement;

import java.sql.*;

public class JDBCExampleWithCallable {

    public static void main(String[] args) {

        Connection connection = null;
        CallableStatement csmt = null;
        ResultSet rs = null;

        try {
            //create connection
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/world?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC",
                    "root","1234");

            //create statement
            csmt = connection.prepareCall("{CALL getCityWithName2(?)}");
            csmt.setString(1,"Ankara");
            //execute query
            rs = csmt.executeQuery();

            // process on result
            while (rs.next()){
                System.out.println(rs.getString("Name") + "'s population is " + rs.getInt("population"));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            // close connections
            try {
                rs.close();
                csmt.close();
                connection.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
