package QuestionAndAnswers.q21;

import java.time.LocalDate;
import java.time.Month;

public class q21 {
    public static void main(String[] args) {
        LocalDate valentinesDay =LocalDate.of(2015, Month.FEBRUARY, 14);
        LocalDate nextYear = valentinesDay.plusYears(1);
        nextYear.plusDays(15); //line n1
        System.out.println(nextYear);
    }
    /*What is the result?
A. 2016-02-14/////////answer
B. A DateTimeException is thrown.
C. 2016-02-29*/
}
