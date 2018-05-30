package QuestionAndAnswers.q15;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class q15 {
    public static void main(String[] args) {
    //    Given the code fragment:
        List<String> nL = Arrays.asList("Jim", "John", "Jeff");
        Function<String, String> funVal = "Hello : "::concat;
        nL.stream()
                .map(funVal)
                .peek(System.out::print);
       /* What is the result?
        A. Hello : Jim Hello : John Hello : Jeff
        B. Jim John Jeff
        C. The program prints nothing.///////answeeeeeeeeer
        D. A compilation error occurs.*/
    }
}
