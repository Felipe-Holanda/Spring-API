package com.hvalut.testapi.model;


import java.util.Date;

import org.hibernate.annotations.CreationTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "transactions")
public class Transactions {
    
    @Id    
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(nullable = false, referencedColumnName = "id")
    private User payer;

    @ManyToOne
    @JoinColumn(nullable = false, referencedColumnName = "id")
    private User payee;

    @Column(columnDefinition = "DECIMAL", nullable = false)
    private float amount;

    public Transactions(){

    }

    public Transactions(User payer, User payee, float amount) {
        this.payer = payer;
        this.payee = payee;
        this.amount = amount;
    }

    @CreationTimestamp
    private Date date;

    

    public long getId() {
        return id;
    }

    public User getPayer() {
        return payer;
    }

    public void setPayer(User payer) {
        this.payer = payer;
    }

    public User getPayee() {
        return payee;
    }

    public void setPayee(User payee) {
        this.payee = payee;
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

}
