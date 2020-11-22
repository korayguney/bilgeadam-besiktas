package com.bilgeadam.shadowing;

public class ShodowingTest {
    // Instance variable
    private String test = "First test";

    public void setTest(String test) {
        this.test = test;
    }

    public String getTest() {
        return test;
    }

    public static void main(String[] args) {
        ShodowingTest ts = new ShodowingTest();
        ts.setTest("Second Test");
        System.out.println(ts.getTest());

    }
}
