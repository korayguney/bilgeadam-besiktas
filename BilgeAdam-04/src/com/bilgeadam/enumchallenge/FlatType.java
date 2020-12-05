package com.bilgeadam.enumchallenge;

public enum FlatType {

    STUDIO (20000),
    APARTMENT (35000),
    RESIDENCE (55000);

    private int price;

    FlatType(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }
}
