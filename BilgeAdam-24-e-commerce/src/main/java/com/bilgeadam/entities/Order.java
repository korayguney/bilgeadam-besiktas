package com.bilgeadam.entities;

import com.bilgeadam.entities.enums.OrderStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.ZonedDateTime;
import java.util.Date;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
public class Order extends AbstractEntity{

    @Embedded
    private Address shipmentAddress;

    @Column(name = "shipped")
    private ZonedDateTime shipped;

    @NotNull
    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private OrderStatus status;

    @NotNull
    @Column(precision = 10, scale = 2, nullable = false)
    private BigDecimal total_price;

    @OneToOne
    @JoinColumn(unique = true)
    private Payment payment;

    @OneToMany(mappedBy = "order", fetch = FetchType.LAZY)
    @JsonIgnore
    private Set<OrderItem> orderItems;

    @OneToOne
    @JsonIgnore
    private Cart cart;

    public Order(@NotNull BigDecimal total_price, @NotNull OrderStatus status,
                 ZonedDateTime shipped, Payment payment, Address shipmentAddress,
                 Set<OrderItem> orderItems, Cart cart) {
        this.total_price = total_price;
        this.status = status;
        this.shipped = shipped;
        this.payment = payment;
        this.shipmentAddress = shipmentAddress;
        this.orderItems = orderItems;
        this.cart = cart;
    }
}
