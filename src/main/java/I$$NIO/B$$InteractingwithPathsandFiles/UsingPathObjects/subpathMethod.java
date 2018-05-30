package I$$NIO.B$$InteractingwithPathsandFiles.UsingPathObjects;

import java.nio.file.Path;
import java.nio.file.Paths;

public class subpathMethod {
    public static void main(String[] args) {
        /*
        The method subpath(int,int) returns a relative subpath of the Path object, referenced
by an inclusive start index and an exclusive end index. It is useful for constructing a new
relative path from a particular parent path element to another parent path element, as
shown in the following example:
         */
        Path path = Paths.get("/mammal/carnivore/raccoon.image");
        System.out.println("Path is: "+path);

        System.out.println("Subpath from 0 to 3 is: "+path.subpath(0,3));
        System.out.println("Subpath from 1 to 3 is: "+path.subpath(1,3));
        System.out.println("Subpath from 1 to 2 is: "+path.subpath(1,2));

        System.out.println
                ("Subpath from 0 to 4 is: "+path.subpath(0,4)); // THROWS EXCEPTION AT RUNTIME

        System.out.println
                ("Subpath from 1 to 1 is: "+path.subpath(1,1)); // THROWS EXCEPTION AT RUNTIME

//
    }
}
