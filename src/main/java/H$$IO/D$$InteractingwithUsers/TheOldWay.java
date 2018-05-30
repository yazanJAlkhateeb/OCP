package H$$IO.D$$InteractingwithUsers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TheOldWay {

    /*
    System.in returns an InputStream and is used to retrieve text input from the
user. It can be chained to a BufferedReader to allow input that terminates with the Enter
key. Before we can apply the BufferedReader , though, we need to wrap the System.in
object using the InputStreamReader class, which allows us to build a Reader object out of
an existing InputStream instance. The result is shown in the following application:
     */
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));
        String userInput = reader.readLine();
        System.out.println("You entered the following: " + userInput);
    }
}
