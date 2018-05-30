package D$$FunctionalProgramming.C$$WorkingwithPrimitives;

import java.util.stream.IntStream;

public class rangeANDrangeClosedMethod {

    public static void main(String[] args) {
    //The range() method indicates that we want the numbers 1–6, not includ-
        //ing the number 6. However,
        IntStream range = IntStream.range(1, 6);
        range.forEach(System.out::println);

        //We should
        //be able to type the number 5, and we can do so as follows:
        IntStream rangeClosed = IntStream.rangeClosed(1, 5);
        rangeClosed.forEach(System.out::println);
    }
}
