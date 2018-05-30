package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.D$$WorkingwithDurations;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitforDifferences {
    public static void main(String[] args) {
       /* ChronoUnit is a great way to determine how far apart two Temporal values are. Temporal
        includes LocalDate , LocalTime , and so on.*/
        LocalTime one = LocalTime.of(5, 15);
        LocalTime two = LocalTime.of(6, 30);
        LocalDate date = LocalDate.of(2016, 1, 20);
        System.out.println(ChronoUnit.HOURS.between(one, two));
// 1
        System.out.println(ChronoUnit.MINUTES.between(one, two)); // 75
        System.out.println(ChronoUnit.MINUTES.between(one, date)); // DateTimeException
  //   The first print statement shows that between truncates rather than rounds. The second shows
  //    how easy it is to count in different units. Just change the ChronoUnit type. The last reminds
  //    us that Java will throw an exception if we mix up what can be done on date vs. time objects.
    }
}
