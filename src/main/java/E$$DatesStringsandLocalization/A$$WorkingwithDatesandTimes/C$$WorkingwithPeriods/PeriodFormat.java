package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.C$$WorkingwithPeriods;

import java.time.Period;

public class PeriodFormat {
    public static void main(String[] args) {
        System.out.println(
                Period.of(1,2,3));//P1Y2M3D

        System.out.println(
                Period.ofMonths(3));//The output is P3M

        /*Now let’s try a tricky one:*/
        System.out.println(
                Period.ofWeeks(5));//This one outputs P21D .
        System.out.println(
                Period.ofDays(3));//This one outputs P3D .
    }
}
