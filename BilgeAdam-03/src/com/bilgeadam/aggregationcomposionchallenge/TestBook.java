package com.bilgeadam.aggregationcomposionchallenge;

public class TestBook {
    public static void main(String[] args) {

        Author author1 = new Author("Buket Uzuner","bk@gmail.com",'f');
        Author author2 = new Author("Orhan Pamuk","op@gmail.com",'m');
        Author[] authors = {author1, author2};


        //Book book = new Book("Uzun ince bulut Gelibolu",100,34.5,author1);
        Book book = new Book("Uzun ince bulut Gelibolu",100,34.5,authors);

        System.out.println(book);
    }
}
