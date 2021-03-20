package com.bilgeadam.controller;

import com.bilgeadam.dao.LinkDAO;
import com.bilgeadam.models.UserLink;
import com.bilgeadam.utils.RegexUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("secure/postlink")
public class PostLinkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String title = req.getParameter("title");
        String url = req.getParameter("url");

        if (title.isEmpty() || url.isEmpty()) {
            req.setAttribute("error2", "All fields must be filled");
            req.getRequestDispatcher("postlink.jsp").forward(req, resp);
        } else {
            boolean regexResult = RegexUtil.IsUrlMatch(url);
            boolean result = new LinkDAO().isURLonDB(url);

            if (!regexResult) {
                req.setAttribute("error2", "URL doesn't match pattern standarts");
                req.getRequestDispatcher("postlink.jsp").forward(req, resp);
            } else if (result) {
                req.setAttribute("error2", "There is same URL on DB");
                req.getRequestDispatcher("postlink.jsp").forward(req, resp);
            } else {
                UserLink userLink = new UserLink();
                userLink.setTitle(title);
                userLink.setPostedlink(url);
                userLink.setUsername(req.getSession().getAttribute("username").toString());
                int res = new LinkDAO().saveLink(userLink);

                if (res > 0) {
                    req.setAttribute("success", "Link is saved");
                    req.getRequestDispatcher("postlink.jsp").forward(req, resp);
                } else {
                    req.setAttribute("error2", "Error during save to DB");
                    req.getRequestDispatcher("postlink.jsp").forward(req, resp);
                }
            }
        }
    }
}
