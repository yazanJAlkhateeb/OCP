package QuestionAndAnswers.q112;

public class q112 {
    /*Given the structure of the STUDENT table:
Student (id INTEGER, name VARCHAR)
Given:
public class Test {
static Connection newConnection =null;
public static Connection get DBConnection () throws SQLException {
try (Connection con = DriveManager.getConnection(URL, username, password)) {
newConnection = con;
}
return newConnection;
}
public static void main (String [] args) throws SQLException {
get DBConnection ();
Statement st = newConnection.createStatement();
st.executeUpdate(“INSERT INTO student VALUES (102, ‘Kelvin’)”);
}
}
Assume that:
The required database driver is configured in the classpath.
The appropriate database is accessible with the URL, userName, and passWord exists.
The SQL query is valid.
What is the result?
A. The program executes successfully and the STUDENT table is updated with one record.
B. The program executes successfully and the STUDENT table is NOT updated with any record.
C. A SQLException is thrown as runtime.///answer
D. A NullPointerException is thrown as runtime.*/
}
