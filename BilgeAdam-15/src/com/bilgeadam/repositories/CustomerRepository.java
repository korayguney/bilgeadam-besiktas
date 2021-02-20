package com.bilgeadam.repositories;

import com.bilgeadam.models.Vehicle;

import java.util.List;

public interface CustomerRepository {
    boolean isExistsOnDatabase(long SSID);
    List<Vehicle> findVehiclesOfCustomer(long SSID);
}
