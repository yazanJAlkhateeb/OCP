package QuestionAndAnswers.q13;

import java.util.function.ToIntFunction;

public class q13 {
    public static void main(String[] args) {
        String str = "Java is a programming language";
        ToIntFunction<String> indexVal = (s)->s.indexOf(s); //line n1
        int x = indexVal.applyAsInt("Java");
        System.out.println(x);
        //What is the result?
        ////line n2
        //A. 0/////////////////////////answer
        //B. 1
        //C. A compilation error occurs at line n1.
        //D. A compilation error occurs at line n2
    }
}
