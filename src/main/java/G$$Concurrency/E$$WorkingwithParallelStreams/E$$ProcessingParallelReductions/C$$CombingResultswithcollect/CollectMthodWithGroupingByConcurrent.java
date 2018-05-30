package G$$Concurrency.E$$WorkingwithParallelStreams.E$$ProcessingParallelReductions.C$$CombingResultswithcollect;

import java.util.List;
import java.util.concurrent.ConcurrentMap;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectMthodWithGroupingByConcurrent {
    public static void main(String[] args) {
        Stream<String> ohMy = Stream.of("lions", "tigers", "bears").parallel();
        ConcurrentMap<Integer, List<String>> map = ohMy.collect(
                Collectors.groupingByConcurrent(s->s.length()));
        System.out.println(map); // {5=[lions, bears], 6=[tigers]}
    }
}
