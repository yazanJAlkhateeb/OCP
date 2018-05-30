package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.FormattingDatesandTimes;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class PredefinedFormats {
    //There are two predefined formats that can show up on the exam: SHORT and MEDIUM
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 20);
        LocalTime time = LocalTime.of(11, 12, 34);
        LocalDateTime dateTime = LocalDateTime.of(date, time);
        DateTimeFormatter shortF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.SHORT);
        DateTimeFormatter mediumF = DateTimeFormatter
                .ofLocalizedDateTime(FormatStyle.MEDIUM);
        System.out.println(shortF.format(dateTime));
// 1/20/20 11:12 AM
        System.out.println(mediumF.format(dateTime));
// Jan 20, 2020 11:12:34 AM
      //-----------------------------------------

        DateTimeFormatter shortDateTime =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(shortDateTime.format(LocalDate.now()));

        System.out.println(shortDateTime.format(LocalDate.now()));

        System.out.println(
                shortDateTime.format(LocalTime.now())); // UnsupportedTemporalTypeException

        //the same as the previous code
      //  The following statements print exactly the same thing
       // as the previous code:
        DateTimeFormatter shortDateTime2 =
                DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT);
        System.out.println(LocalDate.now().format(shortDateTime2));
        System.out.println(LocalDateTime.now().format(shortDateTime2));
        System.out.println(LocalTime.now().format(shortDateTime2));
    }
}
