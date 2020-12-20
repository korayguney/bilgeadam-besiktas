package com.bilgeadam.ooprevisit;

public enum PlaneType {

    SMALLJET(14, 1000),
    LARGEJET(126, 3000),
    CARGO(250, 3500);

    private int capacity;
    private int range;

    private PlaneType(int capacity, int range) {
        this.capacity = capacity;
        this.range = range;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getRange() {
        return range;
    }

    public String displayInformation(){
        return String.format("Type: %s, capacity: %d, range: %d", this.name(),getCapacity(), getRange());
    }
}
