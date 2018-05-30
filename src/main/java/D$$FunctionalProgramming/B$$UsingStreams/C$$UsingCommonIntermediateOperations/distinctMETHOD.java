package D$$FunctionalProgramming.B$$UsingStreams.C$$UsingCommonIntermediateOperations;

import java.util.stream.Stream;

public class distinctMETHOD {
    //The distinct() method returns a stream with duplicate values removed. The duplicates do
    //not need to be adjacent to be removed. As you might imagine, Java calls equals() to deter-
    //mine whether the objects are the same
    //Stream<T> distinct()
    public static void main(String[] args) {
        Stream<String> s = Stream.of("duck", "duck", "duck", "goose");

        Stream<String> distinct = s.distinct();
        distinct.forEach(System.out::println);
    }
}
