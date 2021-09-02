package com.bilgeadam.bilgeadam23.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.time.LocalDateTime;
import java.util.Date;

@Controller
public class DemoController {
    @GetMapping("/hello")
    public String sayHello(Model theModel){
        theModel.addAttribute("theDate", LocalDateTime.now());
        return "helloworld";
    }

}
