package com.softib.dashboardmanager.service.Impl;

import com.softib.dashboardmanager.entities.Payment_History;
import com.softib.dashboardmanager.repository.AccountRepository;
import com.softib.dashboardmanager.repository.PaymentRepository;
import com.softib.dashboardmanager.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentRepository paymentRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Payment_History> getAllPayments() {
        return paymentRepository.findAll();
    }

    @Override
    public void addPayment(Payment_History payment, Long idAccount) {
        payment.setAccount(accountRepository.getOne(idAccount));
        paymentRepository.save(payment);
    }
}
