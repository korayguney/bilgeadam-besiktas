package com.bilgeadam.jpa1.model;
// POJO --> Plain Old Java Object (Model)
public class Store {
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

    @Override
    public String toString() {
        return "Store{" +
                "storeName='" + storeName + '\'' +
                ", storeArea=" + storeArea +
                ", storeAddress='" + storeAddress + '\'' +
                '}';
    }
}
