package com.sip.javaBasics;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;

public class AboutDate {

    public static void main(String[] args) throws InterruptedException {
        LocalDate date = LocalDate.now();
        LocalDate yesterday = date.minusDays(1);
        LocalDate tomorrow = yesterday.plusDays(2);

        System.out.println(date);
        System.out.println(yesterday);
        System.out.println(tomorrow);

        System.out.println("**************************************");
        Date date1 = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("MMM/dd/yyyy hh:mm:ss");
        String strDate= formatter.format(date1);
        System.out.println(strDate);

        System.out.println("**************************************");


        long millis=System.currentTimeMillis();
        System.out.println("Start Time :: " + millis);

        Thread.sleep(3000);

        long millis1=System.currentTimeMillis();
        System.out.println("End Time :: "+   millis1);

        long diff = millis1 - millis;
        System.out.println("Diff :: " + diff);


        //java.util.Date date2=new java.util.Date(millis);
        //System.out.println(date2);
    }
}
