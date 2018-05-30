package D$$FunctionalProgramming.D$$WorkingwithAdvancedStreamPipelineConcepts.CollectingResults.CollectingUsingBasicCollectors;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectingWithAveragingInt {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Double result = ohMy.collect(Collectors.averagingInt(String::length));
        System.out.println(result); // 5.333333333333333

        Stream<Integer> ohMy2 = Stream.of(1,2, 3);
        Double result2 = ohMy2.collect(Collectors.averagingInt(x->x));
        System.out.println(result2); // 5.333333333333333
    }
}
