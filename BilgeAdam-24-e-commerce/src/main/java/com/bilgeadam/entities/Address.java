package com.bilgeadam.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address {

    private String address1;
    private String address2;
    private String city;
    private String country;
    @Size(max = 10)
    private String postcode;

}
