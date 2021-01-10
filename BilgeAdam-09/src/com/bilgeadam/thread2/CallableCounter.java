package com.bilgeadam.thread2;

import java.util.concurrent.Callable;

public class CallableCounter implements Callable<Integer> {
    private int from;
    private int to;

    public CallableCounter(int from, int to) {
        this.from = from;
        this.to = to;
    }


    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = from; i < to; i++) {
            System.out.println(Thread.currentThread().getName() + " ---> " + i);
            sum += i;
        }
        return sum;

    }
}
