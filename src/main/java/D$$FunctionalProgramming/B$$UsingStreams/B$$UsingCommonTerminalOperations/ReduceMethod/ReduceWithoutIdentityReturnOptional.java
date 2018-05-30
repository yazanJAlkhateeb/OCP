package D$$FunctionalProgramming.B$$UsingStreams.B$$UsingCommonTerminalOperations.ReduceMethod;

import java.util.Optional;
import java.util.stream.Stream;

public class ReduceWithoutIdentityReturnOptional {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(3, 5, 6);
        Optional<Integer> reduce = stream.reduce((a, b) -> a * b);
        reduce.ifPresent(System.out::println);
    }
}
