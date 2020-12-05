package com.bilgeadam.enumchallenge;

// POJO --> Plain Old Java Object & Java Bean(Java EE)
public class Building {
    private Address address;
    private Floor[] floors;

    public Building(Address address, Floor[] floors) {
        this.address = address;
        this.floors = floors;
    }

    public String getInfo(){
        String retVal = String.format("Building address: %s\n ", getAddress().getInfo());
        for (Floor f: floors) {
            retVal += f.getInfo();
        }
        return retVal;
    }

    public int getPrice(){
        int total = 0;
        for (Floor f: floors) {
            total += f.getPrice();
        }
        return total;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Floor[] getFloors() {
        return floors;
    }

    public void setFloors(Floor[] floors) {
        this.floors = floors;
    }
}
