package com.bilgeadam.ooprevisit;

import java.time.LocalDateTime;
import java.util.List;

public class Flight {
    private long id;
    private String destination;
    private String departure;
    private LocalDateTime departureTime;
    private LocalDateTime arrivalTime;
    private boolean isCanceled;
    private Plane plane;
    private List<Pilot> pilots;

    public Flight(long id, String destination, String departure, LocalDateTime departureTime, LocalDateTime arrivalTime, boolean isCanceled, Plane plane, List<Pilot> pilots) {
        this.id = id;
        this.destination = destination;
        this.departure = departure;
        this.departureTime = departureTime;
        this.arrivalTime = arrivalTime;
        this.isCanceled = isCanceled;
        this.plane = plane;
        this.pilots = pilots;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public LocalDateTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalDateTime departureTime) {
        this.departureTime = departureTime;
    }

    public LocalDateTime getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(LocalDateTime arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public boolean isCanceled() {
        return isCanceled;
    }

    public void setCanceled(boolean canceled) {
        isCanceled = canceled;
    }

    public Plane getPlane() {
        return plane;
    }

    public void setPlane(Plane plane) {
        this.plane = plane;
    }

    public List<Pilot> getPilots() {
        return pilots;
    }

    public void setPilots(List<Pilot> pilots) {
        this.pilots = pilots;
    }

    public String displayInformation(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", destination='" + destination + '\'' +
                ", departure='" + departure + '\'' +
                ", departureTime=" + departureTime +
                ", arrivalTime=" + arrivalTime +
                ", isCanceled=" + isCanceled +
                ", plane=" + plane.displayInformation() +
                ", pilots=" + pilots +
                '}';
    }
}
