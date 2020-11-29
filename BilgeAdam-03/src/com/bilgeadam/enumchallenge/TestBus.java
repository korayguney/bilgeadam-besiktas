package com.bilgeadam.enumchallenge;

import sun.security.krb5.internal.crypto.Des;

public class TestBus {
    public static void main(String[] args) {
        Passenger passenger1 = new Passenger("Koray", Destination.ISTANBUL);
        Passenger passenger2 = new Passenger("Ali", Destination.ADANA);
        Passenger passenger3 = new Passenger("Mehmet", Destination.ANKARA);
        Passenger passenger4 = new Passenger("Ayşe", Destination.ISTANBUL);
        Passenger passenger5 = new Passenger("Fatma", Destination.ISTANBUL);
        Passenger passenger6 = new Passenger("Furkan", Destination.ADANA);

        Bus bus = new Bus(Destination.ISTANBUL);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger6);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger1);
        bus.insertPassenger(passenger1);


    }
}
