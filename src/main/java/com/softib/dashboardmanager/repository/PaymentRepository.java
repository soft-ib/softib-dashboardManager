package com.softib.dashboardmanager.repository;

import com.softib.dashboardmanager.entities.Payment_History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PaymentRepository extends JpaRepository<Payment_History, Long> {
}
