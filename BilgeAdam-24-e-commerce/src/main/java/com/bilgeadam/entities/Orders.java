package com.bilgeadam.entities;

import com.bilgeadam.entities.enums.OrderStatus;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import java.math.BigDecimal;
import java.util.Date;

@Data
@NoArgsConstructor
@Entity
public class Orders extends AbstractEntity{

    @Embedded
    private Address address;

    private Date shipped;

    private OrderStatus status;

    private BigDecimal total_price;


}
