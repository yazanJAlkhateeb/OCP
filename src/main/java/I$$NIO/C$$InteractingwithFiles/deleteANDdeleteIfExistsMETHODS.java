package I$$NIO.C$$InteractingwithFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class deleteANDdeleteIfExistsMETHODS {
    public static void main(String[] args) {
         /*The Files.delete(Path) method deletes a fi le or empty directory within the fi le system.
The delete() method throws the checked IOException under a variety of circumstances.
For example, if the path represents a non-empty directory, the operation will throw the
runtime DirectoryNotEmptyException . If the target of the path is a symbol link, then the
symbolic link will be deleted, not the target of the link.*/

         /*The deleteIfExists(Path) method is identical to the delete(Path) method, except
that it will not throw an exception if the fi le or directory does not exist, but instead it will
return a boolean value of false . It will still throw an exception if the fi le or directory does
exist but fails, such as in the case of the directory not being empty.*/

        try {
            Files.delete(Paths.get("/vulture/feathers.txt"));
            Files.deleteIfExists(Paths.get("/pigeon"));
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
