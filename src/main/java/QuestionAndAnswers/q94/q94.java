package QuestionAndAnswers.q94;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class q94 {
    public static void main(String[] args) {
       // Given the code fragment:
        Stream<List<String>> iStr= Stream.of (
                Arrays.asList ("1", "John"),
                Arrays.asList ("2", null));
       // Stream<String> nInSt = iStr.flatMapToInt ((x) -> x.stream ());
      //  nInSt.forEach (System.out :: print);
      //  What is the result?
       // A. 1John2null
      //  B. 12
      //  C. A NullPointerException is thrown at run time.
     // D. A compilation error occurs.///answer
    }
}
