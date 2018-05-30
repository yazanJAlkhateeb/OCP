package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.E$$WorkingWithInstants;

import java.time.*;

public class ZonedDateTimeTOInstance {
    public static void main(String[] args) {
        //   If you have a ZonedDateTime , you can turn it into an Instant :
        LocalDate date = LocalDate.of(2015, 5, 25);
        LocalTime time = LocalTime.of(11, 55, 00);
        ZoneId zone = ZoneId.systemDefault();
        ZonedDateTime zonedDateTime = ZonedDateTime.of(date, time, zone);
        Instant instant = zonedDateTime.toInstant();
        // 2015–05–25T15:55:00Z
        System.out.println(zonedDateTime); // 2015–05–25T11:55–04:00[US/Eastern]
        System.out.println(instant); // 2015–05–25T15:55:00Z
    }
}
