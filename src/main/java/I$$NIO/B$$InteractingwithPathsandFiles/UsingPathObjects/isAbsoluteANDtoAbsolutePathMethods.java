package I$$NIO.B$$InteractingwithPathsandFiles.UsingPathObjects;

import java.nio.file.Path;
import java.nio.file.Paths;

public class isAbsoluteANDtoAbsolutePathMethods {
    public static void main(String[] args) {
        /*
        The Path interface contains two methods for assisting with relative and absolute
paths. The first method, isAbsolute() , returns true if the path the object references
is absolute and false if the path the object references is relative.
         */
/*
The second method, toAbsolutePath() , converts a relative Path object to an absolute
Path object by joining it to the current working directory. If the Path object is already
absolute, then the method just returns an equivalent copy of it.
 */

        Path path2 = Paths.get("birds/condor.txt");
        System.out.println("Path2 is Absolute? "+path2.isAbsolute());
        System.out.println("Absolute Path2 "+path2.toAbsolutePath());
    }
}
