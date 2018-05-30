package QuestionAndAnswers.q5;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class q5 {
    public static void main(String[] args) {
        //The data.doc, data.txt and data.xml files are accessible and contain text.
        //Given the code fragment:
        Stream<Path> paths = Stream.of (Paths. get("data.doc"),
                Paths. get("data.txt"),
                Paths. get("data.xml"));
        paths.filter(s-> s.toString().endsWith("txt")).forEach(
                s -> {
                    try {
                    Files.readAllLines(s)
                            .stream()
                            .forEach(System.out::println); //line n1
                } catch (IOException e) {
            System.out.println("Exception");
        }
    }
);
/*A. The program prints the content of data.txt file. //answer
B. The program prints:
Exception
<<The content of the data.txt file>>
Exception
C. A compilation error occurs at line n1.
D. The program prints the content of the three files.*/
    }
}
