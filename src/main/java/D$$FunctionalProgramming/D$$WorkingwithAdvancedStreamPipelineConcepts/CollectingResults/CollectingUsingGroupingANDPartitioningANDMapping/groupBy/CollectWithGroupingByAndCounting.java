package D$$FunctionalProgramming.D$$WorkingwithAdvancedStreamPipelineConcepts.CollectingResults.CollectingUsingGroupingANDPartitioningANDMapping.groupBy;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectWithGroupingByAndCounting {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Long> map = ohMy.collect(Collectors.groupingBy(
                String::length, Collectors.counting()));
        System.out.println(map); // {5=2, 6=1}
    }
}
