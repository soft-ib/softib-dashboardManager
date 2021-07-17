package com.softib.dashboardmanager.controllers;

import com.softib.dashboardmanager.entities.Account_history;
import com.softib.dashboardmanager.entities.Transfer_History;
import com.softib.dashboardmanager.service.AccountService;
import com.softib.dashboardmanager.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RestControllerAccounts {

    @Autowired
    private AccountService accountService;

    @GetMapping("/account")
    public List<Account_history> getAllAccounts(){
        return accountService.getAllAccounts();
    }

    @PostMapping("/user/{userId}/addAccount")
    private void saveAccount(@PathVariable(value = "userId") Long userId,@Valid @RequestBody Account_history account)
    {
        accountService.addAccount(account,userId);
    }
}
