package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.A$$CreatingDatesandTimes;

import java.time.ZoneId;

public class FindingTimeZone {
    public static void main(String[] args) {
        /*You can just print out
         */
        ZoneId.systemDefault();

                /*.If you

        don’t know what another time zone is, Java provides a method to list the supported ones.
        Using the functional programming techniques that you’ve learned, you can easily print
        out a sorted list of the ones that are potential candidates:*/
        ZoneId.getAvailableZoneIds().stream()
                .filter(z -> z.contains("US") || z.contains("America"))
                .sorted().forEach(System.out::println);
    }
}
