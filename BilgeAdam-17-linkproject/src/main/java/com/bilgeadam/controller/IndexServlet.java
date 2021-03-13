package com.bilgeadam.controller;

import com.bilgeadam.dao.LinkDAO;
import com.bilgeadam.models.UserLink;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@WebServlet("/index")
public class IndexServlet extends HttpServlet {
    private static int wrongLoginAttempt = 0;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        if(req.getAttribute("wrongloginattemptzero") == null){
            calculateWrongLoginAttempts(req);
        } else {
            wrongLoginAttempt = 0;
            calculateWrongLoginAttempts(req);
        }

        List<UserLink> links = new LinkDAO().getAllLinks();
        req.setAttribute("links", links);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    private void calculateWrongLoginAttempts(HttpServletRequest req) {
        String ipAddr = req.getRemoteAddr();
        Map<String,Integer> wrongLoginMap = new HashMap<>();
        wrongLoginMap.put(ipAddr, wrongLoginAttempt);

        if(req.getAttribute("error") != null && wrongLoginMap.get(ipAddr) < 3){
            wrongLoginMap.put(ipAddr, wrongLoginAttempt++);
        } else if(req.getAttribute("error") != null && wrongLoginMap.get(ipAddr) == 3){
            req.getSession().setAttribute("wronglogin", true);
            req.setAttribute("error", "You have to fill captcha");
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
