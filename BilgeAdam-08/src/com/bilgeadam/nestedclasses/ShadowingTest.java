package com.bilgeadam.nestedclasses;

public class ShadowingTest {

    private int x = 10;

    // member inner class
    private class InnerClass {
        private int x = 100;

        public void testShadowing(int x) {
            System.out.println("x : " + x); // 10000
            System.out.println("this.x : " + this.x); // 100
            System.out.println("ShadowingTest.this.x : " + ShadowingTest.this.x); // 10
        }
    }

    public static void main(String[] args) {
        ShadowingTest.InnerClass innerClass = new ShadowingTest().new InnerClass();
        innerClass.testShadowing(10000);
    }

}
