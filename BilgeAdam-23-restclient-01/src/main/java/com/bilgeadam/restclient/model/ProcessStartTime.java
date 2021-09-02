package com.bilgeadam.restclient.model;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class ProcessStartTime {
    private String name;
    private String description;
    private String baseUnit;
    private List<Measurement> measurements;
    private List<String> availableTags;

}
