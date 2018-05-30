package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.C$$WorkingwithPeriods;

public class ConvertingTolong {
    /*LocalDate and LocalDateTime have a method to convert themselves into long equiva-
lents in relation to January 1, 1970. This special date is called the epoch . What’s special
about 1970? That’s what Unix started using for date standards, so Java reused it. And
don’t worry—you don’t have to memorize the names for the exam.
■ ■ LocalDate has toEpochDay() , which is the number of days since January 1, 1970.
■ ■ LocalDateTime and ZonedDateTime have toEpochSecond() , which is the number of
seconds since January 1, 1970.
■ ■
LocalTime does not have an epoch method. Since it represents a time that can
occur on any date, it doesn’t make sense to compare it to 1970. Although the exam
pretends that time zones don’t exist, you may be wondering if this special January
1, 1970, is in a specific time zone. The answer is yes. This special time refers to when
it was January 1, 1970, in GMT (Greenwich mean time). Greenwich is in England,
and GMT does not participate in daylight savings time. This makes it a good refer-
ence point.*/
}
