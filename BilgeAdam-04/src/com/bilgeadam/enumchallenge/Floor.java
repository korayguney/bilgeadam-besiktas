package com.bilgeadam.enumchallenge;

public class Floor {

    private int floorNo;
    private Flat[] flats;


    public Floor(int floorNo, Flat[] flats) {
        this.floorNo = floorNo;
        this.flats = flats;
    }

    public String getInfo(){
        String retVal = String.format("Floor no: %d\n ",floorNo);

        for (Flat f: flats) {
            retVal += f.getInfo();
        }
        return retVal;
    }

    public int getPrice(){
        int total = 0;
        for (Flat f: flats) {
            total += f.getPrice();
        }
        return total;
    }

    public int getFloorNo() {
        return floorNo;
    }

    public void setFloorNo(int floorNo) {
        this.floorNo = floorNo;
    }

    public Flat[] getFlats() {
        return flats;
    }

    public void setFlats(Flat[] flats) {
        this.flats = flats;
    }
}
