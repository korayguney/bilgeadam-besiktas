package com.bilgeadam.enumchallenge;

public class Passenger {
    private String name;
    private Destination destinationOfPassenger;

    public Passenger(String name, Destination destinationOfPassenger) {
        this.name = name;
        this.destinationOfPassenger = destinationOfPassenger;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Destination getDestinationOfPassenger() {
        return destinationOfPassenger;
    }

    public void setDestinationOfPassenger(Destination destinationOfPassenger) {
        this.destinationOfPassenger = destinationOfPassenger;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "name='" + name + '\'' +
                ", destinationOfPassenger=" + destinationOfPassenger +
                '}';
    }
}
