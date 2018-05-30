package D$$FunctionalProgramming.D$$WorkingwithAdvancedStreamPipelineConcepts.CollectingResults.CollectingUsingGroupingANDPartitioningANDMapping.PartitioningBy;

import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectWithpartitioningByWithDownStream {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
        Map<Boolean, Set<String>> map = ohMy.collect(
                Collectors.partitioningBy(s -> s.length() <= 7, Collectors.toSet()));
        System.out.println(map);// {false=[], true=[lions, tigers, bears]}
    }
}
