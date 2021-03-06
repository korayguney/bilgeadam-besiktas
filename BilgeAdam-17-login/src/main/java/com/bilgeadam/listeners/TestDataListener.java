package com.bilgeadam.listeners;

import com.bilgeadam.utils.DBUtils;
import com.bilgeadam.utils.HashAlgorithm;
import com.bilgeadam.utils.SecurityUtils;

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
                stmt.execute("insert into users(username,password) values ('Koray','" + SecurityUtils.hassPassword("1234", HashAlgorithm.SHA1)+"')");
                stmt.execute("insert into users(username,password) values ('Furkan','" + SecurityUtils.hassPassword("12345", HashAlgorithm.SHA1)+"')");
                stmt.execute("insert into users(username,password) values ('Oguzhan','" + SecurityUtils.hassPassword("12341", HashAlgorithm.SHA1)+"')");
                stmt.execute("insert into users(username,password) values ('Sefa','" + SecurityUtils.hassPassword("12340", HashAlgorithm.SHA1)+"')");
                stmt.execute("insert into users(username,password) values ('Kaan','" + SecurityUtils.hassPassword("1234", HashAlgorithm.SHA1)+"')");

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
