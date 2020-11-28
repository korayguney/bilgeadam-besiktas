package com.bilgeadam.stringbufferbuilder;

public class TestStrBufferAndBuilder {

    public static void main(String[] args) {

        // mutable (değiştirilebilir)
        // syncronized (thread-safe)
        StringBuffer strBuffer = new StringBuffer();
        strBuffer.append("Koray ");
        System.out.println("String Buffer memory ID : "+strBuffer.hashCode());
        strBuffer.append("Güney");
        System.out.println("String Buffer memory ID : "+strBuffer.hashCode());
        System.out.println("String Buffer : " + strBuffer);

        // mutable (değiştirilebilir)
        // asyncronized (non-thread-safe)
        // faster then StringBuffer
        StringBuilder strBuilder = new StringBuilder();
        strBuilder.append("Koray ");
        System.out.println("String Builder memory ID : "+strBuilder.hashCode());
        strBuilder.append("Güney");
        System.out.println("String Builder memory ID : "+strBuilder.hashCode());
        System.out.println("String Builder : " + strBuilder);

        // String
        // immutable
        String str = "Koray ";
        System.out.println("String memory ID : "+str.hashCode());
        str += "Güney";
        System.out.println("String memory ID : "+str.hashCode());
        System.out.println("String : " + strBuilder);

    }


}
