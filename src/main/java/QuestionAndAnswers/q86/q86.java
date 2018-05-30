package QuestionAndAnswers.q86;

import java.util.Arrays;
import java.util.List;

public class q86 {
    public static void main(String[] args) {
     //   Given the code fragment:
        List<Integer> values = Arrays.asList (1, 2, 3);
        values.stream ()
                .map(n -> n*2)
//line n1
                .peek(System.out::print)
//line n2
                .count();
      /*  What is the result?
        A. 246///answer
        B. The code produces no output.
                C. A compilation error occurs at line n1.
        D. A compilation error occurs at line n2.*/
    }
}

