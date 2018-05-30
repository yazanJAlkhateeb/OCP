package H$$IO.D$$InteractingwithUsers.ConsoleClass;

import java.io.Console;
import java.util.Locale;

public class formatAndprintf {

  /*  For outputting data to the user, you can use the PrintWriter writer() object or use the
    convenience format(String,Object. . .) method directly. The format() method takes a
    String format and list of arguments, and it behaves in the exact same manner as String.
            format() described in Chapter 5. For convenience to C developers, there is also a printf()
    method in the Console class, which is identical in every way but name to the format()
    method, and it can be used in any place format() is used.
    Note that the Console class defines only one format() method, and it does not define a
    format() method that takes a locale variable. In this manner, it uses the default system locale
    to establish the formatter. Of course, you could always use a custom locale by retrieving the
    Writer object and passing your own locale instance, such as in the following example:*/

    public static void main(String[] args) {

    Console console = System.console();
console.format("Hello World",new Locale("fr", "CA"));
}

}
