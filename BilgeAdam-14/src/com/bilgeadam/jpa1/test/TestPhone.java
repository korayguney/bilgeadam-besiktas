package com.bilgeadam.jpa1.test;

import com.bilgeadam.jpa1.model.Phone;
import com.bilgeadam.jpa1.service.PhoneService;

import java.util.List;

public class TestPhone {
    public static void main(String[] args) {
        PhoneService service = new PhoneService();
        service.saveToDatabase();
        List<Phone> phoneList = service.findAll();
        System.out.println("Size of phones : " + phoneList.size());
        System.out.println("-----------------------------");
        phoneList.stream().forEach(System.out::println);
        System.out.println("-----------------------------");
    }
}
