package com.bilgeadam.thread1;

import com.bilgeadam.threadcolor.ThreadColor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;


public class ConsumerProducer {
    public static void main(String[] args) {
        SharedData data = new SharedData();
        data.intValue = 100;
        data.flag = false;

        Producer p = new Producer(data);
        Consumer c = new Consumer(data);
        Thread t = new Thread(c);

        p.start();
        t.start();
    }


}

class Producer extends Thread {
    SharedData data;

    public Producer(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            // SharedData.lock.lock();
            for (int i = 0; i < 10; i++) {
                if (data.flag == false)
                    synchronized (data) {
                        data.intValue++; // critical section
                    }
                System.out.println(ThreadColor.ANSI_BLUE + "Producer :" + data.intValue);
            }
        } finally {
            // SharedData.lock.unlock();
            data.flag = true;
        }
    }
}

class Consumer implements Runnable {
    SharedData data;

    public Consumer(SharedData data) {
        this.data = data;
    }

    @Override
    public void run() {
        try {
            //SharedData.lock.lock();
            for (int i = 0; i < 10; i++) {
                if (data.flag == true)
                    synchronized (this) {
                        data.intValue--; // critical section
                    }
                System.out.println(ThreadColor.ANSI_PURPLE + "Consumer :" + data.intValue);
            }
        } finally {
            //SharedData.lock.unlock();
            data.flag = false;
        }

    }
}

class SharedData {
    static Lock lock = new ReentrantLock();
    int intValue;
    boolean flag;
}
