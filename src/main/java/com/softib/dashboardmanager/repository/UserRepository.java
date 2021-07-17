package com.softib.dashboardmanager.repository;

import com.softib.dashboardmanager.entities.User_History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User_History, Long> {
}
