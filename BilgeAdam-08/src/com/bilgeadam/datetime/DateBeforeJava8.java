package com.bilgeadam.datetime;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateBeforeJava8 {
    public static void main(String[] args) {

        System.out.println("--------- DATE ---------");
        Date date = new Date();
        System.out.println("Current date : "+ date);

        long currentTime = System.currentTimeMillis();
        System.out.println("Current time : "  + currentTime);
        Date date2 = new Date(currentTime);
        System.out.println("Current date 2 : "+ date2);
        date2.setHours(21);
        System.out.println("Updated date : "+ date2);

        long currentTime2 = date2.getTime();
        System.out.println("Current time 2: "  + currentTime2);

        SimpleDateFormat sdf =  new SimpleDateFormat("DD/MM/YYYY , hh:mm:ss a");
        System.out.println("Formatted date : "+sdf.format(date));

        Date newDate = (Date)date.clone();
        System.out.println("New Date : "+newDate);

        String result = date.compareTo(date2)>0 ? "later then first date":"before then first date";
        System.out.println("Compare result : " + result);
        System.out.println(date.before(date2));

        String strDate = "12/10/2011 , 23:35";
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/YYYY , HH:mm");
        try {
            Date parsedDate = format.parse(strDate);
            System.out.println("Parsed date : "+parsedDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        System.out.println("--------- CALENDER ---------");
        Calendar calendar = Calendar.getInstance();

       // System.out.println("Calender : " + calendar);
        System.out.println("Time zone is : " + calendar.getTimeZone());

        Date date3 = calendar.getTime();
        System.out.println("Current date from calender : " + date3);

        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        calendar.add(Calendar.DAY_OF_YEAR, -365);
        System.out.println(calendar.getTime());

    }
}
