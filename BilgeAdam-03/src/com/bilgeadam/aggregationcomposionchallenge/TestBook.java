package com.bilgeadam.aggregationcomposionchallenge;

public class TestBook {
    public static void main(String[] args) {

        Author author = new Author("Buket Uzuner","bk@gmail.com",'f');
        Book book = new Book("Uzun ince bulut Gelibolu",100,34.5,author);

        System.out.println(book);
    }
}
