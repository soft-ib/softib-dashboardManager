package com.softib.dashboardmanager.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Transfer_History {
    private static final long serialVersionUID = 3152690779535828408L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idTransfer;

    private float amount;
    private Date date;

    public Transfer_History(float amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Account_history account;

    public Transfer_History() {
    }

    public Transfer_History(float amount, Date date, Account_history account) {
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public Transfer_History(Long idTransfer, float amount, Date date, Account_history account) {
        this.idTransfer = idTransfer;
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public Long getIdTransfer() {
        return idTransfer;
    }

    public void setIdTransfer(Long idTransfer) {
        this.idTransfer = idTransfer;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Account_history getAccount() {
        return account;
    }

    public void setAccount(Account_history account) {
        this.account = account;
    }

    @Override
    public String toString() {
        return "Transfer_History{" +
                "idTransfer=" + idTransfer +
                ", amount=" + amount +
                ", date=" + date +
                ", account=" + account +
                '}';
    }
}
