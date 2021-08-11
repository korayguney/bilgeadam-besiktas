package com.bilgeadam.o4isp.antipattern;

import com.bilgeadam.o4isp.pitfall.Car;

public interface ParkingLot {

    void parkCar();	// Decrease empty spot count by 1
    void unparkCar(); // Increase empty spots by 1
    void getCapacity();	// Returns car capacity

}