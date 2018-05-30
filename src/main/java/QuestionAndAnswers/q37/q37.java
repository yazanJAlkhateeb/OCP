package QuestionAndAnswers.q37;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.temporal.ChronoUnit;

public class q37 {
    public static void main(String[] args) {
        ZonedDateTime depart = ZonedDateTime.of(2015, 1, 15, 3, 0, 0, 0, ZoneId.of("UTC-7"));
        ZonedDateTime arrive = ZonedDateTime.of(2015, 1, 15, 9, 0, 0, 0, ZoneId.of("UTC-5"));
        long hrs = ChronoUnit.HOURS.between(depart, arrive); //line n1
        System.out.println("Travel time is" + hrs + "hours");

        //What is the result?
        //A. Travel time is 4 hours///answer
        //B. Travel time is 6 hours
        //C. Travel time is 8 hours
        //D. An exception is thrown at line n1.
    }
}
