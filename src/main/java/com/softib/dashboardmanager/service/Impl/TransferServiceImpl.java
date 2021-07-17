package com.softib.dashboardmanager.service.Impl;

import com.softib.dashboardmanager.entities.Transfer_History;
import com.softib.dashboardmanager.repository.AccountRepository;
import com.softib.dashboardmanager.repository.TransferRepository;
import com.softib.dashboardmanager.service.AccountService;
import com.softib.dashboardmanager.service.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class TransferServiceImpl implements TransferService {

    @Autowired
    private TransferRepository transferRepository;

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public List<Transfer_History> getAllTransfers() {
        return transferRepository.findAll();
    }

    @Override
    public void addTransfer(Transfer_History transfer, Long idAccount) {
        transfer.setAccount(accountRepository.getOne(idAccount));
        transferRepository.save(transfer);

    }
}
