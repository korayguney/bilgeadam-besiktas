package com.bilgeadam.maps;

import java.util.Objects;

public class Car implements Comparable<Car>{

    private String name;
    private int price;

    public Car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return price == car.price &&
                Objects.equals(name, car.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }


    @Override
    public int compareTo(Car that) {
        if (this.getName() == null && that.getName() == null) {
            // pass
        } else if (this.getName() == null) {
            return -1;
        } else if (that.getName() == null) {
            return 1;
        } else {
            int nameComparison = this.getName().compareTo(that.getName());
            if (nameComparison != 0) {
                return nameComparison < 0 ? -1 : 1;
            }
        }

        if (this.getPrice() != that.getPrice()) {
            return (this.getPrice() < that.getPrice() ? -1 : 1);
        }

        return 0;
    }
}
