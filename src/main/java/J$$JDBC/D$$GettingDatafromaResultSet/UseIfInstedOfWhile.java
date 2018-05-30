package J$$JDBC.D$$GettingDatafromaResultSet;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class UseIfInstedOfWhile {
    private static Statement stmt;

    /*
        * Sometimes you want to get only one row from the table. Maybe you need only one piece
    of data. Or maybe the SQL is just returning the number of rows in the table. When you
    want only one row, you use an if statement rather than a while loop:
    */
    public static void main(String[] args) throws SQLException {
        ResultSet rs = stmt.executeQuery("select count(*) from animal");
        if (rs.next())
            System.out.println(rs.getInt(1));
/*
It is very important to check that rs.next() returns true before trying to call a getter
on the ResultSet . That would throw a SQLException*/
    }
}
