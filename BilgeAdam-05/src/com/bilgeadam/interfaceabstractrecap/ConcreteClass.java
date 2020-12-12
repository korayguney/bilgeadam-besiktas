package com.bilgeadam.interfaceabstractrecap;

public class ConcreteClass extends Abstract1 implements Interface1,Interface4 {

    public static void main(String[] args) {
        //Abstract1 abstract1 = new Abstract1();
        Interface1.baz();
        System.out.println(Interface1.TEST);
        new ConcreteClass().bar();
    }

    @Override
    public double foo1() {
        return 0;
    }

    @Override
    public void bar() {

    }

    @Override
    public void abstractMethod() {

    }

    @Override
    public double foo() {
        return 0;
    }



}
