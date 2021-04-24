package com.bilgeadam.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import java.util.List;
import java.util.Set;

@Data
@NoArgsConstructor
@Entity
@Table(name = "customers")
public class Customer extends AbstractEntity {
    private String firstname;
    private String lastname;
    @Email
    private String email;
    private String telephone;
    private boolean enabled;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private Set<Cart> carts;

    public Customer(String firstname, String lastname, @Email String email, String telephone, boolean enabled) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.email = email;
        this.telephone = telephone;
        this.enabled = enabled;
    }


}
