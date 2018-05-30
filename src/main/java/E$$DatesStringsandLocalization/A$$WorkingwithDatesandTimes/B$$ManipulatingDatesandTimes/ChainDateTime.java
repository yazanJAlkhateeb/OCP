package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.B$$ManipulatingDatesandTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;

public class ChainDateTime {
    public static void main(String[] args) {
       /* It is common for date and time methods to be chained. For example, without the print
        statements, the previous example could be rewritten as follows:*/
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(5, 15);
        LocalDateTime dateTime = LocalDateTime.of(date, time)
                .minusDays(1).minusHours(10).minusSeconds(30);
        System.out.println(dateTime);

       /* When you have a lot of manipulations to make, this chaining comes in handy. There are
        two ways that the exam creators can try to trick you. What do you think this prints?*/
                LocalDate date3 = LocalDate.of(2020, Month.JANUARY, 20);
        date3.plusDays(10);
        System.out.println(date3);//no change as date is immutable
    }
}
