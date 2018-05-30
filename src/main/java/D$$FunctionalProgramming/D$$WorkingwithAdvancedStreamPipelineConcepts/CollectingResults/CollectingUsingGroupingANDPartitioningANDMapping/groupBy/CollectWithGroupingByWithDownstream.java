package D$$FunctionalProgramming.D$$WorkingwithAdvancedStreamPipelineConcepts.CollectingResults.CollectingUsingGroupingANDPartitioningANDMapping.groupBy;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectWithGroupingByWithDownstream {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, Set<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length, Collectors.toSet()));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }
}
