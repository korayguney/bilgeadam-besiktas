package com.bilgeadam.enums;

public enum CoffeeSize {

    SMALL(10, "Tall size"),
    MEDIUM(12, "Grande size"),
    LARGE(15,"Vendi size");

    private int price;
    private String commersialName;

    private CoffeeSize(int price, String commersialName) {
        this.price = price;
        this.commersialName = commersialName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getCommersialName() {
        return commersialName;
    }

    public void setCommersialName(String commersialName) {
        this.commersialName = commersialName;
    }
}
