//package D$$FunctionalProgramming.D$$WorkingwithAdvancedStreamPipelineConcepts.CollectingResults.CollectingUsingGroupingANDPartitioningANDMapping;
//
//import java.util.Comparator;
//import java.util.Map;
//import java.util.Optional;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//
//public class Mapping {
//    public static void main(String[] args) {
//        Stream<String> ohMy = Stream.of("lions", "tigers", "bears");
//        Map<Integer, Optional<Character>> map = ohMy.collect(
//                Collectors.groupingBy(String::length,
//                        Collectors.mapping(s -> s.charAt(0),Collectors.minBy(Comparator.naturalOrder()))));
//        System.out.println(map); // {5=Optional[b], 6=Optional[t]}
//    }
//}
