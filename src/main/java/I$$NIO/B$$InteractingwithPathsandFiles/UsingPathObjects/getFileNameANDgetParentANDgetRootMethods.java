package I$$NIO.B$$InteractingwithPathsandFiles.UsingPathObjects;

import java.nio.file.Path;
import java.nio.file.Paths;

public class getFileNameANDgetParentANDgetRootMethods {

    public static void main(String[] args) {
      /*  getFileName() returns a new Path instance rather than a String .
                The next method, getParent() , returns a Path instance representing the parent path or
        null if there is no such parent. If the instance of the Path object is relative, this method will
        stop at the top-level element defined in the Path object. In other words, it will not traverse
        outside the working directory to the file system root.
                The last method, getRoot() , returns the root element for the Path object or null if the
        Path object is relative.*/

        Path path = Paths.get("zoo/armadillo/shells.txt");
        System.out.println("Filename is: " + path.getFileName());
        System.out.println("Root is: " + path.getRoot());

        Path currentParent = path;

        while ((currentParent = currentParent.getParent()) != null) {
            System.out.println("Current parent is:" + currentParent);

        }
    }
}
