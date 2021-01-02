package com.bilgeadam.examsolutions.q2;

public class TestManager {

    public static void main(String[] args) {
        Manager manager1 = new Manager("IT",22,"Director","Hasan Veli",LevelType.EXPERIENCED);
        Manager manager2 = new Manager("Sales",33,"Director","Ayşe Veli",LevelType.JUNIOR);
        Manager manager3 = new Manager("Sales",33,"Director","Ayşe Veli",LevelType.JUNIOR);

        System.out.println(manager1.printInformation());


    }
}
