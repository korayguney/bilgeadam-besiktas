package com.bilgeadam.aggregationcomposionchallenge;

public class Book {
    private String name;
    private int quantity;
    private double price;
    private Author author;

    public Book(String name, int quantity, double price, Author author) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.author = author;
    }

    public Book(String name, double price, Author author) {
        this.name = name;
        this.price = price;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Author getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", price=" + price +
                ", author=" + author +
                '}';
    }
}
