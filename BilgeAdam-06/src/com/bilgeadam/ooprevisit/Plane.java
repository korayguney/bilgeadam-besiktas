package com.bilgeadam.ooprevisit;

public class Plane {

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
}
