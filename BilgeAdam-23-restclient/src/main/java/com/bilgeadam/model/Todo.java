package com.bilgeadam.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Todo extends TodoBaseRequest {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int todoId;
    private int id;
    private int userId;
    private String title;
    private String completed;

}
