package com.bilgeadam.enumtshirt;

public enum TshirtSize {

    SMALL(15),MEDIUM(20),LARGE(23),XLARGE(27.5),XSMALL(35.8);

    private double price = 0.0;

    private TshirtSize(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
