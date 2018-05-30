package I$$NIO.D$$UnderstandingFileAttributes.A$DiscoveringBasicFileAttributes;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

/*IMP
The Files.size() method is defined only on files. Calling Files.size()
on a directory is system dependent and undefined. If you need to
determine the size of a directory and its contents, you’ll need to walk the
directory tree, as described later in this chapter.
 */

public class sizeMETHOD {
    public static void main(String[] args) {
        /*
        The size() method throws the checked IOException if the fi le does not exist or if
        the process is unable to read the fi le information.
        The following is a sample call to the size() method: */
        try {
            System.out.println(Files.size(Paths.get("/zoo/c/animals.txt")));
        } catch (IOException e) {
// Handle file I/O exception...
        }  }
}
