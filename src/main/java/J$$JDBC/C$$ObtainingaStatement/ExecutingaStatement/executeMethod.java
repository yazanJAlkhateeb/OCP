package J$$JDBC.C$$ObtainingaStatement.ExecutingaStatement;

public class executeMethod {
    /*
    * There’s a third method called execute() that can run either a query or an update. It
returns a boolean so that we know whether there is a ResultSet . That way, we can call the
proper method to get more detail. The pattern looks like this:
boolean isResultSet = stmt.execute(sql);
if (isResultSet) {
ResultSet rs = stmt.getResultSet();
System.out.println("ran a query");
} else {
int result = stmt.getUpdateCount();
System.out.println("ran an update");
}
If sql is a SELECT , the boolean is true and we can get the ResultSet . If it is not a
SELECT , we can get the number of rows updated.*/
}
