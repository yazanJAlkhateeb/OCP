package I$$NIO.B$$InteractingwithPathsandFiles.UsingPathObjects;

import java.nio.file.Path;
import java.nio.file.Paths;

public class toStringANDgetNameCountANDgetNameMethods {
    public static void main(String[] args) {
        /*
        The Path interface contains three methods to retrieve basic information about the
path representative. The first method, toString() , returns a String representation of
the entire path. In fact, it is the only method in the Path interface to return a String .
Most of the other methods that we will discuss in this section return a new Path
object.
The second and third methods, getNameCount() and getName(int) , are often
used in conjunction to retrieve the number of elements in the path and a reference to
each element, respectively. For greater compatibility with other NIO.2 methods, the
getName(int) method returns the component of the Path as a new Path object rather
than a String .
The following sample code uses these methods to retrieve path data:
         */


        /*
        For the exam, you should be aware that
the getName(int) method is zero-indexed
         */
        Path path = Paths.get("/land/hippo/harry.happy");
        System.out.println("The Path Name is: "+path);
        for(int i=0; i<path.getNameCount(); i++) {
            System.out.println(" Element "+i+" is: "+path.getName(i));
        }
        /*
        Notice that the root element / is not included in the list of names
         */

    }
}
