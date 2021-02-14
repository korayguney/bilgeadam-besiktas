package com.bilgeadam.jpa2.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "check_pay")
@DiscriminatorValue("1")
public class Check extends Payment {

    private String name;
    private String bankId;

    public Check() {
    }

    public Check(String name, String bankId) {
        this.name = name;
        this.bankId = bankId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBankId() {
        return bankId;
    }

    public void setBankId(String bankId) {
        this.bankId = bankId;
    }
}
