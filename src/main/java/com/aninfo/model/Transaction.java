package com.aninfo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String transactionType;

    private Double amount;

    public Transaction() {
        this.transactionType = null;
        this.amount = null;
    };

    public Transaction(String type, Double amount) {
        this.transactionType = type;
        this.amount = amount;
    };

    public int getId() { return this.id; }
    public String getType() { return this.transactionType; }

    public Double getAmount() { return this.amount; }



}
