package com.softib.dashboardmanager.controllers;

import com.softib.dashboardmanager.entities.Credit_History;
import com.softib.dashboardmanager.entities.Transfer_History;
import com.softib.dashboardmanager.service.CreditService;
import com.softib.dashboardmanager.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RestControllerCredits {

    @Autowired
    private CreditService creditService;

    @GetMapping("/credit")
    public List<Credit_History> getAllCredits(){
        return creditService.getAllCredits();
    }

    @PostMapping("/account/{accountId}/addCredit")
    private void saveCredit(@PathVariable(value = "accountId") Long accountId,@Valid @RequestBody Credit_History credit)
    {
        creditService.addCredit(credit,accountId);
    }
}
