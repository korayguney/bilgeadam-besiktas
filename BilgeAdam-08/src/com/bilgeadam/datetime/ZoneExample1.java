package com.bilgeadam.datetime;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class ZoneExample1 {

    public static void main(String[] args) {

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm , dd MMM yyyy");
        LocalDateTime ldt = LocalDateTime.of(2021, Month.JUNE, 22, 17, 25);

        System.out.println("LocalDateTime : " + formatter.format(ldt));

       // UTC +3
        ZonedDateTime istDateTime = ldt.atZone(ZoneId.of("Europe/Istanbul"));
        System.out.println("Depart : " + formatter.format(istDateTime));

        // UTC +8 and flight duration is 10 hours
        ZonedDateTime taipeiDateTime = istDateTime.withZoneSameInstant(ZoneId.of("Asia/Taipei")).plusHours(10);
        System.out.println("Arrive : " + formatter.format(taipeiDateTime));



    }


}
