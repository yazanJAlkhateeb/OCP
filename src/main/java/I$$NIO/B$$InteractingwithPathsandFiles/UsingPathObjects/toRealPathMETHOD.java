package I$$NIO.B$$InteractingwithPathsandFiles.UsingPathObjects;

import java.io.IOException;
import java.nio.file.Paths;

public class toRealPathMETHOD {
    /*
    The toRealPath(Path) method takes a Path object that may or may not point to an
existing file within the file system, and it returns a reference to a real path within the file
system. It is similar to the toAbsolutePath() method in that it can convert a relative path
to an absolute path,
     */
        /*
        It
is also the only Path method to support the NOFOLLOW_LINKS option.
         */
        /*
        The toRealPath() method performs additional steps, such as removing redundant path
elements. In other words, it implicitly calls normalize() on the resulting absolute path
         */
    public static void main(String[] args) {
        try {
         //   System.out.println(Paths.get("/home/yazan").toRealPath());


           System.out.println(Paths.get("../.././yazan.pdf").toRealPath());
           System.out.println(Paths.get(".").toRealPath());
        } catch (IOException e) {
            System.out.println("not");
        }
    }
}
