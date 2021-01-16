package com.bilgeadam.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerClass {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger(5);
        System.out.println("New value: "
                + ai.incrementAndGet());
        System.out.println("New value: "
                + ai.getAndIncrement());
        System.out.println("New value: "
                + ai.getAndIncrement());

    }

}
