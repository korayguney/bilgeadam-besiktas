package com.bilgeadam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "order_items")
public class OrderItems extends AbstractEntity{

    private long quantity;
}
