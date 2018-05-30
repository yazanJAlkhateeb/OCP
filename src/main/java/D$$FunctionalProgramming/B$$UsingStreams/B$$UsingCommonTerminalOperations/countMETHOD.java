package D$$FunctionalProgramming.B$$UsingStreams.B$$UsingCommonTerminalOperations;

import java.util.stream.Stream;

public class countMETHOD {
    /*The count() method determines the number of elements in a finite stream*/
    /*count() is a reduction because it looks at each element in the stream and
returns a single value*/

    public static void main(String[] args) {
        Stream<String> s = Stream.of("monkey", "gorilla", "bonobo");
// 3
        long count = s.count();
        System.out.println(count);
    }
}
