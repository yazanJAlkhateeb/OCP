package I$$NIO.E$$PresentingtheNewStreamMethods;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class findMETHOD {
/*The Files.find(Path,int,BiPredicate) method behaves in a similar manner as the
Files.walk() method, except that it requires the depth value to be explicitly set alongPresenting the New Stream Methods
491
with a BiPredicate to filter the data. Like walk() , find() also supports the FOLLOW_LINK
vararg option.*/

/*BiPredicate is an interface that takes two
generic objects and returns a boolean value of the form (T, U) -> boolean . In this case,
the two object types are Path and BasicFileAttributes , */
public static void main(String[] args) {
    Path path = Paths.get("/bigcats");
    long dateFilter = 1420070400000l;

    try {
        Stream<Path> stream = Files.find(path, 10,
        (p,a) -> p.toString().endsWith(".java")
                && a.lastModifiedTime().toMillis()>dateFilter);
        stream.forEach(System.out::println);
    } catch (Exception e) {
// Handle file I/O exception...
    }
}
}
