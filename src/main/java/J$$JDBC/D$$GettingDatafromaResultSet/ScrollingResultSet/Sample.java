package J$$JDBC.D$$GettingDatafromaResultSet.ScrollingResultSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Sample {

    private static Connection conn;

    public static void main(String[] args) throws SQLException {
        Statement stmt = conn.createStatement(
                ResultSet.TYPE_SCROLL_INSENSITIVE,
                ResultSet.CONCUR_READ_ONLY);
        ResultSet rs = stmt.executeQuery("select id from species order by id");
        rs.afterLast();
        System.out.println(rs.previous());
// true
        System.out.println(rs.getInt(1));

        System.out.println(rs.previous());
        System.out.println(rs.getInt(1));
        System.out.println(rs.last());
        System.out.println(rs.getInt(1));
        System.out.println(rs.first());
        System.out.println(rs.getInt(1));
        rs.beforeFirst();
        System.out.println(rs.getInt(1));
    }
}
