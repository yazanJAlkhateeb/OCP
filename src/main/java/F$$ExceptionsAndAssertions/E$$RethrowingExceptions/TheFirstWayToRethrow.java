package F$$ExceptionsAndAssertions.E$$RethrowingExceptions;

import java.sql.SQLException;
import java.time.format.DateTimeParseException;

public class TheFirstWayToRethrow {
        public void parseData() throws SQLException,
                DateTimeParseException {
        }
            /*
    When calling this method, we need to handle or declare those two exception types.
    There are few valid ways of doing this. We could have two catch blocks and duplicate the*/

    public void multiCatch() throws SQLException, DateTimeParseException {
        try {
            parseData();
        } catch (SQLException | DateTimeParseException e) {
            System.err.println(e);
            throw e;
        }
    }
        /*
    This doesn’t seem bad. We only have one catch block on line 6, so we aren’t duplicating
    code. Or are we? The list of exceptions in the catch block and the list of exceptions in the
    method signature of multiCatch() are the same. This is duplication.*/
}
