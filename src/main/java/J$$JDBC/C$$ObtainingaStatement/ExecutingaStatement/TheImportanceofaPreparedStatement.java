package J$$JDBC.C$$ObtainingaStatement.ExecutingaStatement;

public class TheImportanceofaPreparedStatement {
/*On the exam, only Statement is covered. In real life, you should not use Statement
directly. You should use a subclass called PreparedStatement . This subclass has three
advantages: performance, security, and readability.
■ ■
■ ■
Performance: In most programs you run similar queries multiple times. A Prepared-
Statement figures out a plan to run the SQL well and remembers it.
Security: Suppose you have this method:
private static void scaryDelete(Connection conn, String name) throws SQLException {
Statement stmt = conn.createStatement();
String sql = "delete from animal where name = '" + name + "'";
System.out.println(sql);
stmt.executeUpdate(sql);
}
This method appears to delete the row that matches the given name. Imagine that this
program lets a user type in the name. If the user’s String is "Asian Elephant" , this
works out well and one row gets deleted. What happens if the user’s String is "any'
or 1 = 1 or name='any" ? The generated SQL is
delete from animal where name = 'any' or 1 = 1 or name='any'
This deletes every row in the table. That’s not good. In fact, it is so bad that it has a
name—SQL injection. Upon first glance, the solution is to prevent single quotes in the
user’s input. It turns out to be more complicated than that because the bad guys know
many ways of doing bad things. Luckily, you can just write this:
PreparedStatement ps = conn.prepareStatement("delete from animal where name = ?");
ps.setString(1, name);
ps.execute();
The JDBC driver takes care of all the escaping for you. This is convenient.
■ ■
Readability: It’s nice not to have to deal with string concatenation in building a query
string with lots of variables.*/}
