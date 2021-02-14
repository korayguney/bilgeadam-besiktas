package com.bilgeadam.jpa2.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import java.time.LocalDate;

@Entity
@DiscriminatorValue("2")
public class CreditCard extends Payment {
    private long cardNumber;
    private String type;
    private LocalDate expDate;

    public CreditCard(long cardNumber, String type, LocalDate expDate) {
        this.cardNumber = cardNumber;
        this.type = type;
        this.expDate = expDate;
    }

    public CreditCard(){

    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getExpDate() {
        return expDate;
    }

    public void setExpDate(LocalDate expDate) {
        this.expDate = expDate;
    }
}
