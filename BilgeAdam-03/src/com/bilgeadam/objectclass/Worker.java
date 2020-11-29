package com.bilgeadam.objectclass;

import java.util.Objects;

public class Worker extends Object{
    private String name;
    private int age;
    private String address;
    private long tckimlik;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public long getTckimlik() {
        return tckimlik;
    }

    public void setTckimlik(long tckimlik) {
        this.tckimlik = tckimlik;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return tckimlik == worker.tckimlik;
    }



    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", tckimlik=" + tckimlik +
                '}';
    }
}
