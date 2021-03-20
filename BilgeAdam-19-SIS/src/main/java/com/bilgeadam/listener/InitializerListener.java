package com.bilgeadam.listener;

import com.bilgeadam.service.InitializerService;

import javax.ejb.EJB;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class InitializerListener implements ServletContextListener {

    @EJB
    InitializerService initializerService;

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        initializerService.saveTestUserAndCourseData();
    }
}
