package com.bilgeadam.strings;

public class StringTest {

    private static String test = "         Hello Bilgeadam";

    public static void main(String[] args) {

        System.out.println(test.charAt(0));
        test = test.concat(" from Istanbul");
        System.out.println(test);
        boolean res = test.contains("z");
        System.out.println(res);
        boolean res2 = test.equals("Hello Bilgeadam From Istanbul");
        System.out.println(res2);
        boolean res3 = test.equalsIgnoreCase("Hello Bilgeadam From Istanbul");
        System.out.println(res3);
        boolean res4 = test.isEmpty();
        System.out.println(res4);
        int res5 = test.length();
        System.out.println("Lenght : " + res5);
        String[] res6 = test.split("Bilgeadam");
        for (int i = 0; i < res6.length; i++) {
            System.out.println(res6[i]);
        }
        String res7 = test.substring(5);
        System.out.println(res7);
        String res8 = test.toUpperCase();
        System.out.println(res8);
        String res9 = test.trim();
        System.out.println(res9);
    }

}
