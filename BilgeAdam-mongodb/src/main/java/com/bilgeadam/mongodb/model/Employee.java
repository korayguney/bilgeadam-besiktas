package com.bilgeadam.mongodb.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@Document
public class Employee {
    @Id
    private String id;
    private String firstname;
    private String lastname;

    @Indexed(unique = true)
    private long ssid;
    private BigDecimal salary;
    private Gender gender;
    private Address address;
    private List<String> workedCompanies;
    private LocalDateTime createdDateTime;

    public enum Gender {
        MALE, FEMALE;
    }

    public Employee(String firstname, String lastname, long ssid, BigDecimal salary, Gender gender, Address address, List<String> workedCompanies, LocalDateTime createdDateTime) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssid = ssid;
        this.salary = salary;
        this.gender = gender;
        this.address = address;
        this.workedCompanies = workedCompanies;
        this.createdDateTime = createdDateTime;
    }
}
