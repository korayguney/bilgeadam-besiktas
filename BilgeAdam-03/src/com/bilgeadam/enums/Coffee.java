package com.bilgeadam.enums;

public class Coffee {
    private CoffeeSizes sizes;

    public enum CoffeeSizes {
        TALL,GRANDE,VENDI
    }

    public void setSizes(CoffeeSizes sizes) {
        this.sizes = sizes;
    }

    public static void main(String[] args) {
        Coffee coffee = new Coffee();
        coffee.setSizes(CoffeeSizes.TALL);
    }
}

