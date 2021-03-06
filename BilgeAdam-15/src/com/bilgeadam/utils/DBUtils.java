package com.bilgeadam.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtils {

    public static Connection getConnection(String database_name, String username, String password) {

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

    public static Connection getConnection() {
        Properties prop = new Properties();

        try {
            prop.load(new FileInputStream("D:\\BilgeAdam\\BEŞİKTAŞ-GRUP\\db.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        String server_name = prop.getProperty("server");
        String port = prop.getProperty("port");
        String database_name = prop.getProperty("database");
        String username = prop.getProperty("user");
        String password = prop.getProperty("password");

        String url = String.format("jdbc:mysql://%s:%s/", server_name, port);
        String timezone = "?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";

        Connection conn = null;
        try {
            conn = DriverManager.getConnection(url + database_name + timezone, username, password);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;

    }


}
