package com.bilgeadam.jpa4.models;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String lib_name;
    private String lib_address;

    @ManyToMany(mappedBy = "libraries")
    private List<Book> books = new ArrayList<>();

    public Library(String lib_name, String lib_address) {
        this.lib_name = lib_name;
        this.lib_address = lib_address;
    }

    public Library(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLib_name() {
        return lib_name;
    }

    public void setLib_name(String lib_name) {
        this.lib_name = lib_name;
    }

    public String getLib_address() {
        return lib_address;
    }

    public void setLib_address(String lib_address) {
        this.lib_address = lib_address;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @Override
    public String toString() {
        return "Library{" +
                "id=" + id +
                ", lib_name='" + lib_name + '\'' +
                ", lib_address='" + lib_address + '\'' +
                '}';
    }
}
