package G$$Concurrency.E$$WorkingwithParallelStreams.A$$CreatingParallelStreams;

public class isParallel {

    /*
    The Stream interface includes a method isParallel() that can be used
to test if the instance of a stream supports parallel processing. Some
operations on streams preserve the parallel attribute, while others do
not. For example, the Stream.concat(Stream s1, Stream s2) is parallel
if either s1 or s2 is parallel. On the other hand, flatMap() creates a new
stream that is not parallel by default, regardless of whether the underlying
elements were parallel.
     */
}
