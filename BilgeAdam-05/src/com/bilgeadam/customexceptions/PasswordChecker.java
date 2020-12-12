package com.bilgeadam.customexceptions;

public class PasswordChecker {
    String user_pass = "koray1234";

    public static void main(String[] args) throws InvalidPasswordException {
        PasswordChecker passwordChecker = new PasswordChecker();
        passwordChecker.setPassword("koray1235");
    }

    public void setPassword(String password) throws InvalidPasswordException{
        if(user_pass.equals(password)){
            System.out.println("Welcome to the system");
        } else {
            throw new InvalidPasswordException("Password is wrong");
        }
    }




}
