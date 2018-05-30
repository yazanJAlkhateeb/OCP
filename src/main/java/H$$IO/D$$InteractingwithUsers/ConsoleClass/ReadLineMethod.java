package H$$IO.D$$InteractingwithUsers.ConsoleClass;

import java.io.BufferedReader;
import java.io.Console;
import java.io.IOException;

public class ReadLineMethod {

    /*
    The basic readLine() method retrieves a single line of text from the user, and the user
presses the Enter key to terminate it.
The Console class also supports an overloaded version of the readLine() method with
the signature readLine(String format, Object. . . args) , which displays a formatted
prompt to the user prior to accepting text
     */
    public static void main(String[] args) throws NumberFormatException,
            IOException {
        Console console = System.console();
        if(console == null) {
            throw new RuntimeException("Console not available");
        } else {
            console.writer().print("How excited are you about your trip today? ");
            console.flush();
            String excitementAnswer = console.readLine();
            String name = console.readLine("Please enter your name: ");
            Integer age = null;
            console.writer().print("What is your age? ");
            console.flush();
            BufferedReader reader = new BufferedReader(console.reader());
            String value = reader.readLine();
            age = Integer.valueOf(value);
            console.writer().println();
            console.format("Your name is "+name);
            console.writer().println();
            console.format("Your age is "+age);
            console.printf("Your excitement level is: "+excitementAnswer);
        }
    }
}


