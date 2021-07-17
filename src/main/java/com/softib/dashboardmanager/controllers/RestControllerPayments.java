package com.softib.dashboardmanager.controllers;

import com.softib.dashboardmanager.entities.Payment_History;
import com.softib.dashboardmanager.entities.Transfer_History;
import com.softib.dashboardmanager.service.PaymentService;
import com.softib.dashboardmanager.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class RestControllerPayments {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment")
    public List<Payment_History> getAllPayments(){
        return paymentService.getAllPayments();
    }

    @PostMapping("/account/{accountId}/addPayment")
    private void savePayment(@PathVariable(value = "accountId") Long accountId,@Valid @RequestBody Payment_History payment)
    {
        paymentService.addPayment(payment,accountId);
    }
}
