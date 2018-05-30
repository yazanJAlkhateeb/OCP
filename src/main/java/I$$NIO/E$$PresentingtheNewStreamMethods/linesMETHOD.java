package I$$NIO.E$$PresentingtheNewStreamMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;

public class linesMETHOD {
    public static void main(String[] args) {
        /*Files.lines(Path) method that returns a Stream<String> object and
does not suffer from this same issue. The contents of the file are read and processed lazily,*/
        Path path = Paths.get("/fish/sharks.log");
        try {
            Files.lines(path).forEach(System.out::println);


        Path path1 = Paths.get("/fish/sharks.log");
            System.out.println(Files.lines(path1)
                            .filter(s -> s.startsWith("WARN "))
                            .map(s -> s.substring(5))
                            .collect(Collectors.toList()));
        } catch (IOException e) {
// Handle file I/O exception...
        }

    }
}
