package D$$FunctionalProgramming.B$$UsingStreams.B$$UsingCommonTerminalOperations;

import java.util.stream.Stream;

public class findAnyANDfindFirst {
    /*return an element of the stream unless the stream
is empty. If the stream is empty, they return an empty Optional*/

    /*These methods are terminal operations but not reductions. The reason is that they some-
    times return without processing all of the elements. This means that they return a value
    based on the stream but do not reduce the entire stream into one value.*/
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
        Stream<String> infinite = Stream.generate(() -> "chimp");
        s.findAny().ifPresent(System.out::println); // monkey
        infinite.findAny().ifPresent(System.out::println); // chimp
    }
}
