package QuestionAndAnswers.q43;

import java.time.LocalDate;
import java.time.Month;

public class q43 {
    public static void main(String[] args) {
    //    Given the code fragment:
        LocalDate valentinesDay =LocalDate.of(2015, Month.FEBRUARY, 14);
        LocalDate nextYear = valentinesDay.plusYears(1);
        nextYear.plusDays(15); //line n1
        System.out.println(nextYear);
       // What is the result?
        //A.
        //2016-02-14///answer
        //
        //B.
        //A DateTimeException is thrown.
        //
        //C.
        //2016-02-29
        //
        //D.
        //A compilation error occurs at line n1.
    }
}
