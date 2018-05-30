package J$$JDBC.D$$GettingDatafromaResultSet.ScrollingResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class relativeMETHOD {
    private static Connection conn;

    /*there is a relative() method that moves forward or backward the requested
    number of rows. It returns a boolean if the cursor is pointing to a row with data*/
public static void main(String[] args) throws SQLException {
    Statement stmt = conn.createStatement(
            ResultSet.TYPE_SCROLL_INSENSITIVE,
            ResultSet.CONCUR_READ_ONLY);
    ResultSet rs = stmt.executeQuery("select id from animal order by id");
    System.out.println(rs.next());
// true
    System.out.println(rs.getString("id")); // 1
    System.out.println(rs.relative(2));
// true
    System.out.println(rs.getString("id")); // 3
    System.out.println(rs.relative(-1));
// true
    System.out.println(rs.getString("id")); // 2
    System.out.println(rs.relative(4));
// false
}
}
