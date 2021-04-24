package com.bilgeadam.entities;


import com.bilgeadam.entities.enums.CartStatus;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
@Table(name = "carts")
public class Cart extends AbstractEntity {

    @NotNull
    @Enumerated(EnumType.STRING)
    private CartStatus status;

    @ManyToOne
    private Customer customer;

    private Integer cartNo;

    public Cart(Customer customer) {
        this.customer = customer;
        this.status = CartStatus.NEW;
    }

    public Cart(@NotNull CartStatus status, Customer customer) {
        this.customer = customer;
        this.status = status;
    }
}
