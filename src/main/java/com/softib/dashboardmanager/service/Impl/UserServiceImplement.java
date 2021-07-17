package com.softib.dashboardmanager.service.Impl;

import com.softib.dashboardmanager.entities.User_History;
import com.softib.dashboardmanager.repository.UserRepository;
import com.softib.dashboardmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserServiceImplement implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User_History> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public void addUser(User_History user) {
        userRepository.save(user);
    }
}
