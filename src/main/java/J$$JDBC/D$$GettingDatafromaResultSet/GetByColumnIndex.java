package J$$JDBC.D$$GettingDatafromaResultSet;

import java.sql.*;
import java.util.HashMap;
import java.util.Map;

public class GetByColumnIndex {
    /*
    * There is another way to access the columns. You can use
an index instead of a column name. The column name is better because it is clearer what
is going on when reading the code. It also allows you to change the SQL to reorder the
columns. Rewriting this same example with column numbers looks like the following:*/
    public static void main(String[] args) throws SQLException {
        Connection connection = DriverManager.getConnection("");
        Statement statement = connection.createStatement();
        Map<Integer, String> idToNameMap = new HashMap<>();
        ResultSet rs = statement.executeQuery("select id, name from species");
        while (rs.next()) {
            int id = rs.getInt(1);
            String name = rs.getString(2);
            idToNameMap.put(id, name);
        }
        System.out.println(idToNameMap);
        /*
This time, you can see the column positions on lines 23 and 24. Notice how the columns
are counted starting with 1 rather than 0. This is really important, so we will repeat it.
Remember that JDBC starts counting with one rather than zero*/
    }
}
