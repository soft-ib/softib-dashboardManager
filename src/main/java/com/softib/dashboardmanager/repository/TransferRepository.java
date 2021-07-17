package com.softib.dashboardmanager.repository;

import com.softib.dashboardmanager.entities.Transfer_History;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer_History, Long> {
}
