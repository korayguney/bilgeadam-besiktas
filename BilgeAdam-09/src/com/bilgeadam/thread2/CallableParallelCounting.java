package com.bilgeadam.thread2;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallableParallelCounting {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CallableCounter[] counters = {
                new CallableCounter(1,10),
                new CallableCounter(11,20),
                new CallableCounter(21,30),
                new CallableCounter(31,40)
        };

        ExecutorService executorService = Executors.newFixedThreadPool(4);
        for (CallableCounter counter : counters) {
            Future<Integer> result = executorService.submit(counter);
            Integer intResult = result.get();
            System.out.println("RESULT : " + intResult);
        }

        executorService.shutdown();

        while (!executorService.isTerminated()) {
            executorService.shutdownNow();
        }

        System.out.println("Finished....");


    }
}
