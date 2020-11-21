package com.bilgeadam.constuctors;

public class TestCustomer {

    public static void main(String[] args) {

        VipCustomer vipCustomer = new VipCustomer();
        //System.out.println(vipCustomer.getFullname());

        VipCustomer vipCustomer2 = new VipCustomer("Koray Guney", "kg@gmail.com");
        //System.out.println(vipCustomer2.getCreditLimit());

        VipCustomer vipCustomer3 = new VipCustomer("Koray Guney", 15000.0, "kg@gmail.com");
        System.out.println(vipCustomer3.getCreditLimit());


    }
}
