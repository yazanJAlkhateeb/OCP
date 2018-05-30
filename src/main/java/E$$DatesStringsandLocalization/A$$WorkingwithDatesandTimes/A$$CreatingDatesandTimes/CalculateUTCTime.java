package E$$DatesStringsandLocalization.A$$WorkingwithDatesandTimes.A$$CreatingDatesandTimes;

public class CalculateUTCTime {
    /*The time zone offset can be listed in different ways: +02:00, GMT+2, and
UTC+2 all mean the same thing. You might see any of them on the exam*/

    /*First, let’s try to fi gure out how far apart these moments are in time. Notice how India
has a half-hour offset, not a full hour. To approach a problem like this, you subtract the
time zone from the time. This gives you the GMT equivalent of the time:
2015–06–20T07:50+02:00[Europe/Paris]// GMT 2015–06–20 5:50
2015–06–20T06:50+05:30[Asia/Kolkata]// GMT 2015–06–20 1:20

After converting to GMT, you can see that the Paris time is four and a half hours behind
the Kolkata time.*/

    /*Let’s try another one, this time with GMT. Remember that you need to add when sub-
tracting a negative number.
2015–06–20T07:50 GMT-04:00// GMT 2015–06–20 11:50
2015–06–20T04:50 GMT-07:00// GMT 2015–06–20 11:50
*/
    /*Try to work this one out on your own. Really, get a pen and write it out. You
need to be able to perform this math on the exam.
2015–06–20T07:50–07:00[US/Pacific]
2015–06–20T07:50+05:30[Asia/Kolkata]
The answer is 12 and a half hours. The fi rst instance in time is GMT 14:50. The second
is GMT 2:20. No wonder calls between California and India aren’t convenient!*/
}
