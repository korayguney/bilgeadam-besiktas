package com.bilgeadam.setinterface;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExampleWithObject {
    public static void main(String[] args) {
        Plane boeing737 = new Plane(2345, "Ankara", PlaneType.LARGEJET);
        Plane boeing777 = new Plane(545, "Istanbul", PlaneType.LARGEJET);
        Plane f16 = new Plane(4, "Kartal", PlaneType.SMALLJET);

        Set<Plane> planeSet = new TreeSet<>();
        planeSet.add(boeing737);
        planeSet.add(boeing777);
        planeSet.add(f16);

        for (Plane plane : planeSet) {
            System.out.println(plane);
        }


    }


}
