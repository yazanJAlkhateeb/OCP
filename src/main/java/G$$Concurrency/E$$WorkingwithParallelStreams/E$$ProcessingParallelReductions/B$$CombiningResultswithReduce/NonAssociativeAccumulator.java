package G$$Concurrency.E$$WorkingwithParallelStreams.E$$ProcessingParallelReductions.B$$CombiningResultswithReduce;

import java.util.Arrays;

public class NonAssociativeAccumulator {
    public static void main(String[] args) {
        System.out.println(
        Arrays.asList(1, 2, 3)
                .parallelStream()
                .reduce(0, (a, b) -> (a + b)));
    }
}
