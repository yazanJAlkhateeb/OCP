package I$$NIO.B$$InteractingwithPathsandFiles.UsingPathObjects;

import java.nio.file.Path;
import java.nio.file.Paths;

public class relativizeMETHOD {
    public static void main(String[] args) {
        /*
        The relativize() method requires that both paths be absolute or both relative, and
it will throw an IllegalArgumentException if a relative path value is mixed with an
absolute path value.
         */

        /*
        The Path interface provides a method relativize(Path) for constructing the relative
path from one Path object to another. Consider the following relative and absolute path
examples using the relativize() method.
         */
        Path path1 = Paths.get("fish.txt");
        Path path2 = Paths.get("birds.txt");
        System.out.println(path1.relativize(path2));
        System.out.println(path2.relativize(path1));
   /*
   Alternatively, if both path values are absolute, then the method computes the relative
path from one absolute location to another, regardless of the current working directory.
    */
        Path path3 = Paths.get("/habitat");
        Path path4 = Paths.get("/sanctuary/raven");
        System.out.println(path3.relativize(path4));
        System.out.println(path4.relativize(path3));


       /* On Windows-based systems, it also requires that if absolute paths are used, then both
        paths must have the same root directory or drive letter. For example, the following would
        also throw an IllegalArgumentException at runtime in a Windows-based system since
        they use different roots:*/
        Path path6 = Paths.get("c:\\primate\\chimpanzee");
        Path path7 = Paths.get("d:\\storage\\bananas.txt");
        path6.relativize(path7); // THROWS EXCEPTION AT RUNTIME
    }
}
