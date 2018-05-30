package F$$ExceptionsAndAssertions.E$$RethrowingExceptions;

import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class TheSecondWay {/*
    Since there were a number of changes in Java 7, the language designers decided to solve
this problem at the same time. They made it legal to write Exception in the catch block but
    really only a limited set of exceptions. The following code is similar to the preceding example:
*/
    public void parseData() throws SQLException,
            DateTimeParseException {
    }
    public void rethrowing() throws SQLException, DateTimeParseException {
        try {
            parseData();
        } catch (Exception e) {
            System.err.println(e);
            throw e;
        } }
    }
        /*
    We still have one catch block on line 6. This time, Java interprets Exception as the pos-
    sible exceptions that can be thrown in the method. As long as all of these checked excep-
    tions are handled or declared, Java is happy.*/

        /*for changing this way is good as if you want to change the sig
        * of method you don't have to change the catch block at all*/
