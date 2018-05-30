package I$$NIO.D$$UnderstandingFileAttributes.A$DiscoveringBasicFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.FileTime;

/*
Both of these methods have the ability to throw a checked IOException when the fi le is
accessed or modifi ed.
 */
public class getLastModifiedTimeANDsetLastModifiedTimeMETHODS {
    public static void main(String[] args) {
        /*
        The Files class provides the method Files.getLastModifiedTime(Path) , which returns
a FileTime object to accomplish this.
         */
        /*
            The FileTime class is a simple container class that
stores the date/time information about when a fi le was accessed, modifi ed, or created. For
convenience, it has a toMillis() method that returns the epoch time.
         */
        /*
        The Files class also provides a mechanism for updating the last-modifi ed date/time of
a fi le using the Files.setLastModifiedTime(Path,FileTime) method. The FileTime class
also has a static fromMillis() method that converts from the epoch time to a FileTime
object.  */
        try {
            final Path path = Paths.get("/rabbit/food.jpg");
            System.out.println(Files.getLastModifiedTime(path).toMillis());


            Files.setLastModifiedTime(path,
                    FileTime.fromMillis(System.currentTimeMillis()));
            System.out.println(Files.getLastModifiedTime(path).toMillis());
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
