package com.bilgeadam.accessmodifiers2;

import com.bilgeadam.accessmodifiers1.AccessVariables;

public class AccessVariablesTest extends AccessVariables {

    public static void main(String[] args) {
        AccessVariablesTest av = new AccessVariablesTest();

        System.out.println(av.a);
        // av.b;  --> private
        System.out.println(av.c); // --> protected
        // av.d;
    }
}
