package H$$IO.C$$WorkingwithStreams;

import java.io.*;

public class TheFileInputStreamandFileOutputStreamClasses {
    /*
    These classes include constructors that take a File object
or String , representing a path to the file.

The data in a FileInputStream object is commonly accessed by successive calls to the
read() method until a value of -1 is returned

The FileInputStream class also contains overloaded versions of the read() method,
which take a pointer to a byte array where the data is written.

A FileOutputStream object is accessed by writing successive bytes using the write(int)
method. Like the FileInputStream class, the FileOutputStream also contains overloaded
versions of the write() method that allow a byte array to be passed and can be used by
Buffered classes.
     */
        public static void copy(File source, File destination) throws IOException {
            try (InputStream in = new FileInputStream(source);OutputStream out = new FileOutputStream(destination)) {
                int b;
                while((b = in.read()) != -1) {
                    out.write(b);
                }
            }
        }
        public static void main(String[] args) throws IOException {
            File source = new File("Zoo.class");
            File destination = new File("ZooCopy.class");
            copy(source,destination);
        }
}
