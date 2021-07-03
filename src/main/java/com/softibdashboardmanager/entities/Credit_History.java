package com.softibdashboardmanager.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Credit_History {
    private static final long serialVersionUID = 3152690779535828408L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private int id;

    private String reason;
    private float amount;
    private float interest_rate;
    private Date payment_date;
    private Date date;

    public Credit_History(String reason, float amount, float interest_rate, Date payment_date, Date date) {
        this.reason = reason;
        this.amount = amount;
        this.interest_rate = interest_rate;
        this.payment_date = payment_date;
        this.date = date;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Credit_History{" +
                "id=" + id +
                ", reason='" + reason + '\'' +
                ", amount=" + amount +
                ", interest_rate=" + interest_rate +
                ", payment_date=" + payment_date +
                ", date=" + date +
                '}';
    }
}
