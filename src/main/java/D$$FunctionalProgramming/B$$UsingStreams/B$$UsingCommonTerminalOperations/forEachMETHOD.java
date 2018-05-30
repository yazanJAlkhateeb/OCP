package D$$FunctionalProgramming.B$$UsingStreams.B$$UsingCommonTerminalOperations;

import java.util.stream.Stream;

public class forEachMETHOD {
    /*calling forEach() on an infi nite stream does
not terminate. Since there is no return value, it is not a reduction.*/
    public static void main(String[] args) {
        Stream<String> s = Stream.of("Monkey", "Gorilla", "Bonobo");
        s.forEach(System.out::print);
    //    Notice that you can’t use a traditional for loop on a stream:
        Stream<Integer> d = Stream.of(1);
       // for (Integer i: d) {} // DOES NOT COMPILE
    }
}
