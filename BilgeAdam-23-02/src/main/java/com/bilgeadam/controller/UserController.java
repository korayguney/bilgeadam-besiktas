package com.bilgeadam.controller;

import com.bilgeadam.model.User;
import com.bilgeadam.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;
import java.util.function.Supplier;

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
    public String showSignupForm(User user){
        return "adduser";
    }

    @PostMapping("/adduser")
    public String addUser(@Valid User user, BindingResult result, Model theModel){
        if(result.hasErrors()){
            return "adduser";
        }
        userRepository.save(user);
        return "redirect:/index";
    }

    @GetMapping("/edit/{id}")
    public String showUpdateForm(@PathVariable int id, Model theModel){
       User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user id : " + id));

       theModel.addAttribute("user", user);

       return "updateuser";
    }

    @PostMapping("/update/{id}")
    public String updateUser(@PathVariable int id, @Valid User user, BindingResult result, Model theModel){
        if(result.hasErrors()){
            user.setId(id);
            return "updateuser";
        }
        userRepository.save(user);
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String deleteUser(@PathVariable int id){
        User user = userRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid user id : " + id));
        userRepository.delete(user);
        return "redirect:/index";
    }

}
