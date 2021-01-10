package com.bilgeadam.streamvsparallelstream;

import com.bilgeadam.threadcolor.ThreadColor;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class StreamVsParallelStream {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        System.out.println("Start adding numbers .......");
        for (int i = 0; i < 5000; i++) {
            numbers.add(i);
        }
        System.out.println("......... Added numbers to list");
        List<Integer> numbersSync = new ArrayList<>();
        List<Integer> numbersAsync = new ArrayList<>();

        System.out.println("Start sync .....");
        Instant startSync = Instant.now();
        numbers.stream().forEach(i -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numbersSync.add(i);
        });
        Instant stopSync = Instant.now();
        System.out.println("Sync  : " + Duration.between(startSync, stopSync));

        System.out.println("Start Async .....");
        startSync = Instant.now();
        numbers.parallelStream().forEach(i -> {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            numbersAsync.add(i);
        });
        stopSync = Instant.now();
        System.out.println("Async  : " + Duration.between(startSync, stopSync));

    }
}
