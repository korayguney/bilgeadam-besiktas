package com.bilgeadam.sqlinjection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtils {

    public static Connection getConnection(String database_name, String username, String password){

        String url = "jdbc:mysql://localhost:3306/";
        String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url + database_name + timezone, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        return connection;

    }


}
