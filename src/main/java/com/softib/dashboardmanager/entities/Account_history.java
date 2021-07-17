package com.softib.dashboardmanager.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Account_history {

    private static final long serialVersionUID = 3152690779535828408L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idAccount;

    private String account_type;
    private boolean active;
    private Date creation_date;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonIgnore
    private User_History user;

    public Account_history() {
    }

    public Account_history(String account_type, boolean active, Date creation_date, User_History user) {
        this.account_type = account_type;
        this.active = active;
        this.creation_date = creation_date;
        this.user = user;
    }

    public Account_history(Long idAccount, String account_type, boolean active, Date creation_date, User_History user) {
        this.idAccount = idAccount;
        this.account_type = account_type;
        this.active = active;
        this.creation_date = creation_date;
        this.user = user;
    }

    public Account_history(String account_type, boolean active, Date creation_date) {
        this.account_type = account_type;
        this.active = active;
        this.creation_date = creation_date;
    }


    public Long getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(Long idAccount) {
        this.idAccount = idAccount;
    }

    public String getAccount_type() {
        return account_type;
    }

    public void setAccount_type(String account_type) {
        this.account_type = account_type;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public User_History getUser() {
        return user;
    }

    public void setUser(User_History user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Account_history{" +
                "idAccount=" + idAccount +
                ", account_type='" + account_type + '\'' +
                ", active=" + active +
                ", creation_date=" + creation_date +
                ", user=" + user +
                '}';
    }
}

