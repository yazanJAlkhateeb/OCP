package I$$NIO.B$$InteractingwithPathsandFiles.UsingPathObjects;

import java.nio.file.Path;
import java.nio.file.Paths;

public class resolveMETHOD {
    /*
    The Path interface includes a resolve(Path) method for creating a new Path by joining an
existing path to the current path. To put it another way, the object on which the resolve()
method is invoked becomes the basis of the new Path object, with the input argument beingInteracting with Paths and Files

appended onto the Path . Let’s see what happens if we apply resolve() to an absolute path
and a relative path:*/
    public static void main(String[] args) {
        final Path path1 = Paths.get("cats/../panther");
        final Path path2 = Paths.get("/food");
        System.out.println(path2.resolve(path1));

        /*
        Since the input parameter path2 is an absolute path
         */

        final Path path3 = Paths.get("/turkey/food");
        final Path path4 = Paths.get("/tiger/cage");
        System.out.println(path3.resolve(path4));
    }
}
