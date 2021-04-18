package com.bilgeadam.model;

import lombok.Data;

import javax.persistence.MappedSuperclass;
import java.time.LocalDate;

@Data
@MappedSuperclass
public class TodoBaseRequest {
    private LocalDate localDate;

}
