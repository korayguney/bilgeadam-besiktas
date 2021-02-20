package com.bilgeadam.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String address;
    @Column(unique = true)
    private long SSID;

    @OneToMany(mappedBy = "customer")
    private List<Vehicle> vehicles = new ArrayList<>();


    public Customer(String name, String address, long SSID) {
        this.name = name;
        this.address = address;
        this.SSID = SSID;
    }

    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getSSID() {
        return SSID;
    }

    public void setSSID(long SSID) {
        this.SSID = SSID;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", SSID=" + SSID +
                '}';
    }
}
