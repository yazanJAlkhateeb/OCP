package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.D$$WorkingwithDurations;

import java.time.Duration;
import java.time.temporal.ChronoUnit;

public class CreationalSamples {

    public static void main(String[] args) {
        Duration duration1=Duration.of(1, ChronoUnit.YEARS);
        Duration duration2=Duration.ofDays(1);
        Duration duration5=Duration.ofHours(1);
        Duration duration4=Duration.ofMinutes(1);
        Duration duration3=Duration.ofSeconds(1);
        Duration duration6=Duration.ofNanos(1);
        Duration duration9=Duration.ofMillis(1);
    }

}
