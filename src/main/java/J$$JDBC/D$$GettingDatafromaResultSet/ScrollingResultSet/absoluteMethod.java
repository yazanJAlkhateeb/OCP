package J$$JDBC.D$$GettingDatafromaResultSet.ScrollingResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class absoluteMethod {
    private static Connection conn;

    /*
        * Another method that you need to know is absolute() . It takes the row number to
    which you want to move the cursor as a parameter. A positive number moves the cursor to
    that numbered row. Zero moves the cursor to a location immediately before the first row.

    A negative number means to start counting from the end of the ResultSet rather than
    from the beginning*/
    public static void main(String[] args) throws SQLException {
        Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("select id from animal order by id");
        System.out.println(rs.absolute(2));
// true
        System.out.println(rs.getString("id"));
// 2
        System.out.println(rs.absolute(0));
// false
        System.out.println(rs.absolute(5));
// true
        System.out.println(rs.getString("id"));
// 5
        System.out.println(rs.absolute(-2));
// true
        System.out.println(rs.getString("id"));
    }
}
