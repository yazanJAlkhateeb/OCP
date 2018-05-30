package H$$IO.D$$InteractingwithUsers.ConsoleClass;

import java.io.Console;

public class readerAndwriterMethods {

    /*
    The Console class provides access to an instance of Reader and PrintWriter using the
methods reader() and writer() , respectively. Access to these classes is analogous toInteracting with Users
439
calling System.in and System.out directly, although they use the Reader / Writer classes
instead of the InputStream / OutputStream classes, which are more appropriate for work-
ing with character and String data. In this manner, they handle the underlying character
encoding automatically.
These reader() and writer() methods are the most general ones in the Console class,
and they are used by developers who need raw access to the user input and output stream
or who may be in the process of migrating away from System.in .
     */
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered the following: " + userInput);
            console.reader();
        }
    }
}
