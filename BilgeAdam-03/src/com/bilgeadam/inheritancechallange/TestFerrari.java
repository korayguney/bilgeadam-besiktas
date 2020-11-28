package com.bilgeadam.inheritancechallange;

public class TestFerrari {
    public static void main(String[] args) {

        Ferrari ferrari = new Ferrari();

        ferrari.setChassis_no("7476HH2321HU");
        ferrari.setColor("Red");
        ferrari.setName("Spider");
        ferrari.setModel_year(2020);

        ferrari.accelerate(35);
        ferrari.accelerate(45);
        ferrari.accelerate(100);
        ferrari.break_car(120);

        Maserati maserati = new Maserati();
        maserati.accelerate(35);
    }
}
