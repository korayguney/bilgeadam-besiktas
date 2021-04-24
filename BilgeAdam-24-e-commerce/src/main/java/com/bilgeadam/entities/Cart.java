package com.bilgeadam.entities;


import com.bilgeadam.entities.enums.CartStatus;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Data
@NoArgsConstructor
@Entity
@Table(name = "carts")
public class Cart extends AbstractEntity {

    @NotNull
    @Enumerated(EnumType.STRING)
    private CartStatus status;



}
