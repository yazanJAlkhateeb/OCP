package I$$NIO.B$$InteractingwithPathsandFiles.UsingPathObjects;

import java.nio.file.Paths;

public class ConceptOFChain {
    public static void main(String[] args) {


    /*
    Many of the methods in the Path interface transform the path value in some way and
return a new Path object, allowing the methods to be chained. We demonstrate chaining in
the following example, the details of which we’ll discuss in this section of the chapter.
*/
        System.out.println(  Paths.get("/zoo/../home").getParent().normalize().toAbsolutePath());

    }

}
