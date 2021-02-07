package com.bilgeadam.jpa4.models;


public enum Category {
    SCI_FI("Sci-fi"),
    HORROR("Horror"),
    POLICY("Policy"),
    DRAMA("Drama"),
    FANTASTIC("Fantastic"),
    KIDS("Kids");

    private String categoryname;

    private Category(String categoryname){
        this.categoryname = categoryname;
    }

    public String getCategoryname() {
        return categoryname;
    }
}
