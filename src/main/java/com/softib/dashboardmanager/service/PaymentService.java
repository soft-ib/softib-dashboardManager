package com.softib.dashboardmanager.service;

import com.softib.dashboardmanager.entities.Payment_History;

import java.util.List;

public interface PaymentService {
    public List<Payment_History> getAllPayments();
    public void addPayment(Payment_History payment, Long idAccount);
}
