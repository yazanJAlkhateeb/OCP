package I$$NIO.C$$InteractingwithFiles;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class isSameFileMETHOD {
    public static void main(String[] args) {
        /*
        The Files.isSameFile(Path,Path) method is useful for determining if two Path objects
relate to the same fi le within the fi le system. It takes two Path objects as input and follows
symbolic links. Despite the name, the method also determines if two Path objects refer to
the same directory.
         */
        /*
        The isSameFile() method fi rst checks if the Path objects are equal in terms of equal() ,
and if so, it automatically returns true without checking to see if either fi le exists.
         */
        /*
        This isSameFile() method does not compare the contents of the file.
         */
        try {
           // System.out.println(Files.isSameFile(Paths.get("/user/home/cobra"), Paths.get("/user/home/snake")));
          //  System.out.println(Files.isSameFile(Paths.get("/user/tree/../monkey"), Paths.get("/user/monkey")));
            System.out.println(Files.isSameFile(Paths.get("/home/yazan/yazan.pdf"), Paths.get("/home/yazan/./yazan.pdf")));
          //  System.out.println(Files.isSameFile(Paths.get("/flamingo/tail.data"), Paths.get("/cardinal/tail.data")));
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
