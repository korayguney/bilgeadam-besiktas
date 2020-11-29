package com.bilgeadam.enumchallenge;

public class Bus {

    private Destination destinationOfBus;
    private Passenger[] passengers;

    private int insertedPassenger;
    private final int BUS_CAPACITY;

    public Bus(Destination destinationOfBus) {
        this.destinationOfBus = destinationOfBus;
        this.BUS_CAPACITY = 10;
        this.passengers = new Passenger[10];
        this.insertedPassenger = 0;
    }

    public void insertPassenger(Passenger passenger){

        if(insertedPassenger < this.BUS_CAPACITY){
            // insert passenger is OK
            if(passenger.getDestinationOfPassenger() == this.getDestinationOfBus()){
                passengers[insertedPassenger] = passenger;
                insertedPassenger++;
                System.out.println("-----------------------------");
                System.out.println("Passenger " + passenger.getName() + " is inserted");
                System.out.println("Total passenger : " + insertedPassenger);
                System.out.println("Remained seats : " + (this.BUS_CAPACITY - insertedPassenger));
                System.out.println("-----------------------------");
            } else {
                System.out.println("Destination of bus is " + getDestinationOfBus() + ", but " + passenger.getName()
                + " is going to " + passenger.getDestinationOfPassenger());
            }
        } else {
            System.out.println("There is not enough seats inside bus");
        }
    }

    public Destination getDestinationOfBus() {
        return destinationOfBus;
    }

    public void setDestinationOfBus(Destination destinationOfBus) {
        this.destinationOfBus = destinationOfBus;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public void setPassengers(Passenger[] passengers) {
        this.passengers = passengers;
    }

    public int getInsertedPassenger() {
        return insertedPassenger;
    }

    public void setInsertedPassenger(int insertedPassenger) {
        this.insertedPassenger = insertedPassenger;
    }

    public int getBUS_CAPACITY() {
        return BUS_CAPACITY;
    }
}
