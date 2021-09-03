package com.bilgeadam.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
public class Address {
    private String street;
    private String city;
    private int postalCode;
}
