package com.bilgeadam.carexample;

public class Car {
// brand, model year, motor type, capacity, color, engine power and speed

    // variables (state)
    private String car_brand;
    private int model_year;
    private String motor_type;
    private int capacity;
    private String color;
    private double engine_power;
    private int speed;
    private final int max_speed = 220;
    private static int counter = 0;

    // default constuctor
    public Car(){
        this(20);
        counter++;
       // this("Tofaş", 2019, "Benzin", 5, "White", 140, 0);
    }

    public Car(int speed){
        this.speed = speed;
    }

    public Car(String car_brand, int model_year, String motor_type, int capacity, String color, double engine_power, int speed) {
        this.car_brand = car_brand;
        this.model_year = model_year;
        this.motor_type = motor_type;
        this.capacity = capacity;
        this.color = color;
        this.engine_power = engine_power;
        this.speed = speed;
    }

    //methods (behaviour)
    public void accelerateSpeed(int speed) {
        this.speed += speed;
        if(this.speed <= max_speed){
            System.out.println("The new speed : " + this.speed);
        } else {
            this.setSpeed(220);
            System.out.println("The car is going with its max speed : " + max_speed);
        }
    }

    public void decreaseSpeed(int speed) {
       if(this.speed >= speed){
           this.speed -= speed;
           System.out.println("The new speed : " + this.speed);
       } else {
           System.out.println("The car is stopped");
           this.speed = 0;
       }

    }

    // getters & setters

    public String getCar_brand() {
        return car_brand;
    }

    public void setCar_brand(String car_brand) {
        this.car_brand = car_brand;
    }

    public int getModel_year() {
        return model_year;
    }

    public void setModel_year(int model_year) {
        this.model_year = model_year;
    }

    public String getMotor_type() {
        return motor_type;
    }

    public void setMotor_type(String motor_type) {
        this.motor_type = motor_type;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getEngine_power() {
        return engine_power;
    }

    public void setEngine_power(double engine_power) {
        this.engine_power = engine_power;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMax_speed() {
        return max_speed;
    }

    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        Car.counter = counter;
    }
}
