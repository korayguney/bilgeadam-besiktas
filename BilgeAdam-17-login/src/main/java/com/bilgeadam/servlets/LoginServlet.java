package com.bilgeadam.servlets;

import com.bilgeadam.dao.UserDAO;
import com.bilgeadam.model.User;

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
        String password = req.getParameter("pass");

        User user  = new User(username, password);

        boolean result = new UserDAO().isUserOnDB(user);

        if(result){
            resp.getWriter().append("Welcome " + username);
        } else {
            resp.sendRedirect("index.html");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
