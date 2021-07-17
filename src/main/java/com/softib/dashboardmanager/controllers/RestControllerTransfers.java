package com.softib.dashboardmanager.controllers;

import com.softib.dashboardmanager.entities.Transfer_History;
import com.softib.dashboardmanager.entities.User_History;
import com.softib.dashboardmanager.service.TransferService;
import com.softib.dashboardmanager.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RestControllerTransfers {

    @Autowired
    private TransferService transferService;

    @GetMapping("/transfer")
    public List<Transfer_History> getAllTransfers(){
        return transferService.getAllTransfers();
    }

    @PostMapping("/account/{accountId}/addTransfer")
    private void saveTransfer(@PathVariable(value = "accountId") Long accountId,@Valid @RequestBody Transfer_History transfer)
    {
        transferService.addTransfer(transfer,accountId);
    }
}
