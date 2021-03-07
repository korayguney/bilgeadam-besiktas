package com.bilgeadam.dao;

import com.bilgeadam.models.UserLink;
import com.bilgeadam.utils.DBUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LinkDAO {
    public List<UserLink> getAllLinks() {
        List<UserLink> arr = new ArrayList<>();

        Connection conn = DBUtils.getConnection();
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement("SELECT * FROM user_links ORDER BY viewcount DESC");

            ResultSet rs = psmt.executeQuery();

            while (rs.next()){
                arr.add(new UserLink(
                        rs.getString("username"),
                        rs.getString("postedlink"),
                        rs.getString("title"),
                        rs.getDate("postdate"),
                        rs.getInt("viewcount")
                ));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (!conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return arr;
    }

    public List<UserLink> getSearchedLinks(String searchedtext) {
        List<UserLink> arr = new ArrayList<>();

        Connection conn = DBUtils.getConnection();
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement("SELECT * FROM user_links WHERE postedlink LIKE '%" + searchedtext +"%' ORDER BY viewcount DESC");

            ResultSet rs = psmt.executeQuery();

            while (rs.next()){
                arr.add(new UserLink(
                        rs.getString("username"),
                        rs.getString("postedlink"),
                        rs.getString("title"),
                        rs.getDate("postdate"),
                        rs.getInt("viewcount")
                ));
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            try {
                if (!conn.isClosed()) {
                    conn.close();
                }
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return arr;



    }
}
