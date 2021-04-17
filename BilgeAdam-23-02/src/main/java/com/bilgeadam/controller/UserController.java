package com.bilgeadam.controller;

import com.bilgeadam.model.User;
import com.bilgeadam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.validation.Valid;

@Controller
public class UserController {

    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/index")
    public String showUserList(Model theModel){
        theModel.addAttribute("users",userRepository.findAll());
        return "index";
    }

    @GetMapping("/signup")
    public String showUSignupForm(){
        return "adduser";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid User user, BindingResult result, Model theModel){
        if(result.hasErrors()){
            return "adduser";
        }
        theModel.addAttribute("user",user);
        userRepository.save(user);
        return "redirect:/index";
    }
}
