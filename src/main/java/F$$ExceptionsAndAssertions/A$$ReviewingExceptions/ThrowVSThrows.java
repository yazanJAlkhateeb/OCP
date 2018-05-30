package F$$ExceptionsAndAssertions.A$$ReviewingExceptions;

import java.sql.SQLException;

public class ThrowVSThrows {
    public String getDataFromDatabase() throws SQLException {
        throw new UnsupportedOperationException();

        /*Remember to pay attention that throw and throws aren’t reversed in the
code that you see on the exam.*/
    }
}
