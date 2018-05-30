package D$$FunctionalProgramming.B$$UsingStreams.B$$UsingCommonTerminalOperations.ReduceMethod;

import java.util.stream.Stream;

public class ReduceWithAccumulator {
    public static void main(String[] args) {
     /*   The initial value of an empty String is the identity. The accumulator combines the cur-
                rent result with the current String . With lambdas, we can do the same thing with a stream
        and reduction:*/
        Stream<String> stream = Stream.of("w", "o", "l", "f");
        String word = stream.reduce("", (s, c) -> s.concat(c));
        System.out.println(word);
    }
}
