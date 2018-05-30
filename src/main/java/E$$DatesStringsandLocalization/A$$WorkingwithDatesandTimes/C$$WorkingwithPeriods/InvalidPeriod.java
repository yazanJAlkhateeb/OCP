package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.C$$WorkingwithPeriods;

import java.time.Period;

public class InvalidPeriod {
    public static void main(String[] args) {
       /* There’s one catch. You cannot chain methods when creating a Period . The following
        code looks like it is equivalent to the everyYearAndAWeek example, but it’s not. Only the
        last method is used because the Period of
        methods are static methods.*/
                Period wrong2 = Period.ofYears(1).ofWeeks(1);
        System.out.println(wrong2);
// every week
       /* This tricky code is really like writing the following:*/
        Period wrong = Period.ofYears(1);

        System.out.println(wrong);
        wrong = Period.ofWeeks(1);
        System.out.println(wrong);
    }

}
