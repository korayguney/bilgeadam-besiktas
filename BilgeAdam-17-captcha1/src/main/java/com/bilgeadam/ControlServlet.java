package com.bilgeadam;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/control")
public class ControlServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String generatedCaptcha = req.getSession().getAttribute("oldCapt").toString();
        String sentCaptcha =  req.getParameter("captcha");

        System.out.println("generatedCaptcha : " + generatedCaptcha);
        System.out.println("sentCaptcha : " + sentCaptcha);

        if(generatedCaptcha.equals(sentCaptcha)){
            req.getRequestDispatcher("allowed.jsp").forward(req,resp);
        } else {
            req.getRequestDispatcher("notallowed.jsp").forward(req,resp);
        }

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
