package com.bilgeadam.inheritancechallange;

public class Maserati extends Car{
    private String chassis_no;
    private String color;

    public Maserati() {
        super(2019);
    }

    public int accelerate(int speed_rate){
        setSpeed(getSpeed() + speed_rate);
        System.out.println("Maserati speed is now : " + getSpeed() + " km/h");
        getCurrentGear();
        return getSpeed();
    }

    public int break_car(int speed_rate){
        if(getSpeed() - speed_rate > 0)
            setSpeed(getSpeed() - speed_rate);
        else
            setSpeed(0);
        System.out.println("Maserati speed is now : " + getSpeed() + " km/h");
        getCurrentGear();
        return getSpeed();
    }

    @Override
    public void getCurrentGear() {
        if(getSpeed() == 0){
            stop();
            changeGear(1);
        } else if(getSpeed() > 0 && getSpeed() <= 40){
            changeGear(2);
        } else if(getSpeed() > 40 && getSpeed() <= 70){
            changeGear(3);
        } else if(getSpeed() > 70 && getSpeed() <= 100){
            changeGear(4);
        } else if(getSpeed() > 100){
            changeGear(5);
        }
    }

    public String getChassis_no() {
        return chassis_no;
    }

    public void setChassis_no(String chassis_no) {
        this.chassis_no = chassis_no;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Maserati{" +
                "chassis_no='" + chassis_no + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
