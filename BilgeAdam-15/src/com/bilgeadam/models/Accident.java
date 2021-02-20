package com.bilgeadam.models;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Accident {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private LocalDate accidentDate;

    @ManyToMany(mappedBy = "accidents")
    private List<Vehicle> vehicles = new ArrayList<>();

    public Accident(LocalDate accidentDate) {
        this.accidentDate = accidentDate;
    }

    public Accident() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public void setVehicles(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public LocalDate getAccidentDate() {
        return accidentDate;
    }

    public void setAccidentDate(LocalDate accidentDate) {
        this.accidentDate = accidentDate;
    }

    @Override
    public String toString() {
        return "Accident{" +
                "accidentDate=" + accidentDate +
                '}';
    }
}
