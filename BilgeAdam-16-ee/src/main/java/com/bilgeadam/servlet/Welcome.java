package com.bilgeadam.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/welcome")
public class Welcome extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstname = req.getParameter("fname");
        String lastname = req.getParameter("lname");


        HttpSession session = req.getSession();
        session.setAttribute("username",firstname);
        session.setMaxInactiveInterval(20*60); // open for 20 minutes


        resp.sendRedirect("index.jsp");

        //resp.getWriter().append("Welcome " + firstname + " " + lastname);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
