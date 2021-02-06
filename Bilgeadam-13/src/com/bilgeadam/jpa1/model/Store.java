package com.bilgeadam.jpa1.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

// POJO --> Plain Old Java Object (Model)
@Entity
@Table(name = "storedata")
public class Store {

    @Id
    @GeneratedValue
    private int id;
    private String storeName;
    private double storeArea;
    private String storeAddress;

    public Store() {
    }

    public Store(String storeName, double storeArea, String storeAddress) {
        this.storeName = storeName;
        this.storeArea = storeArea;
        this.storeAddress = storeAddress;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public double getStoreArea() {
        return storeArea;
    }

    public void setStoreArea(double storeArea) {
        this.storeArea = storeArea;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Store{" +
                "storeName='" + storeName + '\'' +
                ", storeArea=" + storeArea +
                ", storeAddress='" + storeAddress + '\'' +
                '}';
    }
}
