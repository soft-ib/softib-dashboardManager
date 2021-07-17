package com.softib.dashboardmanager.service;

import com.softib.dashboardmanager.entities.User_History;

import java.util.List;

public interface UserService {
    public List<User_History> getAllUsers();
    public void addUser(User_History user);

}
