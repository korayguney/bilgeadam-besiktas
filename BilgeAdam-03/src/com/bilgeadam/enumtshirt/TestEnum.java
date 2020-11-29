package com.bilgeadam.enumtshirt;

public class TestEnum {
    public static void main(String[] args) {

        double totalPrice =  0;

        TshirtSize ts1 = TshirtSize.LARGE;
        TshirtSize ts2 = TshirtSize.LARGE;
        TshirtSize ts3 = TshirtSize.XLARGE;
        TshirtSize ts4 = TshirtSize.XSMALL;
        TshirtSize ts5 = TshirtSize.MEDIUM;

        TshirtSize[] sizes = {ts1,ts2,ts3,ts4,ts5};

        for (TshirtSize size: sizes) {
            totalPrice += size.getPrice();
        }

        System.out.println("Total price of the tshirts : " + totalPrice + " TL.");






    }


}
