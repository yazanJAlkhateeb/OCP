package D$$FunctionalProgramming.B$$UsingStreams.C$$UsingCommonIntermediateOperations;

import java.util.stream.Stream;

public class limitANDskipMETHOD {
    //The limit() and skip() methods make a Stream smaller. They could make a fi nite stream
    //smaller, or they could make a fi nite stream out of an infi nite stream. The method signatures
    //are shown here:
    //Stream<T> limit(int maxSize)
    //Stream<T> skip(int n)
    public static void main(String[] args) {
        //The following code creates an infi nite stream of numbers counting from 1. The skip()
        //operation returns an infi nite stream starting with the numbers counting from 6, since it
        //skips the first five elements. The limit() call takes the fi rst two of those. Now we have a
        //fi nite stream with two elements:
        Stream<Integer> s = Stream.iterate(1, n -> n + 1);
// 67
        Stream<Integer> limit = s.skip(5).limit(2);
        limit.forEach(System.out::println);

    }
}
