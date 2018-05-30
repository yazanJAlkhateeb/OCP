package D$$FunctionalProgramming.D$$WorkingwithAdvancedStreamPipelineConcepts.CollectingResults.CollectingUsingGroupingANDPartitioningANDMapping.groupBy;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectWithgroupingByWithList {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingBy(String::length));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }
}
