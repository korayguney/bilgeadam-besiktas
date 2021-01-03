package com.bilgeadam.builderexample;

public class TestPerson {
    public static void main(String[] args) {

        Person person = new Person.Builder().setAge(36).setAddress("Istanbul").setGivenName("Koray").setSurName("Güney").setGender(Gender.MALE).build();
        Person person2 = new Person.Builder().setGivenName("Ilhan").setSurName("Öz").build();

        System.out.println(person);
        System.out.println(person2);


    }
}
