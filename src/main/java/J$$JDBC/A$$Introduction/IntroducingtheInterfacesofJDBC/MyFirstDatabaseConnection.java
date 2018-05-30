package J$$JDBC.A$$Introduction.IntroducingtheInterfacesofJDBC;

import java.sql.*;
/*
If the URL were using our imaginary Foo driver, DriverManager would return an
instance of FooConnection . Calling createStatement() would then return an instance of
FooStatement , and calling executeQuery() would return an instance of FooResultSet .
 */

public class MyFirstDatabaseConnection {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:derby:zoo";
        try (Connection conn = DriverManager.getConnection(url);
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery("select name from animal")) {
            while (rs.next())
                System.out.println(rs.getString(1));
        }
    }
}