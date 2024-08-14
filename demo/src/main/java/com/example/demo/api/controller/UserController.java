package com.example.demo.api.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.api.model.User;
import com.example.demo.services.UserService;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    public UserController(UserService u){
        this.userService = u;
    }
    
    @GetMapping("/user")
    public User getUser(@RequestParam int id){
        Optional<User> user = userService.getUser(id);

        return (User) user.orElse(null);

    }
}
