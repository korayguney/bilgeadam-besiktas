package com.bilgeadam.jpa1.test;

import com.bilgeadam.jpa1.model.Phone;
import com.bilgeadam.jpa1.service.PhoneService;

import java.util.List;

public class TestPhone {
    public static void main(String[] args) {
        PhoneService service = new PhoneService();
        //service.saveToDatabase();
        List<Phone> phoneList = service.findAll();
        System.out.println("Size of phones : " + phoneList.size());
        System.out.println("-----------------------------");
        phoneList.stream().forEach(System.out::println);
        System.out.println("-----------------------------");
        Phone phone = service.findById(2);
        System.out.println("FOUND PHONE : " + phone);
        System.out.println("-----------------------------");
        Phone phone2 = new Phone("HTC","M7",423465463242L,3634);
        //service.saveToDatabase(phone2);
        //service.deleteFromDatabase(phone2);
        //service.deleteFromDatabase(6);
        service.updateOnDatabase(1);
        boolean result = service.isExistsOnDatabase(phone2);

        if(result) {
            System.out.println("On the DB");
        } else {
            System.out.println("NOT on the DB");
        }
    }
}
