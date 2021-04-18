package com.bilgeadam;

import com.bilgeadam.util.IntializerRunner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Bilgeadam2302Application implements ApplicationRunner, CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(Bilgeadam2302Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Bilgeadam2302Application.class, args);
    }

    @Value("${application.developer.name}")
    private String developerName;

    @Value("${application.developer.email}")
    private String developerEmail;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("Developer of the application is {} and email : {}", developerName, developerEmail);
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Inside CommandLineRunner run method...");
    }
}
