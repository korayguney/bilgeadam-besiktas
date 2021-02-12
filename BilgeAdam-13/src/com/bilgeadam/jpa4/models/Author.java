package com.bilgeadam.jpa4.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Author {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String author_fullname;
    private String auther_address;

    @OneToMany(mappedBy = "author")
    private List<Book> books = new ArrayList<>();

    public Author(){

    }

    public Author(String author_fullname, String auther_address) {
        this.author_fullname = author_fullname;
        this.auther_address = auther_address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAuthor_fullname() {
        return author_fullname;
    }

    public void setAuthor_fullname(String author_fullname) {
        this.author_fullname = author_fullname;
    }

    public String getAuther_address() {
        return auther_address;
    }

    public void setAuther_address(String auther_address) {
        this.auther_address = auther_address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Author{" +
                "id=" + id +
                ", author_fullname='" + author_fullname + '\'' +
                ", auther_address='" + auther_address + '\'' +
                '}';
    }
}
