package QuestionAndAnswers.q34;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

public class q34 {
    public static void main(String[] args) {
        //   Given the code fragment:
        List<Integer> list1 = Arrays.asList(10, 20);
        List<Integer> list2 = Arrays.asList(15, 30);
//line n1
        //   Which code fragment, when inserted at line n1, prints 10 20 15 30?
        Stream.of(list1, list2)
                .flatMap(integers -> integers.stream())
                .forEach(s -> System.out.print(s + " "));
//        B. Stream.of(list1, list2)
//                .flatMap(list -> list.intStream())
//                .forEach(s -> System.out.print(s + " "));
//        Visit us athttps://www.examsboost.com/test/1z0-809/C. list1.stream()
//.flatMap(list2.stream().flatMap(e1 -> e1.stream())
//                .forEach(s -> System.out.println(s + " "));
//        D. Stream.of(list1, list2)
//                .flatMapToInt(list -> list.stream())
//                .forEach(s -> System.out.print(s + " "));
    }
}
