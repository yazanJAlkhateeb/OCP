package QuestionAndAnswers.q39;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class q39 {
    public static void main(String[] args) {
    //    Given the code fragment:
        List<String> colors = Arrays.asList("red", "green", "yellow");
        Predicate<String> test = n-> {
                System.out.println("Searching...");
        return n.contains("red");
};
        colors.stream()
                .filter(c -> c.length() > 3)
                .allMatch(test);
    /*    What is the result?
        A. Searching...///answer
        B. Searching...
        Searching...
        C. Searching...
        Searching...
        Searching...
        D. A compilation error occurs.*/
    }
}
