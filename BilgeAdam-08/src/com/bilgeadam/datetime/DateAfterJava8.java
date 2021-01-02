package com.bilgeadam.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Set;

public class DateAfterJava8 {

    public static void main(String[] args) {
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date : " + currentDate);

        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time : " + currentTime);

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println("Current date time : " + currentDateTime);

        System.out.println(currentDate.format(DateTimeFormatter.ofPattern("dd/MM/YY , E")));
        System.out.println(currentTime.format(DateTimeFormatter.ofPattern("HH:mm ")));

        System.out.println("-----------------------------");
        LocalDate anotherDay = LocalDate.of(2021, Month.JUNE, 23);
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).format(anotherDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).format(anotherDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).format(anotherDay));
        System.out.println(DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).format(anotherDay));

        System.out.println("-----------------------------");
        Set<String> allZoneIds = ZoneId.getAvailableZoneIds();

        for (String allZoneId : allZoneIds) {
             System.out.println(allZoneId);
        }

        ZoneId zoneId = ZoneId.of("Europe/Zurich");
        System.out.println(zoneId);

        ZonedDateTime zonedDateTime = ZonedDateTime.of(LocalDateTime.of(2011, 5, 11, 10, 45), zoneId);
        System.out.println(zonedDateTime);

        System.out.println("------------------");
        LocalDate anotherNextDay = LocalDate.of(2021, Month.JUNE, 23);
        System.out.println(anotherNextDay.isLeapYear());

        LocalDate newDate = anotherNextDay.plusWeeks(12);
        System.out.println(newDate);

        System.out.println("------------------");
        long res =  ChronoUnit.HOURS.between(LocalDateTime.now().atZone(ZoneId.of("Europe/Istanbul")),
                LocalDateTime.now().atZone(ZoneId.of("America/Argentina/Buenos_Aires")));
        System.out.println(res);

        System.out.println("---------PERIOD---------");
        LocalDate localDate = LocalDate.parse("2007-05-30");
        LocalDate localDate2 = localDate.plus(Period.ofDays(7));
        System.out.println(localDate2);
        int days = Period.between(localDate, localDate2).getDays();
        System.out.println("Days : " + days);

        System.out.println("-------------Compatibility with legacy date------------");
        Date date = new Date();
        LocalDateTime now = LocalDateTime.ofInstant(date.toInstant(), ZoneId.systemDefault());
        System.out.println(now.getDayOfWeek());


    }
}
