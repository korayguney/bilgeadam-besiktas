package com.bilgeadam.autoboxing;

import java.util.ArrayList;
import java.util.List;

public class AutoBoxUnBox {

    public static void main(String[] args) {

        // primitive to Wrapper conversion
        int primitiveNum = 2;
        Integer tempInteger = new Integer(primitiveNum);

        // Wrapper to primitive conversion
        Integer intObject = new Integer(1);
        int tempPrimitive = intObject.intValue();

        tempInteger = primitiveNum; // Autoboxing
        tempPrimitive = intObject; // Unboxing

        List<Double> doubleList = new ArrayList<>();
        doubleList.add(3.4); // implicit autoboxing
        doubleList.add(Double.valueOf(3.4)); // explicit autoboxing

        int a = 12; // stack
        Integer b = 12; //heap
        System.out.println(Integer.sum(1, 4));
    }

}
