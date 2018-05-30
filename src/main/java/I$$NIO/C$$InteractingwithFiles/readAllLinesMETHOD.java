package I$$NIO.C$$InteractingwithFiles;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
/*IMP
Be aware that the entire file is read when readAllLines() is called, with the resulting
String array storing all of the contents of the file in memory at once. Therefore, if the file
is significantly large, you may encounter an OutOfMemoryError trying to load all of it into
memory. Later on in the chapter, we will revisit this method and present a new stream-
based NIO.2 method that is far more performant on large files.
 */
public class readAllLinesMETHOD {
    public static void main(String[] args) {
        /*The Files.readAllLines() method reads all of the lines of a text file and returns the
results as an ordered List of String values. The NIO.2 API includes an overloaded version
that takes an optional Charset value. The following sample code reads the lines of the file
and outputs them to the user:*/
        Path path = Paths.get("/home/yazan/vagrant/psysjo-vagrant-17.0-SNAPSHOT/start.sh");
        try {
            List<String> lines = Files.readAllLines(path, Charset.defaultCharset());

            for (String line : lines) {
                System.out.println(line);
            }
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
