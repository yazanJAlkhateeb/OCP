package QuestionAndAnswers.q108;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

//Given the code fragments:
//هاض  انترخرا
interface CourseFilter extends Predicate<String> {
    public default boolean test(String str) {
        return str.equals("Java");
    }
    public static void main(String[] args) {
        List<String> strs = Arrays.asList("Java", "Java EE", "Java ME");
        Predicate<String> cf1 = s -> s.length() > 3;
        Predicate cf2 = new CourseFilter() {
            //line n1
            public boolean test(String s) {
                return s.contains("Java");
            }
        };
        long c = strs.stream()
                .filter(cf1)
                .filter(cf2).count();
//line n2
        System.out.println(c);
    }
}
/*What is the result?
A. 2
B. 3///answer
C. A compilation error occurs at line n1.
D. A compilation error occurs at line n2.*/