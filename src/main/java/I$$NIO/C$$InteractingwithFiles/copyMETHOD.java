package I$$NIO.C$$InteractingwithFiles;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Paths;

/*IMP
By default, copying files and directories will traverse symbolic links, although it
will not overwrite a file or directory if it already exists, nor will it copy file attributes.
These behaviors can be altered by providing the additional options NOFOLLOW_LINKS ,
REPLACE_EXISTING , and COPY_ATTRIBUTES , respectively, as discussed earlier in the chapter.
 */

public class copyMETHOD {
    public static void main(String[] args) {
        /*
        Unlike the legacy java.io.File class, the NIO.2 Files class provides a set of overloaded
copy() methods for copying files and directories within the file system. The primary one
that you should know about for the exam is Files.copy(Path,Path) , which copies a
file or directory from one location to another. The copy() method throws the checked
IOException , such as when the file or directory does not exist or cannot be read.

Directory copies are shallow rather than deep, meaning that files and subdirectories
within the directory are not copied. To copy the contents of a directory, you would need to
create a function to traverse the directory and copy each file and subdirectory individually:
         */
        try {
           // Files.copy(Paths.get("/panda"), Paths.get("/panda-save"));

            Files.copy(Paths.get("/panda/bamboo.txt"),
                    Paths.get("/panda-save/"));
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
