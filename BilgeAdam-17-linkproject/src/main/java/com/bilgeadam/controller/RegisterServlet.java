package com.bilgeadam.controller;

import com.bilgeadam.dao.UserDAO;
import com.bilgeadam.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password1 = req.getParameter("password1");
        String password2 = req.getParameter("password2");

        try{
            if (username.isEmpty() || password1.isEmpty() || password2.isEmpty()) {
                req.setAttribute("error1", "All fields must be filled");
                req.getRequestDispatcher("register.jsp").forward(req, resp);
            } else if (!password1.equals(password2)) {
                req.setAttribute("error1", "Your passwords are not match");
                req.getRequestDispatcher("register.jsp").forward(req, resp);
            } else {
                boolean result = new UserDAO().checkUserIsExistsOnDatabase(username);

                if (result) {
                    req.setAttribute("error1", "There is a user with same username");
                    req.getRequestDispatcher("register.jsp").forward(req, resp);
                } else {
                    User user = new User(username, password1);
                    int saveResult = new UserDAO().saveUser(user);
                    if (saveResult > 0) {
                        req.setAttribute("success", "User is successfully saved");
                        req.getRequestDispatcher("register.jsp").forward(req, resp);
                    } else {
                        req.setAttribute("error1", "There is a problem during saving");
                        req.getRequestDispatcher("register.jsp").forward(req, resp);
                    }

                }
            }
        } catch (NullPointerException e) {
            System.out.println("Inside catch block...");
            req.setAttribute("error1", "You have to fill all fields");
            req.getRequestDispatcher("register.jsp").forward(req, resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
