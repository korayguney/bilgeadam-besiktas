package com.bilgeadam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
@EnableSwagger2
public class Bilgeadam24ECommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(Bilgeadam24ECommerceApplication.class, args);
    }

    @Bean
    public BCryptPasswordEncoder bCryptPasswordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
