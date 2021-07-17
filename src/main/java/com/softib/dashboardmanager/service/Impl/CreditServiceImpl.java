package com.softib.dashboardmanager.service.Impl;

import com.softib.dashboardmanager.entities.Credit_History;
import com.softib.dashboardmanager.repository.AccountRepository;
import com.softib.dashboardmanager.repository.CreditRepository;
import com.softib.dashboardmanager.service.CreditService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CreditServiceImpl implements CreditService {

    @Autowired
    private CreditRepository creditRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Credit_History> getAllCredits() {
        return creditRepository.findAll();
    }

    @Override
    public void addCredit(Credit_History Credit, Long idAccount ) {
        Credit.setAccount(accountRepository.getOne(idAccount));
        creditRepository.save(Credit);
    }
}
