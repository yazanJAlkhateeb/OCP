package D$$FunctionalProgramming.B$$UsingStreams.B$$UsingCommonTerminalOperations;

import java.util.Optional;
import java.util.stream.Stream;

public class minANDmax {
    /*Both methods are reductions because they return a single
value after looking at the entire stream*/
    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "ape", "bonobo");
        //Optional<String> min = s.min((s1, s2) -> s1.length()-s2.length());
        Optional<String> max = s.max((k1, k2) -> k1.length() - k2.length());
        max.ifPresent(System.out::println); // ape
       // max.ifPresent(System.out::println); // ape
    }
}
