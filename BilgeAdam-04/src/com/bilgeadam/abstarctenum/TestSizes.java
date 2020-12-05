package com.bilgeadam.abstarctenum;

import java.time.DayOfWeek;
import java.time.Month;

public class TestSizes {

    public static void main(String[] args) {

        CoffeeSize coffeeSize1 = CoffeeSize.LARGE;
        CoffeeSize coffeeSize2 = CoffeeSize.MEDIUM;
        CoffeeSize coffeeSize3 = CoffeeSize.SMALL;
        String ingredient = CoffeeSize.LARGE.getIngredient();
        System.out.println(ingredient);
        System.err.println("Error from coffee");
        System.out.println("-----------------------------------");
        CoffeeSize[] coffeeSizes = {coffeeSize1,coffeeSize2,coffeeSize3};

        int totalPrice = 0;

        for (CoffeeSize cs: coffeeSizes) {
            totalPrice += cs.getPrice();
            System.out.println("Purchased coffee size : " + cs.getCommersialName());
        }
        System.out.println("Total price of the coffees : " + totalPrice + " TL.");

        if(coffeeSize1 == CoffeeSize.LARGE){
            System.out.println(true);
        } else {
            System.out.println(false);
        }

        switch (coffeeSize1){
            case LARGE:
                System.out.println("Size is large");
                break;
            case MEDIUM:
                System.out.println("Size is medium");
                break;
            case SMALL:
                System.out.println("Size is small");
                break;
            default:
                System.out.println("Nothing");
                break;
        }

        for (CoffeeSize size : CoffeeSize.values()) {
            System.out.println(size.getCommersialName());
        }

        for (DayOfWeek day : DayOfWeek.values()) {
            System.out.println(day);
        }

        for ( Month month : Month.values()) {
            System.out.println(month);
        }
    }
}
