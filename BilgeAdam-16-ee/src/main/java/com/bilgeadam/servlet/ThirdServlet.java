package com.bilgeadam.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/third")
public class ThirdServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("INSIDE ThirdServlet ...");

        String developer = (String)req.getAttribute("developer");
        String company = (String)req.getAttribute("company");

        String email = getServletContext().getInitParameter("email");

        resp.getWriter().append("<h1>Welcome to Third Servlet</h1>");
        resp.getWriter().append("<hr/>");
        resp.getWriter().append("&copy;"+ " Developed by "+ developer + " for " + company);
        resp.getWriter().append("<br>You can access to developer from " + email);

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
