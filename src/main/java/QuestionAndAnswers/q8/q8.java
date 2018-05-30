package QuestionAndAnswers.q8;

public class q8 {
    /*Given the code fragment:
 Connection conn = DriveManager.getConnection(dbURL, userName, passWord);
 String query = “SELECT id FROM Employee”;
 try (Statement stmt = conn.createStatement()) {

ResultSet rs = stmt.executeQuery(query);

stmt.executeQuery(“SELECT id FROM Customer”);

while (rs.next()) {

//process the results

System.out.println(“Employee ID: “+ rs.getInt(“id”));

}
 } catch (Exception e) {

System.out.println (“Error”);
 }
Assume that:
The required database driver is configured in the classpath.
The appropriate database is accessible with the dbURL, userName, and passWord exists.
The Employee and Customer tables are available and each table has id column with a few records and
the SQL queries are valid.
What is the result of compiling and executing this code fragment?

A. The program prints employee IDs.
B. The program prints customer IDs.
C. The program prints Error.//answer
D. compilation fails on line 13.*/
}
