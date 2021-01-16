package com.bilgeadam.semaphores;

import java.util.concurrent.Semaphore;

public class SemaphoresExample {

    static Semaphore semaphore = new Semaphore(1);

    static class ParkingLot extends Thread {

        private String name = "";

        public ParkingLot(String name) {
            this.name = name;
        }

        @Override
        public void run() {

            try {
                System.out.println(name + " in the entrence of the parking lot...");
                semaphore.acquire();

                System.out.println(name + " parked her/his car!");

                for (int i = 1; i < 5; i++) {
                    System.out.println(name + " is in the parking space, the available parking space(s)" +
                            "count are : " + semaphore.availablePermits());
                    Thread.sleep(500);
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                semaphore.release();
                System.out.println(name + " is leaving from parking lot... ");
                System.out.println(name + " available parking space(s) count " +
                        semaphore.availablePermits());
            }


        }
    }

    public static void main(String[] args) {

        System.out.println("TOTAL available parking space(s) in the parking lot : " + semaphore.availablePermits());

        ParkingLot car1 = new ParkingLot("A");
        car1.start();

        ParkingLot car2 = new ParkingLot("B");
        car2.start();

        ParkingLot car3 = new ParkingLot("C");
        car3.start();

        ParkingLot car4 = new ParkingLot("D");
        car4.start();

        ParkingLot car5 = new ParkingLot("E");
        car5.start();

        ParkingLot car6 = new ParkingLot("F");
        car6.start();



    }


}
