package com.softib.dashboardmanager.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Payment_History {
    private static final long serialVersionUID = 3152690779535828408L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idPayment;

    private float amount;
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Account_history account;

    public Payment_History() {
    }

    public Payment_History(float amount, Date date, Account_history account) {
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public Payment_History(Long idPayment, float amount, Date date, Account_history account) {
        this.idPayment = idPayment;
        this.amount = amount;
        this.date = date;
        this.account = account;
    }

    public Payment_History(float amount, Date date) {
        this.amount = amount;
        this.date = date;
    }

    public Long getIdPayment() {
        return idPayment;
    }

    public void setIdPayment(Long idPayment) {
        this.idPayment = idPayment;
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
        return "Payment_History{" +
                "idPayment=" + idPayment +
                ", amount=" + amount +
                ", date=" + date +
                ", account=" + account +
                '}';
    }
}
