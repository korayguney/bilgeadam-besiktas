package com.bilgeadam.oop1;

public class TestOOP1 {

    public static void main(String[] args) {

        Engine engine = new Engine("32HHM339MMN",155,45,EngineType.DIESEL);
        Engine engine2 = new Engine("32HHM339MMN",45,1212,EngineType.GASOLINE);

        Car car = new Car(engine,GearType.AUTOMATIC,"Red",5);
        Car car2 = new Car(engine2,GearType.MANUEL,"White",2);


        System.out.println(car);

        System.out.println("Is engines equal? : " + (engine.equals(engine2)));
        System.out.println("Is cars equal? : " + (car.equals(car2)));


    }
}
