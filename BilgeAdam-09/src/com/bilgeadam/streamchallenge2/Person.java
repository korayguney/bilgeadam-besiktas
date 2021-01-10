package com.bilgeadam.streamchallenge2;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return firstName + " "+ lastName;
    }


    @Override
    public int compareTo(Person that) {
        if (this.getAge() != that.getAge()) {
            return (this.getAge() < that.getAge() ? -1 : 1);
        }

        return 0;
    }
}
