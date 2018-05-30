package G$$Concurrency.E$$WorkingwithParallelStreams.B$$ProcessingTasksinParallel;

import java.util.Arrays;

public class NoOrderWithParalleStream {
    /*
    The Streams API includes an alternate version of the forEach() operation called
forEachOrdered() , which forces a parallel stream to process the results in order at the
cost of performance. For example, take a look at the following code snippet:
*/
    public static void main(String[] args) {


        Arrays.asList(1, 2, 3, 4, 5, 6)
                .parallelStream()
                .forEachOrdered(s -> System.out.print(s + " "));
    }
    /*
Like our starting example, this outputs the results in order:
1 2 3 4 5 6
Since we have ordered the results, we have lost some of the performance gains of using
a parallel stream, so why use this method? You might be calling this method in a section
of your application that takes both serial and parallel streams, and you need to ensure
that the results are processed in a particular order. Also, stream operations that occur
before/after the forEachOrdered() can still gain performance improvements for using a
parallel stream.
     */
}
