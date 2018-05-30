package H$$IO.D$$InteractingwithUsers.ConsoleClass;

import java.io.Console;
import java.util.Arrays;

public class ReadPasswordMethod {
    /*
Also like the readLine() method, the Console class offers an overloaded version of the
readPassword() method with the signature readPassword(String format, Object. . .
args) used for displaying a formatted prompt to the user prior to accepting text. Unlike the
readLine() method, though, the readPassword() method returns an array of characters
instead of a String
 */
    public static void main(String[] args) {


    Console console = System.console();
if(console == null) {
        throw new RuntimeException("Console not available");
    } else {

        char[] password = console.readPassword("Enter your password: ");
        console.format("Enter your password again: ");
        console.flush();
        char[] verify = console.readPassword();
        boolean match = Arrays.equals(password,verify);
// Immediately clear passwords from memory
        for(int i=0; i<password.length; i++) {
            password[i]='x';
        }
        for(int i=0; i<verify.length; i++) {
            verify[i]='x';
        }
        console.format("Your password was "+(match ? "correct": "incorrect"));
    }
}

    /*
    Why Does readPassword() Return a Character Array?

    As you may remember from your OCA study material, String values are added to a
shared memory pool for performance reasons in Java. This means that if a password that
a user typed in were to be returned to the process as a String , it might be available in the
String pool long after the user entered it.
If the memory in the application is ever dumped to disk, it means that the password could
be recovered by a malicious individual after the user has stopped using the application.
The advantage of the readPassword() method using a character array should be clear.
As soon as the data is read and used, the sensitive password data in the array can be
“erased” by writing garbage data to the elements of the array. This would remove the
password from memory long before it would be removed by garbage collection if a
String value were used.
     */
}
