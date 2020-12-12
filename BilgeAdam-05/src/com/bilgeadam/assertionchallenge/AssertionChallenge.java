package com.bilgeadam.assertionchallenge;

public class AssertionChallenge {

    public static void main(String[] args) {
        setTime(15,65,25);
    }


    public static void setTime(int hour,int minute,int second){
        assert ((hour >= 0 && hour < 24) && (minute >= 0 && minute < 60) && (second >= 0 && second <60)) : "Time is wrongly set";
        System.out.printf("The time is %d:%d:%d ", hour,minute,second);
    }


}
