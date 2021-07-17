package com.softib.dashboardmanager.repository;

import com.softib.dashboardmanager.entities.Account_history;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account_history, Long> {
}
