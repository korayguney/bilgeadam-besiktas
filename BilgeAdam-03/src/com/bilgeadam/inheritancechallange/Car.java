package com.bilgeadam.inheritancechallange;

public class Car extends Vehicle{

    private int model_year;
    private int seat_count;
    private boolean isManuel;

    private int currentGear;

    public Car(){}

    public Car(int model_year) {
        super("D segment");
        this.model_year = model_year;
        this.currentGear = 1;
    }

    public void getCurrentGear(){

        if(getSpeed() == 0){
            stop();
            changeGear(1);
        } else if(getSpeed() > 0 && getSpeed() <= 20){
            changeGear(2);
        } else if(getSpeed() > 20 && getSpeed() <= 40){
            changeGear(3);
        } else if(getSpeed() > 40 && getSpeed() <= 60){
            changeGear(4);
        } else if(getSpeed() > 60 && getSpeed() <= 80){
            changeGear(5);
        } else if(getSpeed() > 80){
            changeGear(6);
        }


    }

    public void changeGear(int currentGear) {
        System.out.println("Car current gear is " + currentGear);
    }

    public int getModel_year() {
        return model_year;
    }

    public void setModel_year(int model_year) {
        this.model_year = model_year;
    }

    public int getSeat_count() {
        return seat_count;
    }

    public void setSeat_count(int seat_count) {
        this.seat_count = seat_count;
    }

    public boolean isManuel() {
        return isManuel;
    }

    public void setManuel(boolean manuel) {
        isManuel = manuel;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }
}
