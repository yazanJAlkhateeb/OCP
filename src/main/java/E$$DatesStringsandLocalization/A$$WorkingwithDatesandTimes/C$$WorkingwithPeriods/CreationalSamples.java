package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.C$$WorkingwithPeriods;

import java.time.Period;

public class CreationalSamples {
    public static void main(String[] args) {
        Period period=Period.ofMonths(1);
        Period period1=Period.ofYears(1);
        Period period3=Period.ofDays(5);
        Period period4=Period.ofWeeks(1);
        Period periods=Period.of(1,4,1);
    }
}
