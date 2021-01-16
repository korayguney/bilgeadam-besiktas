package com.bilgeadam.thread1;

import com.bilgeadam.threadcolor.ThreadColor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class MyFirstThread {

    public static void main(String[] args) {
        // extended from Thead class
        MyCustomThread myFirstThread = new MyCustomThread();
        myFirstThread.setName("Extended from thread --->");

        // implemented from Runnable interface
        MyRunnableThread myRunnableThread = new MyRunnableThread();
        Thread mySecondThread = new Thread(myRunnableThread);
        mySecondThread.setName("Implemented from Runnable --->");

        myFirstThread.setPriority(Thread.MAX_PRIORITY);
        mySecondThread.setPriority(Thread.MIN_PRIORITY);

        myFirstThread.start();
        mySecondThread.start();

        ExecutorService exec = Executors.newFixedThreadPool(4);
        exec.submit(myRunnableThread);
        exec.submit(myFirstThread);
        exec.shutdown();
    }

    static class MyCustomThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(ThreadColor.ANSI_GREEN + Thread.currentThread().getName() + " : " + i );
            }
        }
    }

    static class MyRunnableThread implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                System.out.println(ThreadColor.ANSI_PURPLE + Thread.currentThread().getName() + " : " + i );
            }
        }
    }

}
