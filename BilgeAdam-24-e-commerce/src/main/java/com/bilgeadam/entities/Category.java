package com.bilgeadam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "categories")
public class Category extends AbstractEntity{
    private String description;
    private String name;

}
