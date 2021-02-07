package com.bilgeadam.jpa4.models;

import com.bilgeadam.jpa4.listeners.LoadDataListener;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@EntityListeners(value = {LoadDataListener.class})
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id", length = 45, nullable = false, unique = true)
    private int id;

    @Column(name = "book_title", length = 100, nullable = false, unique = false)
    private String bookname;
    private long ISBNNumber;
    private double book_price;

    @Enumerated(EnumType.STRING)
    private Category category;

    @ManyToMany
    private List<Library> libraries = new ArrayList<>();

    @ManyToOne
    private Author author;

    public Book(String bookname, long ISBNNumber, double book_price) {
        this.bookname = bookname;
        this.ISBNNumber = ISBNNumber;
        this.book_price = book_price;
    }

    public Book() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookname() {
        return bookname;
    }

    public void setBookname(String bookname) {
        this.bookname = bookname;
    }

    public long getISBNNumber() {
        return ISBNNumber;
    }

    public void setISBNNumber(long ISBNNumber) {
        this.ISBNNumber = ISBNNumber;
    }

    public double getBook_price() {
        return book_price;
    }

    public void setBook_price(double book_price) {
        this.book_price = book_price;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public List<Library> getLibraries() {
        return libraries;
    }

    public void setLibraries(List<Library> libraries) {
        this.libraries = libraries;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", bookname='" + bookname + '\'' +
                ", ISBNNumber=" + ISBNNumber +
                ", book_price=" + book_price +
                '}';
    }
}
