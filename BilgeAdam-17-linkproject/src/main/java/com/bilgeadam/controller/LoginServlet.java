package com.bilgeadam.controller;

import com.bilgeadam.dao.UserDAO;
import com.bilgeadam.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        String captcha = req.getParameter("captcha");

        if (captcha != null && !req.getSession().getAttribute("capt").equals(captcha)) {
            req.setAttribute("error", "Captcha does not match!");
            req.getRequestDispatcher("/index").forward(req, resp);
        } else {

            User user = new User(username, password);

            if (username.isEmpty() || password.isEmpty()) {
                req.setAttribute("error", "You have to fill all login sections");
                req.getRequestDispatcher("/index").forward(req, resp);
            } else {
                boolean result = new UserDAO().isUserOnDB(user);
                if (result) {
                    req.getSession(false).setAttribute("username", username);
                    req.getRequestDispatcher("/index").forward(req, resp);
                } else {
                    req.setAttribute("error", "There is no such an user on DB");
                    req.getRequestDispatcher("/index").forward(req, resp);
                }
            }
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
