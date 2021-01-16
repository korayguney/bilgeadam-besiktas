package com.bilgeadam.deadlockexample;

public class TestDeadLock {

    public static Object LockA = new Object();
    public static Object LockB = new Object();

    public static void main(String[] args) {
        ThreadDemo1 threadDemo1 = new ThreadDemo1();
        ThreadDemo2 threadDemo2 = new ThreadDemo2();

        threadDemo1.start();
        threadDemo2.start();
    }

    private static class ThreadDemo1 extends Thread {
        @Override
        public void run() {
            synchronized (LockA){
                System.out.println("Thread 1 : Holding lock A...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 1 : Waiting for lock B...");
                synchronized (LockB){
                    System.out.println("Thread 1: Holding LockA&LockB...");
                }
            }
        }
    }

    private static class ThreadDemo2 extends Thread {
        @Override
        public void run() {
            synchronized (LockA){
                System.out.println("Thread 2 : Holding lock B...");
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Thread 2 : Waiting for lock A...");
                synchronized (LockB){
                    System.out.println("Thread 2: Holding LockA&LockB...");
                }
            }
        }
    }
}
