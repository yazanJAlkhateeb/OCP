package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.D$$WorkingwithDurations;

import java.time.*;

public class WhatObjectsCanUsedWith {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2015, 1, 20);
        LocalTime time = LocalTime.of(6, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        Duration duration = Duration.ofHours(6);
        System.out.println(dateTime.plus(duration)); // 2015–01–20T12:15
        System.out.println(time.plus(duration));// 12:15
        System.out.println(date.plus(duration));// UnsupportedTemporalException



        LocalDate date2 = LocalDate.of(2015, 5, 25);
        Period period = Period.ofDays(1);
        Duration days = Duration.ofDays(1);

        System.out.println(date2.plus(period)); // 2015–05–26
        System.out.println(date2.plus(days)); // Unsupported unit: Seconds
    }
}
