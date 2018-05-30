package I$$NIO.E$$PresentingtheNewStreamMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
/*there is an overloaded version of walk(Path,int) that takes a maximum directory depth
integer value as the second parameter. A value of 0 indicates the current path record itself.*/


public class WalkMETHOD {
    /*
The Files.walk(path) method returns a Stream<Path> object that
traverses the directory in a depth-first, lazy manner.
     */
    /*
    Keep in mind that when you create a Stream<Path> object using
Files.walk() , the contents of the directory have not yet been traversed.
     */
    public static void main(String[] args) {
        Path path = Paths.get("/home/yazan/u01");

        try {
            Files.walk(path)
                    .filter(p -> p.toString().endsWith(".java"))
                    .forEach(System.out::println);
        } catch (IOException e) {
// Handle file I/O exception...
        }
        /*
        You can see that the method also throws a somewhat expected IOException , as
there could be a problem reading the underlying fi le system
         */
    }
}
