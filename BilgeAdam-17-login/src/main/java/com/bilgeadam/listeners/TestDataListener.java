package com.bilgeadam.listeners;

import com.bilgeadam.utils.DBUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import java.sql.*;

@WebListener
public class TestDataListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        Connection conn = null;

        try {
            conn = DBUtils.getConnection();
            Statement stmt = conn.createStatement();

            ResultSet rs = stmt.executeQuery("SELECT COUNT(*) AS usercount FROM users");
            rs.next();
            int result = rs.getInt("usercount");

            if(result == 0){
                stmt.execute("insert into users(username,password) values ('Koray','1234')");
                stmt.execute("insert into users(username,password) values ('Furkan','1234')");
                stmt.execute("insert into users(username,password) values ('Sefa','1234')");
                stmt.execute("insert into users(username,password) values ('Kaan','1234')");
                stmt.execute("insert into users(username,password) values ('Oguzhan','1234')");
            }


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if(!conn.isClosed()){
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }


    }
}
