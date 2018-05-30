package QuestionAndAnswers.q26;

public class q26 {
    /*Given the records from the Employee table:

and given the code fragment:
try {
Connection conn = DriverManager.getConnection (URL, userName, passWord);
Statement st = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,
ResultSet.CONCUR_UPDATABLE);
st.execute(“SELECT*FROM Employee”);
ResultSet rs = st.getResultSet();
while (rs.next()) {
if (rs.getInt(1) ==112) {
rs.updateString(2, “Jack”);
}
Visit us athttps://www.examsboost.com/test/1z0-809/}
rs.absolute(2);
System.out.println(rs.getInt(1) + “ “ + rs.getString(2));
} catch (SQLException ex) {
System.out.println(“Exception is raised”);
}
Assume that:
The required database driver is configured in the classpath.
The appropriate database accessible with the URL, userName, and passWord exists.
What is the result?
A. The Employee table is updated with the row://///////answer
112 Jack
and the program prints:
112 Jerry
B. The Employee table is updated with the row:
112 Jack
and the program prints:
112 Jack
C. The Employee table is not updated and the program prints:
112 Jerry
D. The program prints Exception is raised.*/
}
