package J$$JDBC.C$$ObtainingaStatement;

public class Concept {
    /*In order to run SQL, you need to tell a Statement about it. Getting a Statement from a
Connection is easy:
Statement stmt = conn.createStatement();*/

    /*There’s another one that you need to know for the exam:
Statement stmt = conn.createStatement(
ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);*/

    /*The first is the ResultSet type, and the other is
the ResultSet concurrency mode.*/
}
