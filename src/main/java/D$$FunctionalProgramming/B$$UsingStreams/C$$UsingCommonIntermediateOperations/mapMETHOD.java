package D$$FunctionalProgramming.B$$UsingStreams.C$$UsingCommonIntermediateOperations;

import java.util.stream.Stream;

public class mapMETHOD {
    //The map() method creates a one-to-one mapping from the elements in the stream to the ele-
    //ments of the next step in the stream

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<Integer> integerStream = s.map(s1 -> s1.length());

    }
}
