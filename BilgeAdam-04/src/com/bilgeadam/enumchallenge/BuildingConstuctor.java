package com.bilgeadam.enumchallenge;

public class BuildingConstuctor {

    public static void main(String[] args) {

        // Ground Floor
        Flat studio1 = new Flat(1,1,FlatType.STUDIO);
        Flat studio2 = new Flat(2,1,FlatType.STUDIO);
        Flat studio3 = new Flat(3,1,FlatType.STUDIO);
        Flat studio4 = new Flat(4,1,FlatType.STUDIO);
        Flat studio5 = new Flat(5,1,FlatType.STUDIO);

        Flat[] groundFloorFlats = {studio1, studio2, studio3, studio4, studio5};

        Floor groundFloor = new Floor(0, groundFloorFlats);

        // First Floor
        Flat apt1 = new Flat(6,3,FlatType.APARTMENT);
        Flat apt2 = new Flat(7,3,FlatType.APARTMENT);
        Flat apt3 = new Flat(8,3,FlatType.APARTMENT);
        Flat apt4 = new Flat(9,3,FlatType.APARTMENT);

        Flat[] firstFloorFlats = {apt1, apt2, apt3, apt4 };

        Floor firstFloor = new Floor(1, firstFloorFlats);

        // Second Floor
        Flat residence1 = new Flat(10,4,FlatType.RESIDENCE);
        Flat residence2 = new Flat(11,4,FlatType.RESIDENCE);

        Flat[] secondFloorFlats = {residence1, residence2 };

        Floor secondFloor = new Floor(2, secondFloorFlats);

        // build Building
        Address address = new Address("İstiklal street", 23);

        Floor[] floors = {groundFloor, firstFloor, secondFloor};

        Building atlasApartment = new Building(address, floors);

        // print price and info

        System.out.println(atlasApartment.getInfo());
        System.out.println("--------------------------------");
        System.out.println("TOTAL PRICE : " + atlasApartment.getPrice());

    }


}
