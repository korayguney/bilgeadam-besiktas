package com.bilgeadam.iotest;

public class Product {
    private String pType;
    private String pBrand;
    private int pPrice;

    public Product(String pType, String pBrand, int pPrice) {
        this.pType = pType;
        this.pBrand = pBrand;
        this.pPrice = pPrice;
    }

    public String getpType() {
        return pType;
    }

    public void setpType(String pType) {
        this.pType = pType;
    }

    public String getpBrand() {
        return pBrand;
    }

    public void setpBrand(String pBrand) {
        this.pBrand = pBrand;
    }

    public int getpPrice() {
        return pPrice;
    }

    public void setpPrice(int pPrice) {
        this.pPrice = pPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "pType='" + pType + '\'' +
                ", pBrand='" + pBrand + '\'' +
                ", pPrice=" + pPrice +
                '}';
    }
}
