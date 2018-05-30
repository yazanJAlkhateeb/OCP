package D$$FunctionalProgramming.B$$UsingStreams.C$$UsingCommonIntermediateOperations;

import java.util.stream.Stream;

public class peekMETHOD {
    //It is useful for debugging because it
    //allows us to perform a stream operation without actually changing the stream.
    //signature is as follows:
    //Stream<T> peek(Consumer<? super T> action)

    public static void main(String[] args) {
        Stream<String> stream = Stream.of("black bear", "brown bear", "grizzly");
         stream.filter(s -> s.startsWith("g"))
// grizzly
                .peek(System.out::println);
// 1

   /////////////////////////////////////////////////////////
       /* We can add a proper peek() operation:
        StringBuilder builder = new StringBuilder();
        Stream<List<?>> good = Stream.of(numbers, letters);
        good.peek(l -> builder.append(l)).map(List::size).forEach(System.out::print); // 11
        System.out.println(builder); // [1][a]
        In this example, you can see that peek() updates a StringBuilder variable that doesn’t
        affect the result of the stream pipeline. It still prints 11 . Java doesn’t prevent us from writ-
                ing bad peek code:
        Stream<List<?>> bad = Stream.of(numbers, letters);
        bad.peek(l -> l.remove(0)).map(List::size).forEach(System.out::print);
// 00
        This example is bad because peek() is modifying the data structure that is used in the
        stream, which causes the result of the stream pipeline to be different than if the peek
        wasn’t present.*/
    }
}
