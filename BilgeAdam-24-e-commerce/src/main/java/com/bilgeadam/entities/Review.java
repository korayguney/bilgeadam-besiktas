package com.bilgeadam.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Table;

@Data
@NoArgsConstructor
@Entity
@Table(name = "reviews")
public class Review extends AbstractEntity{
    private String description;
    private Long rating;
    private String title;


}
