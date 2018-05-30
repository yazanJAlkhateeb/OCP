package G$$Concurrency.E$$WorkingwithParallelStreams.D$$UnderstandingIndependentOperations;

import java.util.Arrays;

public class IndependentOperationsParalleStream {

    /*
    Parallel streams can improve performance because they rely on the property that many stream
operations can be executed independently. By independent operations, we mean that the results
of an operation on one element of a stream do not require or impact the results of another
element of the stream.
     */

    public static void main(String[] args) {
        Arrays.asList("jackal","kangaroo","lemur")
                .parallelStream()
                .map(s -> s.toUpperCase())
                .forEach(System.out::println);
    }
}
