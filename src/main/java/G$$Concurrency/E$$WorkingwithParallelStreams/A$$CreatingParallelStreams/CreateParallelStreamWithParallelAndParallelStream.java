package G$$Concurrency.E$$WorkingwithParallelStreams.A$$CreatingParallelStreams;

import java.util.Arrays;
import java.util.stream.Stream;

public class CreateParallelStreamWithParallelAndParallelStream {

    public static void main(String[] args) {
        Stream<Integer> stream = Arrays.asList(1,2,3,4,5,6).stream();
        Stream<Integer> parallelStream = stream.parallel();
        //or
        Stream<Integer> stream2 = Arrays.asList(1,2,3,4,5,6).parallelStream();
        System.out.println(stream2.isParallel());
        Arrays.asList(1,2,3,4,5,6)
                .parallelStream()
                .forEach(s -> System.out.print(s+" "));
        System.out.println();
        Arrays.asList(1,2,3,4,5,6)
                .parallelStream()
                .forEachOrdered(s -> System.out.print(s+" "));
    }
}
