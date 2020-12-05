package com.bilgeadam.enumchallenge;

public class Flat {

    private int no;
    private int numOfRooms;
    private FlatType flatType;


    public Flat(int no, int numOfRooms, FlatType flatType) {
        this.no = no;
        this.numOfRooms = numOfRooms;
        this.flatType = flatType;
    }

    public String getInfo(){
        return String.format("Flat no: %d, type: %s\n",getNo(), flatType.toString());
    }

    public int getPrice(){
        return flatType.getPrice();
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public int getNumOfRooms() {
        return numOfRooms;
    }

    public void setNumOfRooms(int numOfRooms) {
        this.numOfRooms = numOfRooms;
    }

    public FlatType getFlatType() {
        return flatType;
    }

    public void setFlatType(FlatType flatType) {
        this.flatType = flatType;
    }
}
