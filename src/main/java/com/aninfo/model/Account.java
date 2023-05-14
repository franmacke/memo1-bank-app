package com.aninfo.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long cbu;

    private Double balance;

    @OneToMany
    private List<Transaction> transactions;

    public Account(){
        this.transactions = null;
    }

    public Account(Double balance) {
        this.balance = balance;
    }

    public Long getCbu() {
        return cbu;
    }

    public void setCbu(Long cbu) {
        this.cbu = cbu;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public List<Transaction> getTransactions() { return this.transactions; }

    public void addTransaction(Transaction transaction) { this.transactions.add(transaction); }

}
