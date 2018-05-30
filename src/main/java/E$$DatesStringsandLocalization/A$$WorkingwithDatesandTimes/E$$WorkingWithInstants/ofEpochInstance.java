package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.E$$WorkingWithInstants;

import java.time.Instant;

public class ofEpochInstance {
    public static void main(String[] args) {
      //  If you have the number of seconds since 1970, you can also create an Instant that way:
        Instant instant = Instant.ofEpochSecond(21651651545l);
        System.out.println(instant);
// 2015–05–25T15:55:00Z
    }
}
