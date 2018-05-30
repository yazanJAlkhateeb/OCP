package D$$FunctionalProgramming.B$$UsingStreams.CreatingSreamSource;

import java.util.stream.Stream;

public class GenerateAndIterateMethods {
    public static void main(String[] args) {
        Stream<Double> randoms = Stream.generate(()->1.0);
        //when we start using it, it will  destroy the memory
      //  randoms.forEach(System.out::println);
         Stream.iterate(1, n -> n + 2);


    }
}
