package com.bilgeadam.functionalinterface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FuncInterface {

    public static void main(String[] args) {

        Predicate<Integer> predicate = new Predicate() {
            @Override
            public boolean test(Object o) {
                return (Integer)o > 10;
            }
        };

        Predicate<Integer> predicate2 = o -> o > 10;

        Predicate predicate3 = new PredicateImpl();

    }

    static class PredicateImpl implements Predicate {

        @Override
        public boolean test(Object o) {
            return false;
        }
    }
}
