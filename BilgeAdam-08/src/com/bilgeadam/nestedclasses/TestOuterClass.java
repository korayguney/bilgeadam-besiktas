package com.bilgeadam.nestedclasses;

import java.io.OutputStream;

public class TestOuterClass {
    public static void main(String[] args) {
        OuterClass.StaticInnerClass staticInnerClass = new OuterClass.StaticInnerClass();
        staticInnerClass.printInfo();

        OuterClass.MemberInnerClass memberInnerClass = new OuterClass().new MemberInnerClass();
        memberInnerClass.printInfo();
    }
}
