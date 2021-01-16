package com.bilgeadam.waitnotifyeaxample;

import sun.awt.windows.ThemeReader;

import java.util.Scanner;

public class WaitNotifyTest {

    public static void main(String[] args) {
        ProducerConsumer pc = new ProducerConsumer();
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.produce();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    pc.consume();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        thread1.start();
        thread2.start();

    }

    private static class ProducerConsumer {
        public void produce() throws InterruptedException {
            synchronized (this) {
                System.out.println("Producer thread is running...");
                wait();
                System.out.println("Producer thread is resumed...");
            }
        }

        public void consume() throws InterruptedException {
            Thread.sleep(1000);
            Scanner scanner = new Scanner(System.in);
            synchronized (this) {
                System.out.println("Waiting for the return key...");
                scanner.nextLine();
                System.out.println("The key is pressed...");
                notify();

                Thread.sleep(2000);
            }


        }

    }

}
