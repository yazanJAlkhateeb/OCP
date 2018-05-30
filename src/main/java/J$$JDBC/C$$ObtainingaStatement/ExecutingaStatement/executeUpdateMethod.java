package J$$JDBC.C$$ObtainingaStatement.ExecutingaStatement;

public class executeUpdateMethod {
    /*Let’s start out with statements that change the data in a table. That would be SQL
statements that begin with DELETE , INSERT , or UPDATE . They typically use a method calledExecuting a Statement
521
executeUpdate() . The name is a little tricky because the SQL UPDATE statement is not the
only statement that uses this method.
The method takes the SQL statement to run as a parameter. It returns the number
of rows that were inserted, deleted, or changed*/
    /*Here’s an example of all three update
types:
Statement stmt = conn.createStatement();
int result = stmt.executeUpdate("insert into species values(10, 'Deer', 3)");
System.out.println(result); // 1
result = stmt.executeUpdate("update species set name = '' where name = 'None'");
System.out.println(result); // 0
result = stmt.executeUpdate("delete from species where id = 10");
System.out.println(result); // 1*/
}
