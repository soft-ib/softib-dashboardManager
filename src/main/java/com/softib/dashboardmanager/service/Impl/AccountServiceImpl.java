package com.softib.dashboardmanager.service.Impl;

import com.softib.dashboardmanager.entities.Account_history;
import com.softib.dashboardmanager.repository.AccountRepository;
import com.softib.dashboardmanager.repository.UserRepository;
import com.softib.dashboardmanager.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Account_history> getAllAccounts() {
        return accountRepository.findAll();
    }

    @Override
    public void addAccount(Account_history account, Long idUser) {
        account.setUser(userRepository.getOne(idUser));
        accountRepository.save(account);

    }
}
