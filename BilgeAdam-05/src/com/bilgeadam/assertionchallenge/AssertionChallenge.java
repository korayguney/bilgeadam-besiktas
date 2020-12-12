package com.bilgeadam.assertionchallenge;

public class AssertionChallenge {

    public static void main(String[] args) {
        setTime(15,45,25);
    }


    public static void setTime(int hour,int minute,int second){
        assert ((hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second <60)) : "Time is wrongly set";
        assert (minute < 30) : "TEST";
        System.out.printf("The time is %d:%d:%d ", hour,minute,second);
    }


}
