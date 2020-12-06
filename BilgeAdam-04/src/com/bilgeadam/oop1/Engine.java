package com.bilgeadam.oop1;

import java.util.Objects;

public class Engine {
    // variables
    private String serialNumber;
    private int horsePower;
    private int volume;
    private EngineType engineType;

    // constructor
    public Engine(String serialNumber, int horsePower, int volume, EngineType engineType) {
        this.serialNumber = serialNumber;
        this.horsePower = horsePower;
        this.volume = volume;
        this.engineType = engineType;
    }

    public Engine(){

    }

    // getters & setters
    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public EngineType getEngineType() {
        return engineType;
    }

    public void setEngineType(EngineType engineType) {
        this.engineType = engineType;
    }

    // object methods
    @Override
    public String toString() {
        return "Engine{" +
                "serialNumber='" + serialNumber + '\'' +
                ", horsePower=" + horsePower +
                ", volume=" + volume +
                ", engineType=" + engineType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Engine engine = (Engine) o;
        return Objects.equals(serialNumber, engine.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serialNumber);
    }
}
