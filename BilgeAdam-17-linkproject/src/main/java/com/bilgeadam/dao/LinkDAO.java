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

    public boolean isURLonDB(String url) {
        Connection conn = DBUtils.getConnection();
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement("SELECT * FROM user_links WHERE postedlink=?");
            psmt.setString(1, url);

            ResultSet rs = psmt.executeQuery();

            while (rs.next()) {
                return true;
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

        return false;

    }

    public int saveLink(UserLink userLink) {
        Connection conn = DBUtils.getConnection();
        PreparedStatement psmt = null;
        try {
            psmt = conn.prepareStatement("INSERT INTO user_links VALUES (?,?,?,now(),?)");
            psmt.setString(1, userLink.getUsername());
            psmt.setString(2, userLink.getPostedlink());
            psmt.setString(3, userLink.getTitle());
            psmt.setInt(4, 0);

            int affected_row = psmt.executeUpdate();

            return affected_row;

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

        return -1;
    }

    public void incrementViewCount(String linkUrl) {
        Connection conn = DBUtils.getConnection();
        PreparedStatement psmt = null;
        try {

            psmt = conn.prepareStatement("SELECT viewcount FROM user_links WHERE postedlink=?");
            psmt.setString(1, linkUrl);
            ResultSet rs = psmt.executeQuery();
            int count = 0;
            while (rs.next()) {
                count = rs.getInt("viewcount");
            }

            psmt = conn.prepareStatement("UPDATE user_links SET viewcount=? WHERE postedlink=?");
            psmt.setInt(1, count + 1);
            psmt.setString(2, linkUrl);

            psmt.execute();

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
    }
}
