package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.E$$WorkingWithInstants;

import java.time.Duration;
import java.time.Instant;

public class Concept {
   /* You cannot convert a LocalDateTime to an Instant . Remember that an Instant is a
    point in time. A LocalDateTime does not contain a time zone, and it is therefore not univer-
    sally recognized around the world as the same moment in time.*/
    public static void main(String[] args) {
        Instant now = Instant.now();
// do something time consuming
        Instant later = Instant.now();

        Duration duration = Duration.between(now, later);
        System.out.println(duration.toMillis());
    }
}
