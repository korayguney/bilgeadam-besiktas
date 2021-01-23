package com.bilgeadam.loginexample;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginMain {
    public static void main(String[] args) throws SQLException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write your username :");
        String username = scanner.nextLine();

        System.out.println("Write your password :");
        String password = scanner.nextLine();

        boolean result = JDBCUtils.isUserOnDb(username, password);

        if (result) {
            System.out.println("Welcome " + username);
        } else {
            System.err.println("There is no user on DB!!!");
        }


    }
}
