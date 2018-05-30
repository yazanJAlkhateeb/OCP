package I$$NIO.C$$InteractingwithFiles;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;

public class copyMETHODwithInOutStream {
    public static void main(String[] args) throws FileNotFoundException {
        /*
        The NIO.2 Files API class contains two overloaded copy() methods for copying files
using java.io streams, as described in Chapter 8. The first copy() method takes a source
java.io.InputStream along with a target Path object. It reads the contents from the
stream and writes the output to a file represented by a Path object.
The second copy() method takes a source Path object and target java.io.OutputStream .
It reads the contents of the file and writes the output to the stream.
The following are examples of each copy() method:*/
try (InputStream is = new FileInputStream("source-data.txt");
     OutputStream out = new FileOutputStream("output-data.txt")) {



// Copy stream data to file
Files.copy(is, Paths.get("c:\\mammals\\wolf.txt"));
// Copy file data to stream
Files.copy(Paths.get("c:\\fish\\clown.xsl"), out);
} catch (IOException e) {
// Handle file I/O exception...
}
/*
In this example, the InputStream and OutputStream parameters could refer to any valid
stream, including website connections, in-memory stream resources, and so forth.
Like the first copy() method, the copy(InputStream,Path) method also supports
optional vararg options, since the data is being written to a file represented by a Path
object. The second method, copy(Path,OutputStream) , does not support optional vararg
         */
    }
}
