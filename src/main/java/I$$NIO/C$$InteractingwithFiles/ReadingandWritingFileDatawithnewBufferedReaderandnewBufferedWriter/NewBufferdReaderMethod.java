package I$$NIO.C$$InteractingwithFiles.ReadingandWritingFileDatawithnewBufferedReaderandnewBufferedWriter;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class NewBufferdReaderMethod {
    public static void main(String[] args) {
        /*
        Files.newBufferedReader(Path,Charset) , reads the file specified
at the Path location using a java.io.BufferedReader object. It also requires a Charset
value to determine what character encoding to use to read the file. You may remember
that we briefly discussed character encoding and Charset in Chapter 8. For this
chapter, you just need to know that characters can be encoded in bytes in a variety of
ways. It may also be useful to know that Charset.defaultCharset() can be used to get
the default Charset for the JVM.
We now present an example of this method:*/
        Path path = Paths.get("/animals/gopher.txt");
        try (BufferedReader reader = Files.newBufferedReader(path,
                Charset.forName("US-ASCII"))) {
// Read from the stream
            String currentLine = null;
            while ((currentLine = reader.readLine()) != null)
                System.out.println(currentLine);
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
