package com.bilgeadam.exceptionchallenge;

public class VotingTest {

    public static void main(String[] args) {
        try {
            getAge(8);
        } catch (NotEligibleForVotingException e) {
            e.printStackTrace();
        }
    }

    public static void getAge(int age) throws NotEligibleForVotingException{
        if(age < 18){
            throw new NotEligibleForVotingException("Too young for voting");
        }
        System.out.println("Eligible to vote");
    }


}
