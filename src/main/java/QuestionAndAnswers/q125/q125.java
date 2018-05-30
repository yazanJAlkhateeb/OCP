package QuestionAndAnswers.q125;

import java.util.Arrays;
import java.util.List;

public class q125 {
    public static void main(String[] args) {
     //   Given the code fragment:
        List<String> empDetails = Arrays.asList("100, Robin, HR",
                "200, Mary, AdminServices",
                "101, Peter, HR");
                empDetails.stream()
                        .filter(s-> s.contains("1"))
                        .sorted()
                        .forEach(System.out::println); //line n1
      //  What is the result?
/*
        A. 100, Robin, HR///answer
        101, Peter, HR
        B. E. A compilation error occurs at line n1.
                C. 100, Robin, HR
        101, Peter, HR
        200, Mary, AdminServices
        D. 100, Robin, HR
        200, Mary, AdminServices
        101, Peter, HR*/
    }
}

