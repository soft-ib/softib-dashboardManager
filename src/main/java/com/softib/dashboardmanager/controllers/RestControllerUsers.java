package com.softib.dashboardmanager.controllers;

import com.softib.dashboardmanager.entities.User_History;
import com.softib.dashboardmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RestControllerUsers {

    @Autowired
    private UserService userService;

    @GetMapping("/users")
    public List<User_History> getAllUsers(){
        return userService.getAllUsers();
    }

    @PostMapping("/addUser")
    private void saveUser(@RequestBody User_History user)
    {
        userService.addUser(user);
    }
}
