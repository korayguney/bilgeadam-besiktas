package com.bilgeadam.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Embeddable
public class Address extends AbstractEntity{

    private String address1;
    private String address2;
    private String city;
    private String country;
    private String postcode;

}
