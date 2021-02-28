package com.bilgeadam.listeners;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ContextListener implements ServletContextListener, HttpSessionListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Context is initialized...");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Context is destroyed...");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        System.out.println("A new session is created...");
    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        System.out.println("Session is destroyed...");
    }
}
