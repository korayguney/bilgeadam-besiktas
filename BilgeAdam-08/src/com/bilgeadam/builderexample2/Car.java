package com.bilgeadam.builderexample2;

import com.bilgeadam.builderexample.Person;

public class Car {
    private String brand;
    private String model;
    private double price;
    private char segment;
    private MotorType mType; 
    private Color color; 
    private boolean isRightSteeringWheel;

    public Car(Builder builder){
        this.brand = builder.brand;
        this.model = builder.model;
        this.price = builder.price;
        this.segment = builder.segment;
        this.mType = builder.mType;
        this.color = builder.color;
        this.isRightSteeringWheel = builder.isRightSteeringWheel;
    }

    public static class Builder {
        private String brand;
        private String model;
        private double price;
        private char segment;
        private MotorType mType;
        private Color color;
        private boolean isRightSteeringWheel;
        
        public Builder(){}

        public Builder setBrand(String brand) {
            this.brand = brand;
            return this;
        }

        public Builder setModel(String model) {
            this.model = model;
            return this;
        }

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setSegment(char segment) {
            this.segment = segment;
            return this;
        }

        public Builder setmType(MotorType mType) {
            this.mType = mType;
            return this;
        }

        public Builder setColor(Color color) {
            this.color = color;
            return this;
        }

        public Builder setRightSteeringWheel(boolean rightSteeringWheel) {
            isRightSteeringWheel = rightSteeringWheel;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }

}
