package com.bilgeadam.objectclass;

public class TestWorker {
    public static void main(String[] args) {
        Worker worker1 = new Worker();
        worker1.setName("Koray Guney");
        worker1.setAddress("Tuzla");
        worker1.setAge(36);
        worker1.setTckimlik(11122233344L);

        Worker worker2 = new Worker();
        worker2.setName("Koray Guney");
        worker2.setAddress("Tuzla");
        worker2.setAge(36);
        worker2.setTckimlik(11122233344L);

        System.out.println(worker2);
        System.out.println(worker1.equals(worker2));
    }
}
