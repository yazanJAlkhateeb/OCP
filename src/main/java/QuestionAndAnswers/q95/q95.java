package QuestionAndAnswers.q95;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class q95 {
    public static void main(String[] args) {
  //      Given the code fragment:
        Path file = Paths.get ("courses.txt");
// line n1
     /*   Assume the courses.txt is accessible.
                Which code fragment can be inserted at line n1 to enable the code to print the content of the*/
        //courses.txt file?
      /*  A. List<String> fc = Files.list(file);
        fc.stream().forEach (s - > System.out.println(s));
        B. Stream<String> fc = Files.readAllLines (file);
        fc.forEach (s - > System.out.println(s));
      //  C. List<String> fc = readAllLines(file);
        //fc.stream().forEach (s - > System.out.println(s));
        D. Stream<String> fc = Files.lines (file);///answer
        fc.forEach (s - > System.out.println(s));*/
    }
}
