package I$$NIO.B$$InteractingwithPathsandFiles.UsingPathObjects;

import java.nio.file.Path;
import java.nio.file.Paths;

public class normalizeMETHOD {
    public static void main(String[] args) {
        /*
        Java provides us with the normalize(Path)
method to eliminate the redundancies in the path
         */
        Path path3 = Paths.get("/home/home/yazan");
        Path path4 = Paths.get("/user/home");

        Path relativePath = path3.relativize(path4);
        System.out.println(path3.resolve(relativePath));
        System.out.println(path3.resolve(relativePath).normalize());
    }
}
