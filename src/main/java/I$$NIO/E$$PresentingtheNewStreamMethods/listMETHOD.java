package I$$NIO.E$$PresentingtheNewStreamMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class listMETHOD {
    public static void main(String[] args) {
        try {
            Path path = Paths.get("/home/yazan");
            Files.list(path)
                    .filter(p -> !Files.isDirectory(p))
                    .map(Path::toAbsolutePath)
                    .forEach(System.out::println);
        } catch (IOException e) {
// Handle file I/O exception...
        }
    }
}
