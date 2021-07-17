package com.softib.dashboardmanager.repository;

import com.softib.dashboardmanager.entities.Credit_History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CreditRepository extends JpaRepository<Credit_History, Long> {
}
