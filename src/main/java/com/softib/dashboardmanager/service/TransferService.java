package com.softib.dashboardmanager.service;

import com.softib.dashboardmanager.entities.Transfer_History;

import java.util.List;

public interface TransferService {
    public List<Transfer_History> getAllTransfers();
    public void addTransfer(Transfer_History Transfer, Long idAccount);
}
