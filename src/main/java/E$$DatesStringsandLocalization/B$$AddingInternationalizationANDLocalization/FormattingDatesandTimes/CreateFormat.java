package E$$DatesStringsandLocalization.B$$AddingInternationalizationANDLocalization.FormattingDatesandTimes;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CreateFormat {
    public static void main(String[] args) {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("MMMM dd, yyyy, hh:mm");
        System.out.println(LocalDateTime.now().format(f));
// January 20, 2020, 11:12
    }
}
