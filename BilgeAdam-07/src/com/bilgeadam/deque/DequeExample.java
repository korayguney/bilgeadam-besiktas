package com.bilgeadam.deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeExample {
    public static void main(String[] args) {
        Deque<String> dequeArr = new ArrayDeque<>(); // LIFO [Last in first out]
        dequeArr.push("Ali");
        dequeArr.push("Veli");
        dequeArr.push("Hasan");
        dequeArr.push("Fatma");
        //dequeArr.add("Koray");
        dequeArr.addFirst("Koray");
        dequeArr.addLast("Lale");
        dequeArr.pop();

        System.out.println("peek --> "+dequeArr.peek());

        for (String s : dequeArr) {
            System.out.println(s);
        }



    }
}
