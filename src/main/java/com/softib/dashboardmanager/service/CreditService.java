package com.softib.dashboardmanager.service;

import com.softib.dashboardmanager.entities.Credit_History;

import java.util.List;

public interface CreditService {
    public List<Credit_History> getAllCredits();
    public void addCredit(Credit_History Credit, Long idAccount);
}
