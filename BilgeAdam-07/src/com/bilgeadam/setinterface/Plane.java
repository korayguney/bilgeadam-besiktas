package com.bilgeadam.setinterface;

import java.util.Objects;

public class Plane implements Comparable<Plane> {

    private long id;
    private String name;
    private PlaneType planeType;

    public Plane(long id, String name, PlaneType planeType) {
        this.id = id;
        this.name = name;
        this.planeType = planeType;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PlaneType getPlaneType() {
        return planeType;
    }

    public void setPlaneType(PlaneType planeType) {
        this.planeType = planeType;
    }

    public String displayInformation(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "Plane{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", planeType=" + planeType +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Plane plane = (Plane) o;
        return id == plane.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public int compareTo(Plane plane) {
        int compare = plane.getName().compareTo(this.getName());
        if(compare == 0) {
            return 0;
        } else if(compare > 0) {
            return 1;
        } else if(compare < 0) {
            return -1;
        }
        return 0;
    }
}
