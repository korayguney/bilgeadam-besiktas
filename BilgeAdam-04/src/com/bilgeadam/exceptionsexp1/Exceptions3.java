package com.bilgeadam.exceptionsexp1;

public class Exceptions3 {
    public static void main(String[] args) {
        System.out.println("Entered main()");
        methodA();
        System.out.println("Exit from main()");
    }

    public static void methodA(){
        System.out.println("Entered methodA()");
        try{
            methodB();
        } catch (ArithmeticException e) {
            System.out.println("Please check your calculation at callstack");
        }
        System.out.println("Exit from methodA()");
    }

    public static void methodB() throws ArithmeticException{
        System.out.println("Entered methodB()");
        methodC();
        System.out.println("Exit from methodB()");
    }

    public static void methodC() throws ArithmeticException{
        System.out.println("Entered methodC()");
        // handling
        /*
        try {
            System.out.println(1/0);
        } catch (ArithmeticException e){
            System.out.println("Please check your calculation numbers");
        }
         */
        System.out.println(1/0);
        System.out.println("Exit from methodC()");

    }

}
