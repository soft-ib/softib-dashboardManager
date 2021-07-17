package com.softib.dashboardmanager.service;

import com.softib.dashboardmanager.entities.Account_history;

import java.util.List;

public interface AccountService {
    public List<Account_history> getAllAccounts();
    public void addAccount(Account_history Account, Long idUser);
}
