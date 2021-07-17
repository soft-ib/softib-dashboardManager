package com.softib.dashboardmanager.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Credit_History {
    private static final long serialVersionUID = 3152690779535828408L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idCredit;

    private String reason;
    private float amount;
    private float interest_rate;
    private Date payment_date;
    private Date date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "account_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private Account_history account;

    public Credit_History() {
    }

    public Credit_History(String reason, float amount, float interest_rate, Date payment_date, Date date, Account_history account) {
        this.reason = reason;
        this.amount = amount;
        this.interest_rate = interest_rate;
        this.payment_date = payment_date;
        this.date = date;
        this.account = account;
    }

    public Credit_History(Long idCredit, String reason, float amount, float interest_rate, Date payment_date, Date date, Account_history account) {
        this.idCredit = idCredit;
        this.reason = reason;
        this.amount = amount;
        this.interest_rate = interest_rate;
        this.payment_date = payment_date;
        this.date = date;
        this.account = account;
    }

    public Credit_History(String reason, float amount, float interest_rate, Date payment_date, Date date) {
        this.reason = reason;
        this.amount = amount;
        this.interest_rate = interest_rate;
        this.payment_date = payment_date;
        this.date = date;
    }

    public Long getIdCredit() {
        return idCredit;
    }

    public void setIdCredit(Long idCredit) {
        this.idCredit = idCredit;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }

    public float getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(float interest_rate) {
        this.interest_rate = interest_rate;
    }

    public Date getPayment_date() {
        return payment_date;
    }

    public void setPayment_date(Date payment_date) {
        this.payment_date = payment_date;
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
        return "Credit_History{" +
                "idCredit=" + idCredit +
                ", reason='" + reason + '\'' +
                ", amount=" + amount +
                ", interest_rate=" + interest_rate +
                ", payment_date=" + payment_date +
                ", date=" + date +
                ", account=" + account +
                '}';
    }
}
