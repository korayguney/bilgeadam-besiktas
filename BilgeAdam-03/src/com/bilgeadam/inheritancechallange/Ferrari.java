package com.bilgeadam.inheritancechallange;

public class Ferrari extends Car{
    private String chassis_no;
    private String color;

    public Ferrari() {
        //super(2019);
    }

    public int accelerate(int speed_rate){
        setSpeed(getSpeed() + speed_rate);
        System.out.println("Ferrari speed is now : " + getSpeed() + " km/h");
        getCurrentGear();
        return getSpeed();
    }

    public int break_car(int speed_rate){
        if(getSpeed() - speed_rate > 0)
            setSpeed(getSpeed() - speed_rate);
        else
            setSpeed(0);
        System.out.println("Ferrari speed is now : " + getSpeed() + " km/h");
        getCurrentGear();
        return getSpeed();
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
        return "Ferrari{" +
                "chassis_no='" + chassis_no + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
