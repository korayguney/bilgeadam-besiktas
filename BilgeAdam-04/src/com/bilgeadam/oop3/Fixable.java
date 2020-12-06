package com.bilgeadam.oop3;

public interface Fixable {

    void getFixed();

    public static double calculateFixCost(Fixable vehicle){
        if(vehicle instanceof Car){
            return 2500.00;
        } else if(vehicle instanceof Boat){
            return 7500.00;
        } else {
            return 0;
        }
    }


}
