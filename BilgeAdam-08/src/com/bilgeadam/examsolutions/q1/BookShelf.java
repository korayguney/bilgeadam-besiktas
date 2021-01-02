package com.bilgeadam.examsolutions.q1;

import java.util.Arrays;

public class BookShelf implements I_PickUp{

    private Book[] books;

    public BookShelf(Book[] books) {
        this.books = books;
    }

    public Book[] getBooks() {
        return books;
    }

    public void setBooks(Book[] books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "BookShelf{" +
                "books=" + Arrays.toString(books) +
                '}';
    }

    public String getInfo(){
        return this.toString();
    }

    @Override
    public Book pickUpBook(int index) {
        return books[index];
    }
}
