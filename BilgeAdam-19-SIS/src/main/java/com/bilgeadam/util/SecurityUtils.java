package com.bilgeadam.util;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class SecurityUtils {
    public static StringBuilder hassPassword(String password, HashAlgorithm hashAlgorithm){
        StringBuilder str = new StringBuilder();

        try {
            MessageDigest messageDigest = MessageDigest.getInstance(hashAlgorithm.getHashAlg());
            byte[] hashedPassword = messageDigest.digest(password.getBytes(StandardCharsets.UTF_8));

            for (byte b : hashedPassword) {
                str.append(String.format("%02x",b));
            }

        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        return str;
    }

    public static void main(String[] args) {
        String password = "1234";
        System.out.println("Plain password : " + password);
        StringBuilder str = hassPassword("1234",HashAlgorithm.SHA1);
        System.out.println("Hashed password : " + str);
    }

}
