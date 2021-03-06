package com.bilgeadam;

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpServletRequest;
import java.util.Random;

@WebListener
public class CaptchaListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        System.out.println("INSIDE requestInitialized...");
        String generatedCaptha = null;

        if(((HttpServletRequest)sre.getServletRequest()).getSession().getAttribute("newCapt") == null){
            generatedCaptha = generateRandomStrForCaptcha();
            ((HttpServletRequest)sre.getServletRequest()).getSession().setAttribute("newCapt",generatedCaptha);
        } else {
            String oldCapt = ((HttpServletRequest)sre.getServletRequest()).getSession().getAttribute("newCapt").toString();
            ((HttpServletRequest)sre.getServletRequest()).getSession().setAttribute("oldCapt",oldCapt);
            ((HttpServletRequest)sre.getServletRequest()).getSession().setAttribute("newCapt",generatedCaptha);
        }

    }

    private String generateRandomStrForCaptcha() {

        String chars = "abcdefghijklmnoprstuvyzxqw123456789";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            char c = chars.toCharArray()[random.nextInt(chars.length())];
            stringBuilder.append(c);
        }

        return stringBuilder.toString();

    }
}
