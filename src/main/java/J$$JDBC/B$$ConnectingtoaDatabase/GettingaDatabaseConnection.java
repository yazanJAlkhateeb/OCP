package J$$JDBC.B$$ConnectingtoaDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class GettingaDatabaseConnection {
    /*
    There are two main ways to get a Connection : DriverManager or DataSource .

   The DriverManager class is in the JDK, as it is an API that comes with Java. It uses the
factory pattern,
     */
    public static void main(String[] args) throws SQLException {
        Connection conn1 = DriverManager.getConnection("jdbc:derby:zoo");
        System.out.println(conn1);
        /*There is also a signature that takes a username and password:*/
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/ocp-book",
                "username",
                "password");
        System.out.println(conn);
    }
}
