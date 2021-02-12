package com.bilgeadam.jpa1.model;

import javax.persistence.*;

// POJO --> Plain Old Java Object (Model)
//@Entity
@Table(name = "storedata")
@SqlResultSetMapping(name = "storemapping",classes = @ConstructorResult(
        targetClass = Store.class, columns = {
                @ColumnResult(name = "store_addr"),
                @ColumnResult(name = "storeArea"),
                @ColumnResult(name = "storeAddress"),
}
))
public class Store {

    @Id
    @GeneratedValue
    private int id;

    @Column(name = "store_addr", length = 50, nullable = false)
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
