package J$$JDBC.B$$ConnectingtoaDatabase;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/*Class.forName() loads a class. This lets DriverManager use a Driver , even if the JAR
doesn’t have a META-INF/service/java.sql.Driver file. There’s no harm in including
Class.forName() , even if the newer driver does have this file.*/
public class TheOldWayToGetConnection {
    public static void main(String[] args) throws SQLException,
            ClassNotFoundException {
        Class.forName("org.postgresql.Driver");
        Connection conn = DriverManager.getConnection(
                "jdbc:postgresql://localhost:5432/ocp-book",
                "username",
                "password");
    }/*
    Having META-INF/service/java.sql.Driver inside the JAR became mandatory with
JDBC 4.0 in Java 6. Before that, some drivers included it and some didn’t. Table 10.1 sums
up the current state of affairs.
Ta b l e   1 0 .1     JDBC 3.0 vs. 4.0 drivers
                                    JDBC <= 3.0 Driver JDBC >= 4.0 Driver
Required to contain java.sql.Driver      No             Yes
Java will use java.sql.Driver file if
present                                     Yes Yes
Required to use Class.forName                   Yes No
Allowed to use Class.forName                        Yes Yes*/
}
