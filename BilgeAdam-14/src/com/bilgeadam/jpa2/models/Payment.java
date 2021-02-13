package com.bilgeadam.jpa2.models;

import javax.persistence.*;

// Superclass
//@MappedSuperclass
//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private double amount;

    public Payment(double amount) {
        this.amount = amount;
    }

    public Payment() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
