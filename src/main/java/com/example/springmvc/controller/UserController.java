package com.example.springmvc.controller;

import com.example.springmvc.repository.UserRepository;
import com.example.springmvc.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class UserController {
    @GetMapping("/addUser")
    public String addUser(Model model) {
        model.addAttribute("user", new User());
        return "addUser";
    }

    @PostMapping("/addUser")
    public String submit(@ModelAttribute("user") User user) {
        List<User> users = UserRepository.getUserList();
        users.add(user);
        return "addUser";
    }

    @GetMapping("/table")
    public String check(Model model) {
        List<User> users = UserRepository.getUserList();
        model.addAttribute("users", users);
        return "table";
    }
}
