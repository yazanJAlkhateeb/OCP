package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.A$$CreatingDatesandTimes;

import java.time.LocalDate;
import java.time.Month;

public class InvalidDateTimes {
public static void main(String[] args) {
/*  Another trick is what happens when you pass invalid numbers to of() , for example:*/
LocalDate.of(2015, Month.JANUARY, 32);// throws DateTimeException

    LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
   // date = date.plusMinutes(1);// DOES NOT COMPILE
    }
}
