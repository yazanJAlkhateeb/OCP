package I$$NIO.A$$IntroducingPath.CreatingPaths;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

public class WorkingwithLegacyFileInstances {
    public static void main(String[] args) {
       /* When Path was added in Java 7, the legacy java.io.File class was updated with a new
                method, toPath() , that operates on an instance File variable:*/
        File file = new File("pandas/cuddly.png");
        Path path = file.toPath();
      /*  For backward compatibility, the Path interface also contains a method toFile () to
        return a File instance:*/
        Path path1 = Paths.get("cuddly.png");
        File file1= path1.toFile();


    }
}
