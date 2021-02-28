package com.bilgeadam.calculator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/calculator")
public class CalculatorServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        double firstdigit = Double.valueOf(req.getParameter("firstdigit"));
        double seconddigit = Double.valueOf(req.getParameter("seconddigit"));
        double result = 0;
        String mark = null;
        //String operation = req.getParameter("operations");
        String operation = req.getParameter("flexRadioDefault");

        switch (operation) {
            case "multiply":
                result = firstdigit * seconddigit;
                mark = "*";
                break;
            case "sum":
                result = firstdigit + seconddigit;
                mark = "+";
                break;
            case "subtract":
                result = firstdigit - seconddigit;
                mark = "-";
                break;
            case "divide":
                result = firstdigit / seconddigit;
                mark = "/";
                break;
            default:
                break;
        }
        
        resp.getWriter().append(firstdigit + " " + mark + " " + seconddigit + " = " + result);
        
        
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
