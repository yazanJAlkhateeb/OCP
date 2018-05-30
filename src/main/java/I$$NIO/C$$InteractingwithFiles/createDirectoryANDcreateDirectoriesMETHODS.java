package I$$NIO.C$$InteractingwithFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class createDirectoryANDcreateDirectoriesMETHODS {
    public static void main(String[] args) {
        /*
        we can use the Files.createDirectory(Path) method to create
a directory. There is also a plural form of the method called createDirectories() , which
like mkdirs() creates the target directory along with any nonexistent parent directories
leading up to the target directory in the path.

The directory-creation methods can throw the checked IOException , such as when
the directory cannot be created or already exists
Both of these methods also accept an optional list of FileAttribute<?> values to set on
the newly created directory or directories
         */
        try {
            Files.createDirectory(Paths.get("/bison/field"));

            Files.createDirectories(Paths.get("/bison/field/pasture/green"));
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
