package com.bilgeadam.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/first")
public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("INSIDE FirstServlet ...");
        System.out.println(req.getParameter("name"));
        if(req.getParameter("name") != null){
            req.setAttribute("developer","Koray Guney");
            req.getRequestDispatcher("second").forward(req,resp);
        } else {
            resp.sendRedirect("unauthorized.html");
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
