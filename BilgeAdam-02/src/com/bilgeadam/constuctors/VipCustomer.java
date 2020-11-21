package com.bilgeadam.constuctors;

public class VipCustomer {

    private String fullname;
    private double creditLimit;
    private String mail;

    // overloading [dynamic Polymorphism]
    public VipCustomer() {
        this("Test Test", 10000, "testt@test.com");
    }

    public VipCustomer(String fullname, String mail) {
        this(fullname, 0, mail);
    }

    public VipCustomer(String fullname, double creditLimit, String mail) {
        this.fullname = fullname;
        this.creditLimit = creditLimit;
        this.mail = mail;
    }

    public String getFullname() {
        return fullname;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getMail() {
        return mail;
    }
}
