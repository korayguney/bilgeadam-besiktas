package com.bilgeadam.model;

import lombok.*;
import org.springframework.format.annotation.NumberFormat;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @NotBlank(message = "Name is mandatory")
    private String name;

    @NotBlank(message = "Email is mandatory")
    @Email(message = "Email format is wrong!")
    private String email;

    @Min(value = 0, message = "The age cannot be less than 0")
    @Max(value = 120, message = "The age cannot be greater than 0")
    @NumberFormat(style = NumberFormat.Style.NUMBER)
    private Integer age;

}
