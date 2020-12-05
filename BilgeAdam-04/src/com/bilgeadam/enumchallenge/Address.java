package com.bilgeadam.enumchallenge;

public class Address {

    private String street;
    private int addr_no;

    public Address(String street, int addr_no) {
        this.street = street;
        this.addr_no = addr_no;
    }

    public String getInfo(){
        return String.format("Address no: %d, street: %s",getAddr_no(), getStreet());
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getAddr_no() {
        return addr_no;
    }

    public void setAddr_no(int addr_no) {
        this.addr_no = addr_no;
    }
}
