package H$$IO.D$$InteractingwithUsers.ConsoleClass;

import java.io.Console;

public class TheNewWay {

    /*
    To begin, the Console class is a singleton,
     */
    /*
    accessed by calling the System.console() method
     */
    public static void main(String[] args) {
        Console console = System.console();
        if (console != null) {
            String userInput = console.readLine();
            console.writer().println("You entered the following: " + userInput);
        }
    }
}
