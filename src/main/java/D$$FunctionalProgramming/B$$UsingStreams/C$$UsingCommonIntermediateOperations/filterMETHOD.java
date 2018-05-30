package D$$FunctionalProgramming.B$$UsingStreams.C$$UsingCommonIntermediateOperations;

import java.util.stream.Stream;

public class filterMETHOD {
    //The filter() method returns a Stream with elements that match a given expression. Here
    //is the method signature:
    //Stream<T> filter(Predicate<? super T> predicate)
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        s.filter(x -> x.startsWith("m")).forEach(System.out::print);
    }
}
