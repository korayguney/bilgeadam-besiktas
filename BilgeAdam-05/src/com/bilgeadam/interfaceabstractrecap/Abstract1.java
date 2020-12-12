package com.bilgeadam.interfaceabstractrecap;

public abstract class Abstract1 {
    private double dbl;

    /*
        Concrete method
     */
    public String hello(String text){
        return "Hello " + text;
    }

    /*
        Abstract method
     */
    public abstract void abstractMethod();


}
