package com.bilgeadam.ooprevisit;

import java.time.DayOfWeek;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class TestFlight {
    public static void main(String[] args) {
        Plane boeing737 = new Plane(2345, "Ankara", PlaneType.LARGEJET);

        Pilot primaryPilot = new Pilot(12,"Ali Kaptan",46,24,PilotStatus.PRIMARY);
        Pilot secondaryPilot = new Pilot(34,"Ayşe Kaptan",35,13,PilotStatus.SECONDARY);

        List<Pilot> pilots = new ArrayList<>(2);
        pilots.add(primaryPilot);
        pilots.add(secondaryPilot);

        Flight flight = new Flight(234,"Ankara","Istanbul",
                LocalDateTime.of(2020, Month.DECEMBER, 14, 13, 45),
                LocalDateTime.of(2020, Month.DECEMBER, 14, 14, 45),
                false,
                boeing737,
                pilots);

        System.out.println(flight.displayInformation());






    }
}
