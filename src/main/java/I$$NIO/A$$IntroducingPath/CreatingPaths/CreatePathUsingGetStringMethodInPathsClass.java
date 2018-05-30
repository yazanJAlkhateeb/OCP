package I$$NIO.A$$IntroducingPath.CreatingPaths;

import java.nio.file.Path;
import java.nio.file.Paths;

public class CreatePathUsingGetStringMethodInPathsClass {


    public static void main(String[] args) {
/* The simplest and most straightforward way to obtain a Path object is using the
     java.nio.files.Paths factory class, or Paths for short. To obtain a reference to a file or
     directory, you would call the static method Paths.getPath(String) method, as shown in
     the f ­ ollowing examples:*/
        Path path1 = Paths.get("pandas/cuddly.png");

        Path path2 = Paths.get("c:\\zooinfo\\November\\employees.txt");

        Path path3 = Paths.get("/home/zoodirector");

        /*You can also create a Path using the Paths class using a vararg of type String , such as
                Paths.get(String,String...) . This allows you to create a Path from a list of String values
        in which the operating system-dependent path.separator is automatically inserted between
        elements*/
        Path path4 = Paths.get("pandas","cuddly.png");
        Path path5 = Paths.get("c:","zooinfo","November","employees.txt");
        Path path6 = Paths.get("/","home","zoodirector");
    }
}
