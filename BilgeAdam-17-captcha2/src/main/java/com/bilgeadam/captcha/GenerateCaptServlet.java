package com.bilgeadam.captcha;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

@WebServlet("/gencapt")
public class GenerateCaptServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String chars = "abcdefghijklmnoprstuvyzxqw123456789";
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            char c = chars.toCharArray()[random.nextInt(chars.length())];
            stringBuilder.append(c);
        }

        req.getSession().setAttribute("capt", stringBuilder.toString());

        BufferedImage bufferedImage = new BufferedImage(100,25,BufferedImage.TYPE_INT_RGB);
        Graphics2D pen = (Graphics2D) bufferedImage.getGraphics();
        pen.setColor(Color.RED);
        pen.fillRect(0,0,bufferedImage.getWidth(),bufferedImage.getHeight());

        pen.setColor(Color.BLACK);
        pen.setFont(new Font("Arial", Font.BOLD, 19));
        pen.drawString(stringBuilder.toString(),10,20);

        resp.setContentType("image/jpeg");
        ImageIO.write(bufferedImage, "jpg", resp.getOutputStream());

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
