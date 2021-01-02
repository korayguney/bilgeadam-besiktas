package com.bilgeadam.nestedclasses;

public class OuterClass {

    //static inner (nested) class
    public static class StaticInnerClass {
        public static void printInfo() {
            System.out.println("In the static inner class");
        }
    }

    // Member (instance) inner (nested) class
    public class MemberInnerClass {
        public void printInfo() {
            System.out.println("In the member inner class");
        }
    }

    public void printInfoLocalClass(int a) {
        // local inner(nested) class
        class LocalInnerClass {
            public void printInfo() {
                System.out.println("In the local inner class :" + a);
            }
        }
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.printInfo();
    }

    public static void main(String[] args) {

        StaticInnerClass.printInfo();

        MemberInnerClass memberInnerClass = new OuterClass().new MemberInnerClass();
        memberInnerClass.printInfo();

        new OuterClass().printInfoLocalClass(1);
    }
}

