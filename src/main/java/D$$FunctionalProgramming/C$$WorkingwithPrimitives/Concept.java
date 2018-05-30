package D$$FunctionalProgramming.C$$WorkingwithPrimitives;

import java.util.OptionalDouble;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Concept {

    //Here are three types of primitive streams:
    //■ ■ IntStream : Used for the primitive types int , short , byte , and char
    //■ ■ LongStream : Used for the primitive type long
    //■ ■ DoubleStream : Used for the primitive types double and float
    public static void main(String[] args) {

        Stream<Integer> stream = Stream.of(1, 2, 3);
        IntStream intStream = stream.mapToInt(x -> x);

        System.out.println(intStream.sum());
        IntStream intStream2 = IntStream.of(1, 2, 3);
        OptionalDouble avg = intStream2.average();
        System.out.println(avg.getAsDouble());
    }
}
