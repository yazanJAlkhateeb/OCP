package D$$FunctionalProgramming.B$$UsingStreams.C$$UsingCommonIntermediateOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class flatMapMETHOD {
    //The flatMap() method takes each element in the stream and makes any elements it con-
    //tains top-level elements in a single stream. This is helpful when you want to remove empty
    //elements from a stream or you want to combine a stream of lists.
    public static void main(String[] args) {
        List<String> zero = Arrays.asList();
        List<String> one = Arrays.asList("Bonobo");
        List<String> two = Arrays.asList("Mama Gorilla", "Baby Gorilla");
        Stream<List<String>> animals = Stream.of(zero, one, two);
        Stream<String> stringStream = animals.flatMap(l -> l.stream());
        stringStream.forEach(System.out::println);
    }
}
