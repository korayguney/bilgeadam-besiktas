package com.bilgeadam.jpa2.models;

import javax.persistence.Entity;

//@Entity
public class Cash extends Payment {

    private String cashTendered;

    public Cash(String cashTendered) {
        this.cashTendered = cashTendered;
    }

    public Cash() {
    }

    public String getCashTendered() {
        return cashTendered;
    }

    public void setCashTendered(String cashTendered) {
        this.cashTendered = cashTendered;
    }
}
