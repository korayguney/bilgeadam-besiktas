package com.bilgeadam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import java.math.BigInteger;

@Data
@NoArgsConstructor
@Entity
@Table(name = "products")
public class Products extends AbstractEntity{
    private String description;
    private String name;
    private BigDecimal price;
    private int sales_counter;
    private String status;
    private BigInteger category_id;

    public Products(String description, String name, BigDecimal price, int sales_counter, String status, BigInteger category_id) {
        this.description = description;
        this.name = name;
        this.price = price;
        this.sales_counter = sales_counter;
        this.status = status;
        this.category_id = category_id;
    }
}
