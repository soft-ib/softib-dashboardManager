package com.softib.dashboardmanager.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class User_History {
    private static final long serialVersionUID = 3152690779535828408L;

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long idUser;

    private String region;
    private String fullname;
    private Date birth_date;
    private Date creation_date;
    private boolean active;

    public User_History() {
    }

    public User_History(Long idUser, String region, String fullname, Date birth_date, Date creation_date, boolean active) {
        this.idUser = idUser;
        this.region = region;
        this.fullname = fullname;
        this.birth_date = birth_date;
        this.creation_date = creation_date;
        this.active = active;
    }

    public User_History(String region, String fullname, Date birth_date, Date creation_date, boolean active) {
        this.region = region;
        this.fullname = fullname;
        this.birth_date = birth_date;
        this.creation_date = creation_date;
        this.active = active;
    }

    public Long getIdUser() {
        return idUser;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public String getRegion() {
        return this.region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Date getCreation_date() {
        return creation_date;
    }

    public void setCreation_date(Date creation_date) {
        this.creation_date = creation_date;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    @Override
    public String toString() {
        return "User_History{" +
                "idUser=" + idUser +
                ", region='" + this.region + '\'' +
                ", fullname='" + fullname + '\'' +
                ", birth_date=" + birth_date +
                ", creation_date=" + creation_date +
                ", active=" + active +
                '}';
    }
}
